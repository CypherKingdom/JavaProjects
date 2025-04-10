package design_patterns.structural.exercise2;
//composite leaf
public class Image implements DocumentElement{
    private String imagePath;
    
    public Image(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public void render(Renderer renderer) {
       renderer.renderImage(imagePath);
    }

}
