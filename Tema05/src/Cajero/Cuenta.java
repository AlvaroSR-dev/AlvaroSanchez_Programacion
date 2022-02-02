package Cajero;

import java.util.Locale;

public class Cuenta {
    private int IBAN;
    private int pin;
    private String dni;
    private double saldo;

    public Cuenta(String dni, int pin, double saldo) {
        this.dni = dni;
        this.pin = pin;
        this.saldo = saldo;
        this.IBAN = (int) (Math.random() * 10000) + 1;
    }

    public boolean permitirAcceso(String dni, int pin){
        if (this.dni.toLowerCase().equals(dni.toLowerCase()) && this.pin == pin){
            return true;
        }
        return false;
    }

    public void sacarDinero(double saldoRetirar, String dni, int pin){
        if (permitirAcceso(dni, pin)){
            if (saldo >= saldoRetirar){
                this.saldo -= saldoRetirar;
                System.out.println("Dinero retirado");
            } else {
                System.out.println("saldo insuficiente");
            }
        } else {
            System.out.println("Credenciales incorrectas");
        }
    }


}
