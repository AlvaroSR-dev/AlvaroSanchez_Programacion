package Cajero;

import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
    private String nombre, cif;
    private ArrayList<Cuenta> carteraCuentas;

    public Banco(){};

    Scanner in = new Scanner(System.in);

    public Banco(String nombre, String cif){
      this.nombre = nombre;
      this.cif = cif;
      carteraCuentas = new ArrayList();
    }

    public void crearCuenta(String dni, int pin, double saldo){
        Cuenta cuenta = new Cuenta(dni, pin, saldo);
        carteraCuentas.add(cuenta);
    }

    public void borrarCuenta(String dni, int pin){
        boolean existe = false;
        System.out.println("[BORRAR CUENTA]");
        System.out.println("Introduce tu DNI:");
        dni = in.nextLine();
        pin = in.nextInt();

        for (int i = 0; i < carteraCuentas.size(); i++) {
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getCif() {
        return cif;
    }
}
