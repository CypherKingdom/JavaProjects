package practice.order_factory;

public abstract class OrderFactory {
    public abstract Order createOrder(FoodItem foodItem, int quantity);
}
