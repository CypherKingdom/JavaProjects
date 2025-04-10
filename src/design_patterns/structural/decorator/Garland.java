package design_patterns.structural.decorator;

public class Garland extends TreeDecorator {
    public Garland(ChristmasTree tree){
        super(tree);
    }

    @Override
    public String decorate(){
        return super.decorate() + this.decorateWithGarland();
    }

    public String decorateWithGarland(){
        return " with a Garland";
    }
}