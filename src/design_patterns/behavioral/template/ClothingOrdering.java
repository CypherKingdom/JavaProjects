package design_patterns.behavioral.template;

public class ClothingOrdering extends OnlineOrdering {

    @Override
    public void selectItems() {
        System.out.println("Selecting clothing");
    }

}
