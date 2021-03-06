package TrabajadoresInterfaz;

public final class Directivo extends Persona implements Comision{
    private int capital;

    public Directivo() {
    }

    public Directivo(String dni, String nombre, String apellido) {
        super(dni, nombre, apellido);
        this.capital = capital;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Capital: "+capital);
    }

    @Override
    public double votar(int voto) {
        return 0;
    }

    @Override
    public void obtenerBeneficio() {

    }

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }
}
