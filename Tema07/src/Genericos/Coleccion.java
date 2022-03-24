package Genericos;

import java.util.ArrayList;

public class Coleccion<T> {
    private ArrayList<T> listaCosas;

    public Coleccion() {
        this.listaCosas = new ArrayList<>();
    }

    public void agregarCosas(T cosa){
        listaCosas.add(cosa);
    }
}
