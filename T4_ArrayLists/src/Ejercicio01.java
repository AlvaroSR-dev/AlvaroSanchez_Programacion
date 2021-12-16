import java.util.ArrayList;

public class Ejercicio01 {
    public static void main(String[] args) {
        ArrayList<String> palabras = new ArrayList();

        palabras.add(0, "casa");
        palabras.add(1, "coche");
        palabras.add(2, "perro");
        palabras.add(3, "gato");
        palabras.add(4, "aire");
        palabras.add(5, "playa");
        palabras.add(6, "piedra");
        palabras.add(7, "agua");
        palabras.add(8, "camisa");
        palabras.add(9, "brazo");

        for (int i = 0; i < palabras.size(); i++) {
            System.out.println(palabras.get(i));
        }
    }
}
