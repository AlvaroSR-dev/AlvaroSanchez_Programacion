package Supermercado;

import java.util.ArrayList;

public final class Supermercado<T> {
    private ArrayList<T> listaGenero;

    public Supermercado(ArrayList<T> listaGenero) {
        this.listaGenero = new ArrayList<>();
    }

    public void anadirGenero(T genero){
        listaGenero.add(genero);
    }

    public void listarDatos(){
        for ( T item : listaGenero ) {
            if (item instanceof Alimento){
                ((Alimento) item).mostrarDatos();
            } else if (item instanceof Mueble){
                ((Mueble) item).mostrarDatos();
            }
        }
    }

    public void mostrarPreciosFinal(){
        double precioTotal = 0;
        for ( T item : listaGenero ) {
            if (item instanceof Alimento){
                precioTotal += ((Alimento) item).getPrecio();
            } else if (item instanceof Mueble){
                precioTotal += ((Mueble) item).getPrecio();
            }
        }
    }
}
