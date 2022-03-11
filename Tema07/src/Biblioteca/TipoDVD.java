package Biblioteca;

public enum TipoDVD {
    intriga("Intriga"), terror("Terror"), comedia("Comedia"), drama("Drama");

    String nombre;
    TipoDVD(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
