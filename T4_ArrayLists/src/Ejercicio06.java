import java.util.ArrayList;
import java.util.Scanner;


public class Ejercicio06 {
    public static void main(String[] args) {
        int opcion = 0;
        ArrayList<Object[]> coches = new ArrayList();
        Scanner in = new Scanner(System.in);
        String marca = "";
        String modelo = "";
        int cv = 0;
        String matricula = "";
        int coste = 0;

        do {

            System.out.printf("Elige una opción:" +
                    "%n 1. Añadir un coche." +
                    "%n 2. Listar coches." +
                    "%n 3. Buscar coches." +
                    "%n 4. Mostrar todos los coches." +
                    "%n 5. Eliminar coche." +
                    "%n 6. Vaciar garaje. %n");
            opcion = in.nextInt();
            switch (opcion){
                case 1:
                    if (coches.size() < 5){
                        System.out.println("[Añadir coche]");
                        System.out.println("¿Qué marca tiene el coche?");
                        marca = in.nextLine();
                        System.out.println("¿Qué modelo es el coche?");
                        modelo = in.nextLine();
                        System.out.println("¿Cuántos caballos tiene el coche?");
                        cv = in.nextInt();
                        System.out.println("¿Qué matrícula tiene el coche?");
                        matricula = in.nextLine();
                        System.out.println("¿Qué coste tiene el coche?");
                        coste = in.nextInt();
                        Object[] coche = new Object[]{marca,modelo,cv,matricula,coste};
                        System.out.println("Coche agregado correctamente");
                        coches.add(coche);
                    } else {
                        System.out.println("No hay espacio para más coches.");
                    }
                    break;
                case 2:
                    System.out.println("[Listar coches]");
                    if(coches.size()>0){
                        for ( Object[] coche : coches ) {
                            System.out.println("Marca: " + coche[0] + " Modelo: " + coche[1] + " CV: " + coche[2] + " Matrícula: " + coche[3] + " Coste: " + coche[4]);
                        }
                    } else {
                        System.out.println("No hay coches en el garaje.");
                    }
                    break;
                case 3:
                    boolean encontrado = false;
                    System.out.println("[Buscar coches]");
                    System.out.println("¿Qué matrícula quieres buscar?");
                    matricula = in.next();

                    for ( Object[] coche : coches ) {
                        if(coche[3].toString().equalsIgnoreCase(matricula)){
                            encontrado = true;
                            System.out.println("Marca: " + coche[0] + " Modelo: " + coche[1] + " CV: " + coche[2] + " Matrícula: " + coche[3] + " Coste: " + coche[4]);
                            break;
                        }
                    }
                    if (encontrado = false){
                        System.out.println("El coche no está en el garaje.");
                    }
                    break;
                case 4:
                    int coseAcumulado = 0;
                    System.out.println("[Mostrar costes]");
                    for ( Object[] coche : coches) {
                        coseAcumulado += (int) coche[4];
                    }
                    System.out.println("El coste total es de " + coseAcumulado + " €.");
                    break;
                case 5:
                    System.out.println("[Eliminar coche]");
                    encontrado = false;
                    System.out.println("¿Qué matrícula quieres borrar?");
                    matricula = in.next();

                    for (int i = 0; i < coches.size(); i++) {
                        if (coches.get(i)[3].toString().equalsIgnoreCase(matricula)){
                            System.out.println("Coche borrado.");
                            encontrado = true;
                            coches.remove(i);
                            break;
                        }
                    }

                    if (!encontrado){
                        System.out.println("Coche no encontrado.");
                    }
                    break;
                case 6:
                    System.out.println("[Vaciar garaje]");
                    coches.clear();
                    System.out.println("Lista vaciada.");
                    break;
            }
        }while (opcion != 0);

    }
}
