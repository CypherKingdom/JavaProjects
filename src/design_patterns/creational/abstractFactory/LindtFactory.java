package design_patterns.creational.abstractFactory;

public class LindtFactory extends ChocolateFactory {
    
    @Override
    public Chocolate createChocolate() {
        return new LindtChocolate();
    }

    @Override
    public HotChocolate createHotChocolate() {
        return new LindtHotChocolate();
    }
}
