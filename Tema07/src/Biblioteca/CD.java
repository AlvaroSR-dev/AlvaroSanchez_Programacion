package Biblioteca;

public final class CD extends Elemento{
    private TipoCD tipo;

    public CD() {
    }

    public CD(int id, String seccion, String titulo, String aEdicion, boolean estado, Biblioteca.TipoCD tipo) {
        super(id, seccion, titulo, aEdicion, estado);
        this.tipo = tipo;
    }
}
