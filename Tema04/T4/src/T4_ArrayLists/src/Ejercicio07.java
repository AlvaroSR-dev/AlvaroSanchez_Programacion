import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {
        Scanner lecturaTeclado = new Scanner(System.in);
        int opcion = 0;
        ArrayList<Object[]> listaPersonas = new ArrayList();

        do {

            System.out.println("Bienvenido a la agenda");
            System.out.println("1. Añadir personas");
            System.out.println("2. Buscar personas");
            System.out.println("3. Borrar personas");
            System.out.println("4. Listar personas");

            opcion = lecturaTeclado.nextInt();

            switch (opcion) {
                case 1:
                    if (listaPersonas.size() < 5) {
                        System.out.println("Dime tu nombre");
                        String nombre = lecturaTeclado.next();
                        System.out.println("DIme tu apellido");
                        String apellido = lecturaTeclado.next();
                        System.out.println("Dime tu DNI");
                        String dni = lecturaTeclado.next();
                        System.out.println("Dime tu telefono");
                        int telefono = lecturaTeclado.nextInt();
                        Object[] persona = new Object[]{nombre, apellido, dni, telefono};
                        System.out.println("Persona guardada");
                        listaPersonas.add(persona);
                    } else {
                        System.out.println("No hay espacio disponible");
                    }

                    break;

                case 2:
                    System.out.println("Que dni quieres buscar");
                    String dni = lecturaTeclado.next();
                    boolean encontrado = false;

                    for ( Object[] persona : listaPersonas ) {

                        if (persona[2].toString().equalsIgnoreCase(dni)){
                            encontrado = true;
                            System.out.println("Nombre: "+persona[0]
                                    +"\tApellido: "+persona[1]
                                    +"\tDNI: " +persona[2]
                                    +"\tTeléfono: "+persona[3]);

                            //break;
                        }
                    }

                    if (!encontrado){
                        System.out.println("La persona no esta en la lista");
                    }

                    break;

                case 3:
                    System.out.println("Que dni quieres borrar");
                    dni = lecturaTeclado.next();
                    encontrado = false;

                    for (int i = 0; i < listaPersonas.size(); i++) {
                        if (listaPersonas.get(i)[2].toString().equalsIgnoreCase(dni)){
                            System.out.println("Persona borrada");
                            encontrado=true;
                            listaPersonas.remove(i);
                            break;
                        }
                    }

                    if(!encontrado){
                        System.out.println("La persona no esta en la lista");
                    }

                    break;
                case 4:
                    if (listaPersonas.size()>0){
                        for ( Object[] persona : listaPersonas ) {
                            System.out.println("Nombre: "+persona[0]
                                    +"\tApellido: "+persona[1]
                                    +"\tDNI: " +persona[2]
                                    +"\tTeléfono: "+persona[3]);
                        }
                    } else {
                        System.out.println("No hay personas en la lista");
                    }

                    break;
            }

        } while (opcion != 5);

    }

}