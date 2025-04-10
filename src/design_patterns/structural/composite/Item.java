package design_patterns.structural.composite;

public interface Item {
    double calculatePrice();
    void addItem(Item item);
    void removeItem(Item item);
    void print();
}
