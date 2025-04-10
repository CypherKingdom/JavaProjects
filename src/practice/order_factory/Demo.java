package practice.order_factory;

public class Demo {
    public static void main(String[] args) {
        OrderFactory factory = new BulkOrderFactory();
        FoodItem item = new FoodItem("Napoli", 10, "pizza");
        Order order = factory.createOrder(item, 5);
        order.setDiscountStrategy(new PercentageDiscount(30));
        order.calculateCost();
        System.out.println(order.getCost());

    }
}
