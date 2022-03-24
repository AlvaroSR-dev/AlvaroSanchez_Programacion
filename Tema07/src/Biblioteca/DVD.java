package Biblioteca;

public final class DVD extends Elemento{
    private String director, actores;
    private TipoDVD tipo;

    public DVD() {
    }

    public DVD(int id, String seccion, String titulo, String aEdicion, boolean estado, String director, String actores, TipoDVD tipo) {
        this.director = director;
        this.actores = actores;
        this.tipo = tipo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActores() {
        return actores;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }
}
