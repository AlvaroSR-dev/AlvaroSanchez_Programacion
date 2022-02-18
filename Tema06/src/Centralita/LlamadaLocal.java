package Centralita;

public final class LlamadaLocal extends Llamada{
    @Override
    protected void calcularCoste() {
        this.coste = 0;
    }

    public LlamadaLocal(int nOrigen, int nDestino, int duracion) {
        super(nOrigen, nDestino, duracion);
    }
}
