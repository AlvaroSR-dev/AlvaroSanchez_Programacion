package controller;

import database.SchemeDB;

import java.sql.*;

public class ControllerDB {
    Connection connection;

    /* String newConnectionURL = "jdbc:mysql://" + host + "/" + dtbs + "?" + "user=" + user + "&password=" + pass;
    conn = (java.sql.Connection) DriverManager.getConnection(newConnectionURL); */

    public void getConnection() throws SQLException {
        try {
            connection = DriverManager.getConnection(SchemeDB.url);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void closeConnection(){
        try{
            if(connection != null){
                connection.close();
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public void insertarPerfiles(){
        Statement statement = null;
        try {
            getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            statement = connection.createStatement();
            String query1 = "INSERT INTO perfiles (nombre) VALUES ('Gerente')";
            String query2 = "INSERT INTO perfiles (nombre) VALUES ('Trabajador')";
            String query3 = "INSERT INTO perfiles (nombre) VALUES ('Director')";

            statement.execute(query1);
            statement.execute(query2);
            statement.execute(query3);
        } catch (SQLException e) {
            throw new RuntimeException();
        } finally {
            try {
                statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            closeConnection();
        }
    }

    public void selectSueldos(int sueldoParametro){
        try {
            getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        Statement statement = null;

        try {
            statement = connection.createStatement();
            String query = "SELECT * FROM %s WHERE %s > %d";
            String queryFormat = String.format(query, SchemeDB.TAB_USUARIOS, SchemeDB.COL_SUELDO, sueldoParametro);
            ResultSet rows = statement.executeQuery(queryFormat);
            rows.first();
            do{
                String nombre = rows.getString(SchemeDB.COL_NOMBRE);
                int sueldo = rows.getInt(SchemeDB.COL_SUELDO);
                System.out.println(nombre);
                System.out.println(sueldo);
            }while (rows.next());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
