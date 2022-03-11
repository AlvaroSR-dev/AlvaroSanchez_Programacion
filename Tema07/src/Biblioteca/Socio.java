package Biblioteca;

import java.util.ArrayList;

public class Socio extends Persona{
    protected int nSocio;
    protected ArrayList prestamos;

    public Socio() {
        prestamos = new ArrayList();
    }

    public Socio(String nombre, String apellido, String dni, int nSocio, ArrayList prestamos) {
        super(nombre, apellido, dni);
        this.nSocio = nSocio; /* falta generar el numero automáticamente */
        this.prestamos = prestamos;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("ID Socio: "+nSocio);
    }

    public int getnSocio() {
        return nSocio;
    }

    public void setnSocio(int nSocio) {
        this.nSocio = nSocio;
    }

    public ArrayList getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList prestamos) {
        this.prestamos = prestamos;
    }
}
