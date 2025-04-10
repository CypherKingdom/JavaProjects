package practice.book_store;

public class FixedDiscount implements DiscountStrategy {
    private double discount;

    public FixedDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public double applyDiscount(double amount) {
        return amount-discount;
    }
}
