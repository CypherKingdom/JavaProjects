package design_patterns.creational.builder;

public abstract class PizzaBuilder {
    protected Pizza pizza;

    public void createNewPizza(){
        pizza = new Pizza();
    }

    public abstract void buildDough();
    public abstract void buildSauce();
    public abstract void buildTopping();

    public Pizza getResult(){
        return pizza;
    }
}
