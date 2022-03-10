package EnumInterfaz;

public class Canterano extends Persona{
    private int posibilidades;

    public Canterano(String nombre, String apellido, double sueldo, int posibilidades) {
        super(nombre, apellido, sueldo);
        this.posibilidades = posibilidades;
    }
}
