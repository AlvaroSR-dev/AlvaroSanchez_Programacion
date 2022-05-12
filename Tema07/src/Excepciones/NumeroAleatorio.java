package Excepciones;

import java.util.Scanner;

public class NumeroAleatorio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int random = 0;
        int numero = 0;
        int intentos = 0;

        random = (int) (Math.random() * 11);

        do {
            System.out.println("Adivina el número entre 0 y 10:");
            numero = in.nextInt();
            intentos++;

            if (numero == random){
                System.out.println("¡Enhorabuena, has acertado el número!");
                System.out.println("Has realizado " + intentos + " intentos.");
                break;
            }else{
                System.out.println("El número no es correcto.");
            }

        } while (numero >= 0 || numero == random);
    }
}
