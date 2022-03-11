package TrabajadoresInterfaz;

public abstract class Jefe extends Trabajador implements Comision{

    private int numeroTrabajadores;

    public Jefe() {
    }

    public Jefe(String dni, String nombre, String apellido, double sueldo, Departamento departamento, int numeroTrabajadores) {
        super(dni, nombre, apellido, sueldo, departamento);
        this.numeroTrabajadores = numeroTrabajadores;
    }

    @Override
    public void calcularSueldo() {
        this.sueldo = this.sueldo;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Número trabajadores: "+numeroTrabajadores);
    }

    @Override
    public double votar(int voto) {
        return 0;
    }

    @Override
    public void obtenerBeneficio() {

    }

    public int getNumeroTrabajadores() {
        return numeroTrabajadores;
    }

    public void setNumeroTrabajadores(int numeroTrabajadores) {
        this.numeroTrabajadores = numeroTrabajadores;
    }
}
