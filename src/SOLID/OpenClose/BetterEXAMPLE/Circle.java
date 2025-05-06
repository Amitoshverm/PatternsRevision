package SOLID.OpenClose.BetterEXAMPLE;

public class Circle implements FixedShape{

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double areaCalculate() {
        return 2 * Math.PI * radius;
    }
}
