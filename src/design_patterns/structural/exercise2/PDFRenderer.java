package design_patterns.structural.exercise2;

public class PDFRenderer implements Renderer{

    @Override
    public void renderText(String text) {
        System.out.println("Rendering text in PDF " + text);
    }

    @Override
    public void renderImage(String imagePath) {
        System.out.println("Rendering text in PDF " + imagePath);
    }

    @Override
    public void renderShape(String shapeType) {
        System.out.println("Rendering text in PDF " + shapeType);
    }
}
