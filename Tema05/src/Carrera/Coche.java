package Carrera;
import java.util.Scanner;

public class Coche {
    int cv, velocidad;
    String matricula, modelo;
    Double km;

    Scanner in = new Scanner(System.in);

    public Coche(){
        this.cv = 0;
        this.velocidad = 0;
        this.matricula = "0000AAA";
        this.modelo = "Sin especificar";
        this.km = 0.0;
    }

    public Coche(int cv, String matricula, String modelo){
        this.cv = cv;
        this.velocidad = 0;
        this.matricula = matricula;
        this.modelo = modelo;
        this.km = 0.0;
    }

    /* Getter y setter */

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getKm() {
        return km;
    }

    public void setKm(Double km) {
        this.km = km;
    }

    /* Métodos */

    public void acelerar(){
        int acelerado = 0;
        System.out.println("Introduce velocidad");
        acelerado = in.nextInt();

        velocidad += acelerado;

        km = velocidad * ((cv) * (Math.random() * 11) + 1);

        if (velocidad > 180){
            velocidad = 180;
            System.out.println("Velocidad máxima alcanzada: 180 km/h");
        }
    }

    public void frenar(){
        int frenado = 0;
        velocidad -= frenado;

        if (velocidad < 0){
            velocidad = 0;
            System.out.println("Se ha frenado el coche: 0km/h");
        }
    }

    public void parar(){
        velocidad = 0;
        System.out.println("Se ha frenado el coche: 0km/h");
    }
}
