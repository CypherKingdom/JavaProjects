package design_patterns.structural.decorator;

public class BubbleLights extends TreeDecorator{
    public BubbleLights(ChristmasTree tree){
        super(tree);
    }

    @Override
    public String decorate(){
        return super.decorate() + this.decorateWithBubbleLights();
    }

    private String decorateWithBubbleLights(){
        return " with Bubble Lights";
    }
}
