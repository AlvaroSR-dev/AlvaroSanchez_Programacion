package Herencia;

public class Electrico extends Coche{
    int bateria;

    public Electrico(){}

    public Electrico(String matricula, String bastidor, int cv, int cc, int bateria) {
        super(matricula, bastidor, cv, cc);
        this.bateria = bateria;

    }
}
