package inheritance;

public class Shape2 {
    public double getArea() {
        return 0;

    }
    public double getPerimeter() {
        return 0;
    }
}
class Circle extends Shape2 {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
