package Herencia;

import java.util.ArrayList;

public class Concesionario {
    private ArrayList<Coche> concesionario;

    public Concesionario(){
        concesionario = new ArrayList<>();
    }

    public Coche existeCoche(String matricula){
        boolean existe = false;
        Coche cocheEncontrado = null;

        for (Coche item : concesionario) {
            if (matricula.equalsIgnoreCase(item.getMatricula())){
                System.out.println("El coche ya existe.");
                cocheEncontrado = item;
                existe = true;
                return cocheEncontrado;
            }
        }
        return null;
    }

    public void agregarCoche(Coche coche){
        if (existeCoche(coche.getMatricula()) == null){
            concesionario.add(coche);
            System.out.println("Coche agregado correctamente.");
        }
    }

    public void borrarCoche(String matricula){
        if (existeCoche(matricula) != null){
            concesionario.remove(existeCoche(matricula));
            System.out.println("Coche borrado correctamente. Mtrícula: "+matricula);
        } else {
            System.out.println("Coche no encontrado.");
        }
    }

    public void listar(){
        for (Coche item:concesionario) {
        }
    }

    public void buscar(String matricula){

    }
}
