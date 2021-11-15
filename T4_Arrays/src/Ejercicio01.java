import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {

            int[] numeros = new int[10];
            Scanner lecturaTeclado = new Scanner(System.in);

            for (int i = 0; i < numeros.length; i++) {
                System.out.println("Dime un numero para guardar");
                int numero = lecturaTeclado.nextInt();
                numeros[i] = numero;

            }

            for (int i = 0; i < numeros.length; i++) {
                System.out.printf("%d : %d%n", i, numeros[i]);

            }

        }
    }

