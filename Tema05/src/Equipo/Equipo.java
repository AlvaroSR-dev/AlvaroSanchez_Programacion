package Equipo;

/*
- Un atributo de tipo String que sea el nombre
- Tres atributos de tipo int que sean el nivelAtaque, nivelCentro y nivelDefensa
- Un atributo int que sean los goles
- Un constructor que pida por parámetros un nombre y que tenga la siguiente funcionalidad:
- Inicialice el nombre al pasado por parámetros
- Inicialice el nivel de ataque a un número aleatorio entre 0 y 100
- Inicialice el nivel de centro a un número aleatorio entre 0 y 100
- Inicialice el nivel de defensa a un número alaatorio entre 0 y 100
- Inicialice los goles a 0
- Un constructor que pida por parámetros un storing (nombre) y tres enteros (niveles de ataque medio y defensa) y que tenga la siguiente funcionalidad:
- Inicialice el nombre al pasado por parámetros
- Inicialice el nivel de ataque al número pasado
- Inicialice el nivel de centro al número pasado
- Inicialice el nivel de defensa al número pasado
- Un método atacar que no reciba nada por parámetros y retorne un booleano. La funcionalidad será la siguiente
- Retornará true (se ha metido gol) si el resultado de la operación de (nivelAtaque * (aleatorio entre 0-1) + (nivelCentro * aleatorio entre 0-1)/2) es superior a 90. Además sumará uno a la variable goles
- Retornará false en el resto de los casos
 */
import java.util.Scanner;


public class Equipo {

    Scanner in = new Scanner(System.in);

    String nombre;
    int nivelAtaque, nivelCentro, nivelDefensa, goles;

    public Equipo(String nombre){
        this.nombre = nombre;
        this.nivelAtaque = (int) (Math.random() * 101);
        this.nivelCentro = (int) (Math.random() * 101);
        this.nivelDefensa = (int) (Math.random() * 101);
        this.goles = 0;
    }

    public Equipo(String nombre, int nivelAtaque, int nivelCentro, int nivelDefensa){
        this.nombre = nombre;
        this.nivelAtaque = nivelAtaque;
        this.nivelCentro = nivelCentro;
        this.nivelDefensa = nivelDefensa;
    }

    public boolean atacar(){
        boolean gol = false;
        if ( ((nivelAtaque * ( (int) (Math.random() * 2) ) ) + (nivelCentro* ( (int) (Math.random() * 2) ) )) > 90 ){
            gol = true;
            return true;
    }
        return gol;
    }
}
