package SOLID.OpenClose;

public class Premium implements DiscountStrategy{
    @Override
    public double getDiscount(double amount) {
        return amount * 0.2;
    }
}
