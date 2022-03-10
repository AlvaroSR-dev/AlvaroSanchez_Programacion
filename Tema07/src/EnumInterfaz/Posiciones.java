package EnumInterfaz;

public class Posiciones {
    portero("portero", 1000),
    defensa("defensa", 1500),
    medio("medio", 2000),
    delantero("delantero", 5000);

    // variables

    String definicion;
    int valor;

    // constructores

    Posiciones(){}

    Posiciones(String definicion, int valor){
        this.definicion = definicion;
        this.valor = valor;
    }
}
