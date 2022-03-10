package EnumInterfaz;

import java.util.ArrayList;

public class Seleccion {
    private ArrayList<Persona> listaPersonas;

    public Seleccion() {
        this.listaPersonas = new ArrayList<>();
    }

    public void addPersona(Persona persona){
        this.listaPersonas.add(persona);
    }

    public void comprobarAtaque(){
        for (Persona item : listaPersonas) {
            if ((item instanceof Entrenador)){
                ((Seleccionable)item).atacar();
            }
        }
    }

}
