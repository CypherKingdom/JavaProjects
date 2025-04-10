package design_patterns.creational.builder;

public class MargueritaPizzaBuilder extends PizzaBuilder {

    @Override
    public void buildDough() {
        pizza.setDough("thin");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("red");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("cheese + oregano");
    }
}
