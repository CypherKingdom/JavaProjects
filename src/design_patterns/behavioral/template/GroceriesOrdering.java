package design_patterns.behavioral.template;

public class GroceriesOrdering extends OnlineOrdering {

    @Override
    public void selectItems() {
        System.out.println("Selecting groceries");
    }

    @Override
    public void pay(){
        System.out.println("Paying on delivery");
    }

}
