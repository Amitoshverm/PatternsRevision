package SOLID.OpenClose.BetterEXAMPLE;

public class Rectangle implements FixedShape{
    double length;
    double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }


    @Override
    public double areaCalculate() {
        return length * breadth;
    }
}
