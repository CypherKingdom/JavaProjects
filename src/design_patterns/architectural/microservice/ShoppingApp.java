package design_patterns.architectural.microservice;

public class ShoppingApp {
    public static void main(String[] args){
        Catalog catalog = new Catalog();
        ShoppingCart shoppingCart = new ShoppingCart();
        // Discount discount = new Discount();
        Ordering ordering = new Ordering();

        catalog.browseProducts();
        catalog.searchByProduct("Laptop lenovo");
        shoppingCart.addProduct("Laptop lenovo");
        ordering.calculateTotalCost();
        ordering.pay();
    }
}
