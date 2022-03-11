package TrabajadoresInterfaz;

public final class Accionista extends Persona implements Comision{
    private int porcentajeAcciones;

    public Accionista(int porcentajeAcciones) {
    }

    public Accionista(String dni, String nombre, String apellido, int porcentajeAcciones) {
        super(dni, nombre, apellido);
        this.porcentajeAcciones = porcentajeAcciones;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(porcentajeAcciones);
    }

    @Override
    public double votar(int voto) {
        return 0;
    }

    @Override
    public void obtenerBeneficio() {

    }

    public int getPorcentajeAcciones() {
        return porcentajeAcciones;
    }

    public void setPorcentajeAcciones(int porcentajeAcciones) {
        this.porcentajeAcciones = porcentajeAcciones;
    }
}
