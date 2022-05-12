import java.util.ArrayList;

public class Pizzeria {
    private ArrayList<Pizza> pizza;
    private double caja;

    public Pizzeria(){}

    public Pizzeria(ArrayList<Pizza> pizza){
        this.pizza = new ArrayList<>();
    }

    public void agregarPedido(Pizza pizzaAgregar){
        this.pizza.add(pizzaAgregar);
    }

    public Pizza existePizza(int id){
        for ( Pizza pizza : pizza) {
                if (pizza.getId() == id && !pizza.isEstado()){
                    return pizza;
                }
            System.out.println("La pizza no existe.");
            return null;
        }
        System.out.println("La pizza no existe.");
        return null;
    }

    public void verEstadoPedido(int id){
        if(existePizza(id) !=null){
            existePizza(id).verDatos();
        }
    }

    public void servirPedido(int id){
        Pizza pizza = existePizza(id);
        if(pizza!=null){
            pizza.setEstado(true);
            this.caja += pizza.getPrecio();
        }
    }

    public void mostrarPedidosPendientes(){
        for ( Pizza pizza : pizza) {
            if (!pizza.isEstado()){
                pizza.verDatos();
            }
        }
    }

    public void  mostrarCaja(){
        System.out.println(caja);
    }

    public ArrayList<Pizza> getPizza() {
        return pizza;
    }

    public void setPizza(ArrayList<Pizza> pizza) {
        this.pizza = pizza;
    }

    public double getCaja() {
        return caja;
    }

    public void setCaja(double caja) {
        this.caja = caja;
    }
}
