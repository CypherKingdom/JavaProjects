package design_patterns.behavioral.template;

public class Demo {

    public static void main(String[] args) {
        OnlineOrdering online = null;
        online = new GroceriesOrdering();
        online.purchase();

        online = new ClothingOrdering();
        online.purchase();
    }
}
