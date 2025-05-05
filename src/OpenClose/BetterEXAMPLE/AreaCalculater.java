package OpenClose.BetterEXAMPLE;

public class AreaCalculater {

    public double calculate(Shape shape) {
        if (shape.type == "rectangle") {
            return shape.length * shape.breadth;
        } else if (shape.type == "circle") {
            return 2 * Math.PI * shape.radius;
        }
        return 0;
    }
}
