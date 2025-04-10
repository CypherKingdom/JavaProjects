package design_patterns.structural.exercise2;
//composite leaf
public class Text implements DocumentElement{
    private String content;
    
    public Text(String content) {
        this.content = content;
    }

    @Override
    public void render(Renderer renderer) {
        renderer.renderText(content);
    }
}