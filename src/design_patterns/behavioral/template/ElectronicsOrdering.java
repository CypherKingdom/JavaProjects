package design_patterns.behavioral.template;

public class ElectronicsOrdering extends OnlineOrdering {

    @Override
    public void selectItems() {
        System.out.println("Selecting electronics");
    }
}
