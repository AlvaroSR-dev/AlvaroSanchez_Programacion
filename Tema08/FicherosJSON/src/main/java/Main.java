import controller.JSONController;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //String ciclo;
        //int curso;
        int numero;
        String genero = "";

        /* System.out.println("Que ciclo quieres mirar");
        ciclo = scanner.next();
        System.out.println("Que curso quieres mirar");
        curso = scanner.nextInt(); */



        JSONController controller = new JSONController();
        /*controller.leerFicheroJSON();
        controller.leerJSONAsignturas(ciclo,curso);
        controller.lecturaJSONAPI(100, "male");
        controller.lectruaUsars(); */

        System.out.println("¿Cuantos usuarios quieres generar?");
        numero = scanner.nextInt();

        System.out.println("¿De que genero quieres los usuarios?");
        int opcion = 0;
        System.out.println("1. Masculino \n" +
                "2. Femenino \n" +
                "3. Ambos");
        opcion = scanner.nextInt();
        if (opcion == 1){
            genero = "male";
        } else if (opcion == 2) {
            genero = "femenino";
        } else {
            genero = "";
        }

        controller.lecturaEjercicio(numero, genero);
    }
}