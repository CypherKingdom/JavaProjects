package design_patterns.creational.builder;

public class CalzonePizzaBuilder extends PizzaBuilder {

    @Override
    public void buildDough() {
        pizza.setDough("thick");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("white");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("ham + cheese");
    }
}
