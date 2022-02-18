package Centralita;

public abstract class Llamada {
    protected int nOrigen, nDestino, duracion;
    protected double coste;

    public Llamada(){}

    public Llamada(int nOrigen, int nDestino, int duracion) {
        this.nOrigen = nOrigen;
        this.nDestino = nDestino;
        this.duracion = duracion;
        calcularCoste();
    }

    protected abstract void calcularCoste();

    public void mostrarDatos(){
        System.out.print("Origen: " + nOrigen + "\n Destino: " + nDestino + "\n Duracion: " + duracion + "\n Coste: " + coste + "\n");
    }

    public int getnOrigen() {
        return nOrigen;
    }

    public void setnOrigen(int nOrigen) {
        this.nOrigen = nOrigen;
    }

    public int getnDestino() {
        return nDestino;
    }

    public void setnDestino(int nDestino) {
        this.nDestino = nDestino;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }
}
