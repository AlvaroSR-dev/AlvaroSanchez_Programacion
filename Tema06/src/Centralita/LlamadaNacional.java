package Centralita;

public final class LlamadaNacional extends Llamada{
    protected int franja = 0;

    public LlamadaNacional() {
    }

    public LlamadaNacional(int nOrigen, int nDestino, int duracion) {
        super(nOrigen, nDestino, duracion);
    }
}
