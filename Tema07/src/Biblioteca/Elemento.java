package Biblioteca;

public abstract class Elemento {
    protected int id;
    protected String seccion, titulo, aEdicion;
    protected boolean estado;

    public Elemento() {
    }

    public Elemento(int id, String seccion, String titulo, String aEdicion, boolean estado) {
        this.id = id;
        this.seccion = seccion;
        this.titulo = titulo;
        this.aEdicion = aEdicion;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getaEdicion() {
        return aEdicion;
    }

    public void setaEdicion(String aEdicion) {
        this.aEdicion = aEdicion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
