package Ejercicio01;

public class Entrada {
    public static void main(String[] args) {
        Persona alvaro = new Persona("Álvaro", "Sánchez", "00000000W", 19, 172, 62);
        Persona predef = new Persona("Persona", "Predefinida", "11111111Z", 10);

        alvaro.mostrarDatos();
    }
}
