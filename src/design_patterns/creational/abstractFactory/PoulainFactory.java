package design_patterns.creational.abstractFactory;

public class PoulainFactory extends ChocolateFactory {
    
    @Override
    public Chocolate createChocolate() {
        return new PoulainChocolate();
    }

    @Override
    public HotChocolate createHotChocolate() {
        return new PoulainHotChocolate();
    }

}
