import java.util.ArrayList;

public class Pizza {
    private String nombre;
    private double precio;
    private ArrayList<Ingrediente> ingredientes;
    private int id;
    private boolean estado;

    public Pizza(int i, String nombrePedidio){};

    public Pizza(String nombre, double precio, ArrayList<Ingrediente> ingredientes, int id, boolean estado){
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = new ArrayList();
        this.id = id;
        this.estado = estado;
    }

    public void agregarIngrediente(Ingrediente ingrediente){
        this.ingredientes.add(ingrediente);
        this.precio += ingrediente.getPrecio();
    }

    public void verDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Precio: "+precio+"€.");

        if(estado = true){
            System.out.println("La pizza se ha servido.");
        }else{
            System.out.println("La pizza aún no se ha servido.");
        }

        System.out.println("Nº Ingredientes: "+ingredientes.size());
        for(Ingrediente ingrediente: ingredientes){
            System.out.println(ingrediente.getNombre());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
