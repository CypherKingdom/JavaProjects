package design_patterns.creational.builder;

public class Client {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder pizzaBuilder = new MargueritaPizzaBuilder();
        waiter.setPizzaBuilder(pizzaBuilder);
        waiter.preparePizza();

        //Pizza pizza = waiter.returnPizza();
    }
}
