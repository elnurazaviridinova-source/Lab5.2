package polymorphism;

public class Shape4 {
    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }
}

class Circle2 extends Shape4 {
    private double radius;

    public Circle2(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }
}

class Rectangle2 extends Shape4 {
    private double length;
    private double width;

    public Rectangle2(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }
}

class Triangle2 extends Shape4 {
    private double side1;
    private double side2;
    private double side3;
    private double height;
    private double base;

    public Triangle2(double side1, double side2, double side3, double base, double height) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}

