package TrabajadoresInterfaz;

public class Departamento {

    String nombre;
    int numeroTrabajadores;

    Departamento(String nombre, int numeroTrabajadores) {
        this.nombre = nombre;
        this.numeroTrabajadores = numeroTrabajadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroTrabajadores() {
        return numeroTrabajadores;
    }

    public void setNumeroTrabajadores(int numeroTrabajadores) {
        this.numeroTrabajadores = numeroTrabajadores;
    }
}
