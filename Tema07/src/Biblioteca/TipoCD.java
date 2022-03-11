package Biblioteca;

public enum TipoCD {
    musical("Musical"), monologo("Monólogo"), educativo("Educativo");

    String nombre;
    TipoCD(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
