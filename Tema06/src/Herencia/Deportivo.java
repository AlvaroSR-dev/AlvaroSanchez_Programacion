package Herencia;

public class Deportivo extends Coche{
    private int par;

    public Deportivo(){}
    public Deportivo(String matricula, String bastidor, int cv, int cc, int par){
        super(matricula, bastidor, cv, cc);
        this.par = par;
    }

    @Override
    public void calcularVelocidad(int velocidad){
        super.calcularVelocidad(velocidad);

        int aleatorio = (int) (Math.random() * 11)+30;
        this.velocidad += aleatorio;
        System.out.println("Velocidad calculada");
    }
}
