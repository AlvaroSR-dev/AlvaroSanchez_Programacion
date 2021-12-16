import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int long1 = 0;
        int numeros = 0;
        System.out.println("Dime la longitud del array: ");
        long1 = in.nextInt();
        int[] array1 = new int[long1];

        for (int i = 0; i < array1.length; i++) {
            System.out.println("Dime un número: ");
            array1[i] = in.nextInt();
        }

    }

}
