package Agenda;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Persona> listaPersonas;

    public Agenda(){
        this.listaPersonas = new ArrayList();
    }

    public void anadirPersona(Persona persona){
        /* boolean existe = false;
        for(Persona item : listaPersonas){
            if (item.getDni() == persona.getDni()){
                existe = true;
                break;
            }
        }

        if (existe) {
            System.out.println("ERROR: Este DNI ya está agregado.");
        }else{
            listaPersonas.add(persona);
        }*/

        if (existePersona(persona.getDni()) == null){
            listaPersonas.add(persona);
        }else{
            System.out.println("ERROR: Este DNI ya está agregado.");
        }
    }

    public void listar(){
        for (Persona item: listaPersonas) {
            System.out.println("Imprimiendo persona");
            item.mostrarDatos();
        }
    }

    public boolean borrarPersona(String dni){
        /* for (int i = 0; i < listaPersonas.size(); i++) {
            if(dni.equalsIgnoreCase(listaPersonas.get(i).getDni())) {
                listaPersonas.remove(i);
            }
        } */

        if (existePersona(dni) != null){
            listaPersonas.remove(existePersona(dni));
            return true;
        }
        return false;
    }

    public void buscarPersona(String dni){
        /* for(Persona persona : listaPersonas){
            if (persona.getDni() == dni){
                persona.mostrarDatos();
                break;
            }
        } */

        if (existePersona(dni) != null){
            existePersona(dni).mostrarDatos();
        }
    }

    public void editarPersona(String dni){
        /* for ( Persona persona : listaPersonas){
            if (persona.getDni() == dni){
                persona.setNombre("Otro nombre");
                persona.setTlf(123456);
                break;
            }
        } */

        if (existePersona(dni) != null){
            Persona personaEncontrada = existePersona(dni);
            personaEncontrada.setNombre("Nuevo");
            personaEncontrada.setTlf(888888);
            personaEncontrada.setDni("898989W");
        }
    }

    private Persona existePersona(String dni){
        Persona persona = null;
        for (Persona item : listaPersonas) {
            if (item.getDni() == dni){
                return item;
            }
        }
        return persona;
    }
}
