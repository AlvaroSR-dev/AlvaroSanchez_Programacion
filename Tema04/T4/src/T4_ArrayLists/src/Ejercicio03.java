import java.util.ArrayList;

public class Ejercicio03 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList();
        int num = 0;

        nombres.add(0, "Nico");
        nombres.add(1, "Jessica");
        nombres.add(2, "Dani Arquero");
        nombres.add(3, "Cristina");
        nombres.add(4, "Adri");
        nombres.add(5, "Mario");
        nombres.add(6, "Fernando");
        nombres.add(7, "Kay");
        nombres.add(8, "Luismi");
        nombres.add(9, "Marcos");
        nombres.add(10, "Patricia");
        nombres.add(11, "Andrea");
        nombres.add(12, "SergioS");
        nombres.add(13, "Jorge H");
        nombres.add(14, "Jorge JR");
        nombres.add(15, "Ángel");
        nombres.add(16, "Alex");
        nombres.add(17, "SergioJR");
        nombres.add(18, "Coca");
        nombres.add(19, "Dani Martin");
        nombres.add(20, "Andrés");
        nombres.add(21, "Álvaro");

        num = (int)(Math.random() * (nombres.size() + 1));

        System.out.println(nombres.get(num));
    }
}
