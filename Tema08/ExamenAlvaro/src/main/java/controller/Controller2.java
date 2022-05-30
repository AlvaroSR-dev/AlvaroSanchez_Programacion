package controller;

import model.Personaje;

import java.io.*;
import java.util.ArrayList;

public class Controller2 {
    private ArrayList<Personaje> listaPersonajes;

    public Controller2() {
        listaPersonajes = new ArrayList<>();
    }

    public void existeFichero() {
        File file = new File("src/main/resources/personajes.bin");
        if (file.exists()) {
            lecturaPersonajes(false);
        }
    }

    public void mostrarDatosPersonaje(Personaje personaje) {
        System.out.println("Nombre: " + personaje.getName());
        System.out.println("Apellido: " + personaje.getPhoto());
    }

    public void lecturaPersonajes(boolean lectura){
        File file = new File("src/main/resources/personajes.bin");
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            Personaje item = null;
            try {
                if (!lectura){
                    listaPersonajes = (ArrayList<Personaje>) ois.readObject();
                }else{
                    while ((item = (Personaje) ois.readObject()) != null){
                        mostrarDatosPersonaje(item);
                    }
                }
            }catch (EOFException e){
                System.out.println("Leído");
            }
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }finally {
            try {
                if (ois != null){
                    ois.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }

}
