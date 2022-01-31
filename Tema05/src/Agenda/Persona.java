package Agenda;

public class Persona {
    private String dni, nombre;
    private int tlf;

    public Persona(){};

    public Persona(String dni, String nombre, int tlf){
        this.dni = dni;
        this.nombre = nombre;
        this.tlf = tlf;
    }

    public void mostrarDatos(){
        System.out.println("DNI: "+this.dni);
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Teléfono: "+this.tlf);
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTlf() {
        return tlf;
    }

    public void setTlf(int tlf) {
        this.tlf = tlf;
    }
}
