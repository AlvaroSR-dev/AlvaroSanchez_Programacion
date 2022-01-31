package Agenda;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Persona persona = new Persona("00000W", "Álvaro", 606888888);
        Agenda agenda = new Agenda();
        agenda.anadirPersona(persona);
        agenda.anadirPersona(new Persona("20030W", "Paco", 635000111));

        agenda.listar();
        agenda.borrarPersona("1234");

        agenda.listar();
    }
}

