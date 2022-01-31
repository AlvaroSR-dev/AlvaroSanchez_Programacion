import java.util.Enumeration;
import java.util.Hashtable;

public class ListaHashtable {
    public static void main(String[] args) {
        Hashtable lista = new Hashtable();

        // para sacar el tamaño de la lista
        lista.size();

        // guardar elementos
        lista.put("1", "Elemento 1");
        lista.put("2", "Elemento 2");
        lista.put("3", false);
        lista.put("4", new String[]{"cosa 1","cosa 2","cosa 3"});

        System.out.println(lista.size());

        // obtener elementos del Hashtable

        String[] elementoEncontrado =  (String[]) lista.get("2");
        elementoEncontrado[0] = "Nuevo valor";

        // borrar elementos

        lista.remove("1");
        System.out.println(lista.get("1"));

        // imprimir objetos
        Enumeration<Object> listaClaves = lista.keys();
    }
}
