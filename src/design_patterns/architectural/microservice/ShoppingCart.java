package design_patterns.architectural.microservice;

public class ShoppingCart {
    public void addProduct(String product){
        System.out.println("Adding product " + product);
    }

    public void removeProduct(String product){
        System.out.println("Removing product " + product);
    }
}
