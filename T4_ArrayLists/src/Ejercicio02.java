import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio02 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList();
        int random = 0;
        int suma = 0;

        for (int i = 0; i < 10; i++) {
            random = (int)(Math.random() * 101);
            numeros.add(i, random);

            suma += random;
        }
        System.out.println(numeros);
        System.out.println("La suma de los múmeros es: " + suma);
        System.out.println("La media de los múmeros es: " + (suma / numeros.size()));
        System.out.println("El número más alto es: " + Collections.max(numeros));
        System.out.println("El número más bajo es: " + Collections.min(numeros));
    }
}
