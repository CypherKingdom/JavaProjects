package design_patterns.structural.exercise2;

import java.util.*;

public class GroupElement implements DocumentElement{
    private List<DocumentElement> elements = new ArrayList<DocumentElement>();
    
    @Override
    public void render(Renderer renderer) {
        for(DocumentElement e: elements){
            e.render(renderer);
        }
    }
    public void add(DocumentElement element){
        elements.add(element);
    }
}
