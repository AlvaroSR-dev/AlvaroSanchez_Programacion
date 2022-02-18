package Centralita;

import java.util.ArrayList;

public final class Centralita {
    private ArrayList<Llamada> listaLlamadas;
    double costeTotal = 0;
    public Centralita(){
        listaLlamadas = new ArrayList();
    }

    public void agregarLlamada(Llamada llamada){
        listaLlamadas.add(llamada);
        llamada.mostrarDatos();
    }

    public void mostrarLlamadas(String tipo){
        for (Llamada item : listaLlamadas) {
            /*if (tipo.equalsIgnoreCase("Provincial")){
                if (item instanceof LlamadaProvincial){
                    item.mostrarDatos();

                }
            }*/
        }
    }

    public void listarNacionales(){
        for (Llamada item : listaLlamadas) {
            if(item instanceof LlamadaLocal){
                item.mostrarDatos();
            }
        }
    }

    public void listarProvinciales(){
        for (Llamada item : listaLlamadas) {
            if(item instanceof LlamadaProvincial){
                item.mostrarDatos();
            }
        }
    }

    public void listarLocales(){
        for (Llamada item : listaLlamadas) {
            if(item instanceof LlamadaLocal){
                item.mostrarDatos();
            }
        }
    }

    public void mostrarCostes(){
        for (Llamada item: listaLlamadas) {
            costeTotal += item.getCoste();
        }
        System.out.println("Coste total: "+costeTotal);
    }
}
