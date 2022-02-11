import java.util.Scanner;
public class Entrada {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Pizzeria pizzeria = new Pizzeria();
        int opcion = 0;
        String nombrePedidio;
        int numeroIngredientes;
        do {
            System.out.println("[PIZZERÍA]");
            System.out.println("1. Realizar pedido.");
            System.out.println("2. Servir pedido.");
            System.out.println("3. Ver pedidos pedientes.");
            System.out.println("4. Ver caja.");
            System.out.println("5. SALIR.");
            System.out.println("Introduce opción: ");
            opcion = in.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Nombre del pedido:");
                    nombrePedidio = in.nextLine();
                    System.out.println("Número de ingredientes:");
                    numeroIngredientes = in.nextInt();
                    Pizza pizza = new Pizza(1, nombrePedidio);
                    for (int i = 0; i < numeroIngredientes; i++) {
                        String nombre;
                        double costeIngrediente;
                        System.out.println("Ingrediente:");
                        nombre = in.nextLine();
                        System.out.println("Precio del ingrediente:");
                        costeIngrediente = in.nextDouble();
                        Ingrediente ingrediente = new Ingrediente(nombre,costeIngrediente);
                        pizza.agregarIngrediente(ingrediente);
                    }
                    pizzeria.agregarPedido(pizza);

                    break;

                case 2:
                    int idServir = 0;
                    System.out.println("¿Qué pedido quieres servir?");
                    idServir = in.nextInt();

                case 3:
                    pizzeria.mostrarPedidosPendientes();
                    break;

                case 4:
                    pizzeria.mostrarCaja();
                    System.out.print("€.");
            }

        }while (opcion!=5);
    }
}
