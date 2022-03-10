import java.util.Scanner;

import java.io.Console;
import java.io.IOException;

public class truco {
    public static void main(String[] args) {
        Console console = System.console();
        System.out.print("Enter your password: ");
        char[] password = console.readPassword();

        /* Console console = System.console();
        String pregunta = "";
        Scanner in = new Scanner(System.in);

        char[] respuesta = console.readPassword();
        System.out.println("Hazme una pregunta:");
        pregunta = in.nextLine();
        System.out.println(respuesta); */
    }
}
