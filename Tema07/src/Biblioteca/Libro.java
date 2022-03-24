package Biblioteca;

public class Libro extends  Elemento{
    private String ISBN, autor, editorial;
    private int paginas;

    public Libro() {
    }

    public Libro(int id, String seccion, String titulo, boolean estado, String ISBN, String autor, String editorial, int paginas) {
        super(id, seccion, titulo, estado);
        this.ISBN = ISBN;
        this.autor = autor;
        this.editorial = editorial;
        this.paginas = paginas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(ISBN);
        System.out.println(autor);
        System.out.println(editorial);
        System.out.println(paginas);
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
}
