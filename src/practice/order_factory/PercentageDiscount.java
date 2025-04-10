package practice.order_factory;

//Concrete startegy
public class PercentageDiscount implements DiscountStrategy{
    private int percentage;

    public PercentageDiscount(int percentage) {
        this.percentage = percentage;
    }

    @Override
    public double applyDiscount(double amount) {
        double discount =amount*this.percentage/100;
        System.out.println("discount: " + discount);
        return amount - discount;
    }   
}
