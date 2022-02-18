package Centralita;

public class LlamadaProvincial extends Llamada {

    public LlamadaProvincial(int nOrigen, int nDestino, int duracion) {
        super(nOrigen, nDestino, duracion);
    }

    @Override
    protected void calcularCoste() {
        this.coste = this.duracion * 0.15;
    }

}
