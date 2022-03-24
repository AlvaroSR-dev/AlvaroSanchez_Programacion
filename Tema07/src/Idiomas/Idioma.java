package Idiomas;

/*

Crear una clase Idioma con los siguientes atributos:
    string nombre -
    int numeroHablantes -
    ArrayList palabras -
    Que tenga un constructor que pida el nombre y el número de hablantes -

    Y que tenga los siguientes métodos:

        saludar(): abstracto -
        despedir(): abstracto -
        ingresarPalabra(string palabra): agregará una palabra al diccionario -
        listarPalabras(): mostrará todas las palabras del diccionario, poniendo antes el mensaje "Las palabras en XXX son" -
        getter y setter correspondientes -

 */

import java.util.ArrayList;

public abstract class Idioma {
    protected String nombre;
    protected int numeroHablantes;
    protected ArrayList<String> palabras;

    public Idioma() {
        palabras = new ArrayList();
    }

    public Idioma(String nombre, int numeroHablantes) {
        this.nombre = nombre;
        this.numeroHablantes = numeroHablantes;
        palabras = new ArrayList();
    }

    public abstract void saludar();

    public abstract void despedir();

    public void ingresarPalabra(String palabra){
        palabras.add(palabra);
    }

    public void listarPalabras(){
        System.out.println("Idioma: "+nombre);
        System.out.println("Número de hablantes: "+numeroHablantes);
        for (int i = 0; i < palabras.size(); i++) {
            System.out.println(palabras.get(i));
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroHablantes() {
        return numeroHablantes;
    }

    public void setNumeroHablantes(int numeroHablantes) {
        this.numeroHablantes = numeroHablantes;
    }

    public ArrayList getPalabras() {
        return palabras;
    }

    public void setPalabras(ArrayList palabras) {
        this.palabras = palabras;
    }
}
