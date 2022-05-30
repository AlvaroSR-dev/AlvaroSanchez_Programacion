import controller.Controller1;
import controller.Controller2;
import controller.Controller3;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        File file = null;
        file = new File("src/main/resources/fichero_cifrado.txt");
        Controller1 controller1 = new Controller1();
        Controller2 controller2 = new Controller2();
        Controller3 controller3 = new Controller3();

        // controller1.lecturaFichero(file);

        // controller2.lecturaPersonajes(true);


        System.out.println("¿Qué películas quieres ver? \n 1. Cartelera \n 2. Próximamente");
        int opcion = 0;
        opcion = in.nextInt();
        if (opcion == 1){
            System.out.println("[CARTELERA]");
            controller3.verCartelera();
            controller3.escribirCartelera();
        } else if(opcion == 2){
            System.out.println("[PRÓXIMAMENTE]");
            controller3.verProximamente();
            controller3.escribirProximamente();
        } else {
            System.out.println("[SALIR]");
        }
    }
}
