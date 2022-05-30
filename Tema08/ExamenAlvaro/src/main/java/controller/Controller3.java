package controller;

import com.google.gson.Gson;
import model.Cartelera;
import netscape.javascript.JSObject;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class Controller3 {
    /*
    Realiza un programa se le permita al usuario mediante un menú:
        1. Ver películas en cartelera
        (https://api.themoviedb.org/3/movie/now_playing?api_key=4ef66e12cddbb8fe9d4fd03ac9632f6e&language=en-US&page=1)
        2. Ver películas próximamente
        (https://api.themoviedb.org/3/movie/upcoming?api_key=4ef66e12cddbb8fe9d4fd03ac9632f6e&language=en-US&page=1)
        Según la elección del usuario el sistema deberá:
        1. Mostrar por pantalla el título, fecha de lanzamiento y descripción de las
        películas seleccionadas
        2. Mostrará una lista de los carteles (poster_path). Hay que tener en cuenta lo
        siguiente
        a. La respuesta obtenida es por ejemplo:
        /uoMyXY1ReK5I1kkMMQfqod7YhXh.jpg
        b. A esta respuesta hay que sumarle el siguiente string:
        https://image.tmdb.org/t/p/w500/
        c. El resultado deberá ser el siguiente:
        https://image.tmdb.org/t/p/w500/uoMyXY1ReK5I1kkMMQfqod7YhXh.j
        pg

        3. Convertirá todas las películas leídas en objetos de tipo java
        4. Las introducirá en un Arraylist y las escribirá dentro de un fichero llamado
        cartelera.bin o proximamente.bin
     */

    ArrayList<Cartelera> listaCartelera;

    public void verCartelera(){
        if(listaCartelera==null){
            listaCartelera = new ArrayList<>();
        }
        String urlString = "https://api.themoviedb.org/3/movie/now_playing?api_key=4ef66e12cddbb8fe9d4fd03ac9632f6e&language=en-US&page=1";

        BufferedReader reader = null;
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder stringBuilder = new StringBuilder();
            String linea = null;

            while ((linea = reader.readLine()) != null){
                stringBuilder.append(linea);
            }

            JSONObject jsonObject = new JSONObject(stringBuilder.toString());
            JSONArray arrayResultados = jsonObject.getJSONArray("results");
            for (int i = 0; i < arrayResultados.length(); i++) {
                JSONObject objetoResultado = arrayResultados.getJSONObject(i);
                Gson gson = new Gson();
                Cartelera nameJAVA = gson.fromJson(objetoResultado.toString(), Cartelera.class);
                String title = objetoResultado.getString("original_title");
                String overview = objetoResultado.getString("overview");
                String date = objetoResultado.getString("release_date");
                String poster_path = objetoResultado.getString("poster_path");

                listaCartelera.add(nameJAVA);
                System.out.println("Title: "+title);
                System.out.println("Overview: "+overview);
                System.out.println("Release date: "+date);
                System.out.println("Poster: "+"https://image.tmdb.org/t/p/w500/"+poster_path);
                System.out.println("--------------------------");
            }


            } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null){
                    reader.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public void verProximamente(){
        if(listaCartelera==null){
            listaCartelera = new ArrayList<>();
        }
        String urlString = "https://api.themoviedb.org/3/movie/upcoming?api_key=4ef66e12cddbb8fe9d4fd03ac9632f6e&language=en-US&page=1";

        BufferedReader reader = null;
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder stringBuilder = new StringBuilder();
            String linea = null;

            while ((linea = reader.readLine()) != null){
                stringBuilder.append(linea);
            }

            JSONObject jsonObject = new JSONObject(stringBuilder.toString());
            JSONArray arrayResultados = jsonObject.getJSONArray("results");
            for (int i = 0; i < arrayResultados.length(); i++) {
                JSONObject objetoResultado = arrayResultados.getJSONObject(i);
                Gson gson = new Gson();
                Cartelera nameJAVA = gson.fromJson(objetoResultado.toString(), Cartelera.class);
                String title = objetoResultado.getString("original_title");
                String overview = objetoResultado.getString("overview");
                String date = objetoResultado.getString("release_date");
                String poster_path = objetoResultado.getString("poster_path");

                listaCartelera.add(nameJAVA);
                System.out.println("Title: "+title);
                System.out.println("Overview: "+overview);
                System.out.println("Release date: "+date);
                System.out.println("Poster: "+"https://image.tmdb.org/t/p/w500/"+poster_path);
                System.out.println("--------------------------");
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null){
                    reader.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public void escribirCartelera(){
        File file = new File("src/main/resources/cartelera.bin");
        ObjectOutputStream objectOutputStream = null;

        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(listaCartelera);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (objectOutputStream != null) {
                    objectOutputStream.close();

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void escribirProximamente(){
        File file = new File("src/main/resources/proximamente.bin");
        ObjectOutputStream objectOutputStream = null;

        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(listaCartelera);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (objectOutputStream != null) {
                    objectOutputStream.close();

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
