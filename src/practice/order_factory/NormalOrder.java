package practice.order_factory;

public class NormalOrder extends Order{

    public NormalOrder(FoodItem foodItem){
        super(foodItem);
    }

    @Override
    public void calculateCost() {
        double cost = this.getFoodItem().getPrice();
        cost = this.getDiscountStrategy().applyDiscount(cost);
        this.setCost(cost);
    }
}
