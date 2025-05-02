package OpenClose;

public class Regular implements DiscountStrategy{
    @Override
    public double getDiscount(double amount) {
        return amount * 0.1;
    }
}
