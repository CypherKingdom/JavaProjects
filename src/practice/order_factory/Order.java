package practice.order_factory;

//Product in Factory method dp
//Context int Strategy dp
public abstract class Order {
    private FoodItem foodItem;
    private DiscountStrategy discountStrategy;
    private double cost;

    public Order(FoodItem foodItem) {
        this.foodItem = foodItem;
    }

    public FoodItem getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(FoodItem foodItem) {
        this.foodItem = foodItem;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public abstract void calculateCost();
}
