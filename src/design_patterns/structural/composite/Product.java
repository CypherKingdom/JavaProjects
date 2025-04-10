package design_patterns.structural.composite;

public class Product implements Item{
    private String name;
    private double price;
    
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double calculatePrice() {
       return this.price; 
    }

    @Override
    public void addItem(Item item) {}

    @Override
    public void removeItem(Item item) {}

    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }
}
