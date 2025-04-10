package design_patterns.structural.exercise2;
//composite leaf
public class Shape implements DocumentElement{
    private String shapeType;
    
    public Shape(String shapeType) {
        this.shapeType = shapeType;
    }

    @Override
    public void render(Renderer renderer) {
        renderer.renderShape(shapeType);
    }
}
