package Supermercado;

public abstract class Mueble implements Inventariable {
    protected String material;
    protected int peso;
    protected double precio;

    public Mueble() {
    }

    public Mueble(String material, int peso, double precio) {
        this.material = material;
        this.peso = peso;
        this.precio = precio;
    }

    public void mostrarDatos() {
        System.out.println(material);
        System.out.println(peso);
        System.out.println(precio);
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public void calcularPrecio() {
        setPrecio(this.precio * Inventariable.IVA_MUEBLES);
        System.out.println("El precio con IVA es: " + precio);
    }
}
