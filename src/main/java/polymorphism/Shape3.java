package polymorphism;

public class Shape3 {
    public double calculateArea() {
        return 0;
    }
}
class Circle extends Shape3 {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return 3.14 * radius * radius;
    }
}
class Rectangle extends Shape3 {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double calculateArea() {
        return length * width;
    }
}
class Triangle extends Shape3 {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

       public double calculateArea() {
        return 0.5 * base * height;
    }
}

