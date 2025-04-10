package design_patterns.structural.composite;

public class Demo {
    public static void main(String[] args) {
        Item i1 = new Product("Shoes", 20);        
        Item i2 = new Product("Hat", 10);        
        Item b1 = new Box("Order 1");
        b1.addItem(i1);
        b1.addItem(i2);
        Item i3 = new Product("Jacket", 30);
        Item b2 = new Box("Order 11");

        b2.addItem(i3);
        b2.addItem(b1);
        System.out.println(b2.calculatePrice());
        b2.print();
    }
}
