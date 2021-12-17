package BaseHashtable;

import java.util.Hashtable;

public class Ejercicio01 {
    public static void main(String[] args) {
        Hashtable<String, Object[]> listaCoches = new Hashtable();

        listaCoches.put("1", new Object[]{"Seat", "Leon FR", "1234 ABC", 150});
        listaCoches.put("2", new Object[]{"Mercedes", "Benz Clase C 220d", "7890 KLC", 250});
        listaCoches.put("3", new Object[]{"Honda", "Civic Type R", "8723 HXD", 210});
        listaCoches.put("4", new Object[]{"Mazda", "6", "3563 JKL", 150});
        listaCoches.put("5", new Object[]{"Renault", "Megane", "3245 QOP", 120});
    }
}
