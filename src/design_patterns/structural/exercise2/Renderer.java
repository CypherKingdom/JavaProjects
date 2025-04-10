package design_patterns.structural.exercise2;
//bridge implementation
public interface Renderer {
    void renderText(String text);
    void renderImage(String imagePath);
    void renderShape(String shapeType);
}