package EnumInterfaz;

public class Jugador extends Persona implements Seleccionable{
    private String posicion;

    public Jugador(String nombre, String apellido, double sueldo, String posicion) {
        super(nombre, apellido, sueldo);
        this.posicion = posicion;
    }
}
