package Cajero;

import java.util.Scanner;

public class Cliente {
    private String dni, nombre, banco;
    private int pin, iban;
    private double saldo;

    Scanner in = new Scanner(System.in);

    Cliente(){
        this.dni = "00000000A";
        this.nombre = "Cliente";
        this.banco = "xxx";
        this.pin = 0000;
        this.saldo = 0.0;
        this.iban = 00000;
    };

    Cliente(String dni, String nombre, String banco, int pin){
        this.dni = dni;
        this.nombre = nombre;
        this.banco = banco;
        this.pin = 0000;
        this.iban = 00000;
    }

    public void mostrarDatos(){
        System.out.println("DNI: "+this.dni);
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Banco: "+this.banco);
        System.out.println("Saldo: "+this.saldo);
        System.out.println("IBAN: "+this.iban);
    }

    /* Getter y Setter */

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getIban() {
        return iban;
    }

    public void setIban(int iban) {
        this.iban = iban;
    }

    /* Métodos */

    public void abrirCuenta(){
        System.out.println("[ABRIR CUENTA]");
        System.out.println("Introduce tu DNI: ");
        dni = in.nextLine();
        System.out.println("Introduce tu pin de seguridad: ");
        pin = in.nextInt();
        do {
            System.out.println("Introduce tu pin de seguridad: ");
            System.out.println("(El pin debe tener 4 dígtos)");
            pin = in.nextInt();
        } while (pin > 9999 || Integer.toString(pin).length() < 4);

        System.out.println("Saldo inicial: ");
        saldo = in.nextDouble();

        iban = (int) ((Math.random() * 10001) + 1);
    }

    public void cancelarCuenta(String dni, int pin){
        boolean encontradaCuenta = false;

        for (int i = 0; i < 3; i++) {
        }
    }
}
