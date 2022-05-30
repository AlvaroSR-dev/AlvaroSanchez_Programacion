package controller;

import database.SchemeDB;
import model.Factura;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;

public class ControllerJSON {
    String urlJson = "https://run.mocky.io/v3/f608b6c0-260b-4600-a929-be12fac14261";

    private ArrayList<Factura> listaFacturas;
    private ArrayList<Factura> listaFiltradas;

    private Connection conn;
    private Statement statement;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    private void getConnection(){
        String host = SchemeDB.URL_SERVER;
        String dtbs = SchemeDB.DB_NAME;
        String user = "root";
        String pass = "root";

        String newConnectionURL = "jdbc:mysql://" + host + "/" + dtbs
                + "?" + "user=" + user + "&password=" + pass;

        try {
            conn = DriverManager.getConnection(newConnectionURL);
            System.out.println(conn.getCatalog());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void closeConnection(){
        try {
            if (conn!= null){
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void leerFacturas(){
        if(listaFacturas==null){
            listaFacturas = new ArrayList<>();
        }

        BufferedReader reader =null;
        try {
            URL url = new URL(urlJson);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder stringBuffer = new StringBuilder();
            String linea = null;

            while ((linea=reader.readLine())!=null){
                stringBuffer.append(linea);
            }

            JSONObject jsonObject = new JSONObject(stringBuffer.toString());
            JSONArray arrayResultados = jsonObject.getJSONArray("results");

            for (int i = 0; i < arrayResultados.length(); i++) {
                JSONObject objetoResultado = arrayResultados.getJSONObject(i);
                System.out.println("---- Factura ----");
                String id = objetoResultado.getString("_id");
                System.out.println(id);
                String compania = objetoResultado.getString("company");
                System.out.println(compania);
                String tlf = objetoResultado.getString("phone");
                System.out.println(tlf);
                int invoice = objetoResultado.getInt("invoice");
                System.out.println(invoice);

                listaFacturas.add(new Factura(id,compania,tlf,invoice));
            }
            try {
                getConnection();
                statement = conn.createStatement();

                String truncate = String.format("TRUNCATE TABLE factura");
                int numeroRow = statement.executeUpdate(truncate);

                for (int i = 0; i < listaFacturas.size(); i++) {

                  String queryFormat = String.format("INSERT INTO %s (%s, %s, %s, %s) VALUES ('%s','%s','%s',%d)",
                  SchemeDB.TABLA, SchemeDB.COL_ID, SchemeDB.COL_COMPANIA, SchemeDB.COL_TLF, SchemeDB.COL_TOTAL,
                  listaFacturas.get(i).get_id(), listaFacturas.get(i).getCompany(), listaFacturas.get(i).getPhone(), listaFacturas.get(i).getInvoice());

                    if (statement.executeUpdate(queryFormat)>0){
                        System.out.println("Factura insertada");
                    }

                };

            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                closeConnection();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void buscarTotal(int total){
        getConnection();
        Statement statement = null;
        try {
            statement = conn.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        String truncate = String.format("TRUNCATE TABLE filtrada");
        try {
            int numeroRow = statement.executeUpdate(truncate);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        try {
            statement = conn.createStatement();
            String query = "SELECT * FROM %s WHERE %s >= %d";
            String queryFormat = String.format(query,SchemeDB.TABLA, SchemeDB.COL_TOTAL, total);
            ResultSet rows = statement.executeQuery(queryFormat);

            if(listaFiltradas==null){
                listaFiltradas = new ArrayList<>();
            }
            while (rows.next()){
                String id = rows.getString(SchemeDB.COL_ID);
                String compania = rows.getString(SchemeDB.COL_COMPANIA);
                String tlf = rows.getString(SchemeDB.COL_TLF);
                int invoice = rows.getInt(SchemeDB.COL_TOTAL);

                Factura factura = new Factura(id,compania,tlf,invoice);

                listaFiltradas.add(new Factura(id,compania,tlf,invoice));

                System.out.println("---- Factura filtrada ---- \n"+
                        "ID: " + factura.get_id() +
                        "\nNombre: " + factura.getCompany() +
                        "\nTeléfono: " + factura.getPhone() +
                        "\nTotal: " + factura.getInvoice());
            }
            for (int i = 0; i < listaFiltradas.size(); i++) {

                String insert = String.format("INSERT INTO %s (%s, %s, %s, %s) VALUES ('%s','%s','%s',%d)",
                        SchemeDB.FILTRADA, SchemeDB.COL_ID, SchemeDB.COL_COMPANIA, SchemeDB.COL_TLF, SchemeDB.COL_TOTAL,
                        listaFiltradas.get(i).get_id(), listaFiltradas.get(i).getCompany(), listaFiltradas.get(i).getPhone(), listaFiltradas.get(i).getInvoice());

                if (statement.executeUpdate(insert)>0){
                    System.out.println("Factura filtrada insertada");
                }

            };
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void buscarPais(String pais){
        getConnection();
        Statement statement = null;
        try {
            statement = conn.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        String truncate = String.format("TRUNCATE TABLE filtrada");
        try {
            int numeroRow = statement.executeUpdate(truncate);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        try {
            statement = conn.createStatement();
            String query = "SELECT * FROM %s WHERE %s = %s";
            String queryFormat = String.format(query,SchemeDB.TABLA, SchemeDB.COL_TOTAL, pais);
            ResultSet rows = statement.executeQuery(queryFormat);

            if(listaFiltradas==null){
                listaFiltradas = new ArrayList<>();
            }
            while (rows.next()){
                String id = rows.getString(SchemeDB.COL_ID);
                String compania = rows.getString(SchemeDB.COL_COMPANIA);
                String tlf = rows.getString(SchemeDB.COL_TLF);
                int invoice = rows.getInt(SchemeDB.COL_TOTAL);

                Factura factura = new Factura(id,compania,tlf,invoice);

                listaFiltradas.add(new Factura(id,compania,tlf,invoice));

                System.out.println("---- Factura filtrada ---- \n"+
                        "ID: " + factura.get_id() +
                        "\nNombre: " + factura.getCompany() +
                        "\nTeléfono: " + factura.getPhone() +
                        "\nTotal: " + factura.getInvoice());
            }
            for (int i = 0; i < listaFiltradas.size(); i++) {

                String insert = String.format("INSERT INTO %s (%s, %s, %s, %s) VALUES ('%s','%s','%s',%d)",
                        SchemeDB.FILTRADA, SchemeDB.COL_ID, SchemeDB.COL_COMPANIA, SchemeDB.COL_TLF, SchemeDB.COL_TOTAL,
                        listaFiltradas.get(i).get_id(), listaFiltradas.get(i).getCompany(), listaFiltradas.get(i).getPhone(), listaFiltradas.get(i).getInvoice());

                if (statement.executeUpdate(insert)>0){
                    System.out.println("Factura filtrada insertada");
                }

            };
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
