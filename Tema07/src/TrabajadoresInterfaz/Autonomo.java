package TrabajadoresInterfaz;

public final class Autonomo extends Trabajador{
    private double cuota;
    private String factura;


    public Autonomo() {
    }

    public Autonomo(String dni, String nombre, String apellido, double sueldo, String departamento, double cuota, String factura) {
        super(dni, nombre, apellido, sueldo, departamento);
        this.cuota = cuota;
        this.factura = factura;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(cuota);
        System.out.println(factura);
    }

    @Override
    public void calcularSueldo() {
        this.sueldo = this.sueldo -(cuota + (cuota*Administracion.IVA)) -(this.sueldo*Administracion.IRPF);
    }

    public void realizarFactura(){
        this.factura = String.format("Factura realizada por un importe de %.2")
    }
}
