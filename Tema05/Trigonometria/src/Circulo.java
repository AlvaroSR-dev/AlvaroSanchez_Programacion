public class Circulo {
    private double radio;
    private double diametro = (2*radio);
    private double area = (Math.PI * Math.pow(radio,2));

    public Circulo(double radio, double diametro, double area) {
        this.radio = radio;
        this.diametro = diametro;
        this.area = area;
    };
}
