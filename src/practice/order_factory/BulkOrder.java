package practice.order_factory;

public class BulkOrder extends Order{
    private int quantity;

    public BulkOrder(FoodItem foodItem, int quantity){
        super(foodItem);
        this.quantity = quantity;
    }

    @Override
    public void calculateCost() {
        double cost = this.quantity*this.getFoodItem().getPrice();
        cost = this.getDiscountStrategy().applyDiscount(cost);
        this.setCost(cost);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
