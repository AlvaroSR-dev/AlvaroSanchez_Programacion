package Equipo;

/*
- Crear dos equipos:

- (EquipoA) construido con el constructor que pide un nombre
- (EquipoB) construido con el constructor que pide un nombre y tres int
Realizar un ataques sucesivos del EquipoA y el EquipoB. Tras cada uno de los ataques mostrar el siguiente mensaje "El resultado es EqupoA X - EqiuipoB X)

Tras realizar 3 ataques de cada equipo y mostrar el resultado definitivo
 */

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {

        int resultadoA = 0;
        int resultadoB = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Introduce el nombre del Equipo A:");
        String nombreEquipoA = in.nextLine();

        System.out.println("Introduce el nombre del Equipo B:");
        String nombreEquipoB = in.nextLine();

        System.out.println("Introduce el nivel de ataque del equipo B:");
        int ataqueB = in.nextInt();

        System.out.println("Introduce el nivel de centro del equipo B:");
        int centroB = in.nextInt();

        System.out.println("Introduce el nivel de defensa del equipo B:");
        int defensaB = in.nextInt();

        Equipo equipoA = new Equipo(nombreEquipoA);
        Equipo equipoB = new Equipo(nombreEquipoB, ataqueB, centroB, defensaB);

        for (int i = 0; i < 3; i++) {
            equipoA.atacar();
            if (equipoA.atacar() == true){
                resultadoA++;
            }
        }

        for (int i = 0; i < 3; i++) {
            equipoB.atacar();
            if (equipoB.atacar() == true){
                resultadoB++;
            }
        }

        System.out.println("El resultado es: Equio A: " + resultadoA + " Equipo B: " + resultadoB);
    }
}
