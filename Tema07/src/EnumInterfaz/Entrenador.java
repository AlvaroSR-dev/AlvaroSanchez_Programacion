package EnumInterfaz;

public class Entrenador extends Persona{
    private String vocacion;

    public Entrenador(String nombre, String apellido, double sueldo, String vocacion) {
        super(nombre, apellido, sueldo);
        this.vocacion = vocacion;
    }

}
