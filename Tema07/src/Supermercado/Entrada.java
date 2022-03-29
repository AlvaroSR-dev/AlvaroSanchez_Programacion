package Supermercado;

public class Entrada {
    public static void main(String[] args) {
        Silla silla = new Silla("Roble", 5, 100, 4);

        silla.mostrarDatos();
        silla.calcularPrecio();
    }
}
