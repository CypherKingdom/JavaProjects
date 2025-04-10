package design_patterns.creational.factoryMethod;

public class Client {
    public static void main(String[] args) {
        ChocolateFactory factory = new ChocolateFactory();
        Chocolate poulainChocolate = factory.createChocolate("poulain");
        Chocolate lindtChocolate = factory.createChocolate("lindt");
        poulainChocolate.eat();
        lindtChocolate.eat();
    }
}
