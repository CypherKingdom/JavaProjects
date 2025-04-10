package design_patterns.architectural.microservice;

public class Catalog {
    
    public void browseProducts(){
        System.out.println("Browsing products");
    }

    public void searchByProduct(String product){
        System.out.println("Searching for product " + product);
    }
}
