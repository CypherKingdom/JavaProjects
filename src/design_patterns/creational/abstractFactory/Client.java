package design_patterns.creational.abstractFactory;

public class Client {
    public static void main(String[] args) {
        ChocolateFactory factory = new PoulainFactory();
        Chocolate chocolate = factory.createChocolate();
        chocolate.eat();
        HotChocolate hotChocolate = factory.createHotChocolate();
        hotChocolate.prepare();

        factory = new LindtFactory();
        chocolate = factory.createChocolate();
        chocolate.eat();
    }
}
