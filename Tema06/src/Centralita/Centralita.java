package Centralita;

import java.util.ArrayList;

public final class Centralita {
    protected ArrayList<Llamada> listaLlamadas;
    public Centralita(){
        listaLlamadas = new ArrayList();
    }

    public void registrarLlamada(Llamada llamada){
        listaLlamadas.add(llamada);
    }

    public void mostrarLlamadas(){
        for (Llamada item : listaLlamadas) {
            item.mostrarDatos();
        }
    }

    public double mostrarCostes(){
        double costeTotal = 0;
        for (Llamada item: listaLlamadas) {
            costeTotal += item.coste;
        }
        System.out.println("Coste total: "+costeTotal);
        return costeTotal;
    }
}
