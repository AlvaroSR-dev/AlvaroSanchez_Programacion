package Ficheros;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class FicherosController {
    Scanner in = new Scanner(System.in);
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public void getFileInfo(File file){
        System.out.println("Informacion de fichero");
        System.out.println("Es directorio? "+file.isDirectory());
        System.out.println("Es fichero? "+file.isFile());
        System.out.println("Existe? "+file.exists());
        System.out.println("Padre "+file.getParent());
        System.out.println("Nombre "+file.getName());
        System.out.println("Ruta Absoluta "+file.getAbsolutePath());
        System.out.println("Ruta Relativa "+file.getPath());
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void getDirectoryInfo(File file){
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (file.isDirectory()){
            String[] nombreFicheros = file.list();
            File[] ficheros = file.listFiles();
            for ( File fichero :ficheros) {
                System.out.println(fichero.getName());
            }
            //System.out.println(ficheros);
            //System.out.println(nombreFicheros);
            /*for ( String nombre : nombreFicheros ) {
                System.out.println(nombre);
            }*/
        }
    }
    public void lecturaFichero(File file) {

        FileReader fileReader =null;

        try {
            fileReader = new FileReader(file);
            /*int lectura = fileReader.read();
            System.out.println(lectura);
            int lectura2 = fileReader.read();
            System.out.println(lectura2);*/
            int lectura=0;
            /*do{
                lectura = fileReader.read();
                if (lectura>-1) {
                    System.out.println(lectura);
                }
            } while (lectura!=-1);*/
            /*while (lectura!=-1){
                lectura = fileReader.read();
                System.out.println(lectura);
            }*/
            while ((lectura=fileReader.read())!=-1){
                System.out.println((char) lectura);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
    public void lecturaBuffer(File file){


        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            //String linea = bufferedReader.readLine();
            //System.out.println(linea);
            String lectura = null;
            String lecturaCompleta = "";
            while ((lectura = bufferedReader.readLine())!=null){
                //lectura = bufferedReader.readLine();
                System.out.println(lectura);
                lecturaCompleta+=lectura;
                lecturaCompleta+="\n";
            }
            System.out.println("La lectura completa es: ");
            System.out.println(lecturaCompleta);



            // imprimir toda la lectura completa
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void escrituraFichero(File file){

        FileWriter fileWriter = null;
        String lineaEscribir = "Esto es un ejemplo de una linea a escribir dento del fichero";


        try {
            fileWriter = new FileWriter(file);
            fileWriter.write(101);

        }catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void escribirFicheroCompleto(File file){
        FileWriter fileWriter= null;
        BufferedWriter bufferedWriter = null;
        PrintWriter printWriter = null;

        try {
            fileWriter = new FileWriter(file);
            printWriter = new PrintWriter(fileWriter);
            printWriter.println("Esto es un ejemplo de linea");
            printWriter.println("Esto es un ejemplo de linea segunda");
            printWriter.println("Esto es un ejemplo de linea tercera");
            /*bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Esto es un ejemplo");
            bufferedWriter.newLine();
            bufferedWriter.write("Esto es un ejemplo de linea nueva");
            bufferedWriter.newLine();*/

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

                /*if (bufferedWriter != null) {
                    //fileWriter.close();
                    bufferedWriter.close();
                }*/
            if (printWriter != null) {
                //fileWriter.close();
                printWriter.close();
            }
        }


    }

    public void escribirEntrada(File file){
        int opcion = 0;
        String linea = "";
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;

        do {
            try {
                System.out.println("Introduce linea");
                linea = bufferedReader.readLine();
                fileWriter = new FileWriter(file, true);
                printWriter = new PrintWriter(fileWriter);
                printWriter.println(linea);
            }catch (IOException e){
                e.printStackTrace();
            }
            System.out.println("¿Quieres crear más líneas? Sí(1) / No(0)");
            opcion = in.nextInt();
        }while (opcion != 0);

        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String lectura = "";
            while ((lectura = bufferedReader.readLine()) != null){
                
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}