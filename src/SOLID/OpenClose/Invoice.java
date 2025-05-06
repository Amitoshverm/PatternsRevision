package SOLID.OpenClose;

public class Invoice {
    private double amount;
    private DiscountStrategy discountStrategy;

    public Invoice(double amount, DiscountStrategy discountStrategy) {
        this.amount = amount;
        this.discountStrategy = discountStrategy;
    }

    public double getCalculatedDiscount() {
        return amount - discountStrategy.getDiscount(amount);
    }

    // ** here if we in future want a gold membership then we have to make changes to the code O/C is violated,
    // ** we have made a strategy interface, and the everytime we want anything extra like new membership we can create a new class
//    public double calculateDiscount(String customerType) {
//        if (customerType.equals("REGULAR")) {
//            return amount * 0.1;
//        }
//        else if (customerType.equals("PREMIUM")) {
//            return amount * 0.2;
//        }
//        else {
//            return 0;
//        }
//    }


}
