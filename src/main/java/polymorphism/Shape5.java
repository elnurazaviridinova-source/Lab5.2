package polymorphism;

public class Shape5 {
    public void draw() {
        System.out.println("Drawing a shape");
    }

    public double calculateArea() {
        return 0;
    }
}

class Circle3 extends Shape5 {
    private double radius;

    public Circle3(double radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Drawing a Circle");
    }

    public double calculateArea() {
        return 3.14 * radius * radius;
    }
}

class Square extends Shape5 {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public void draw() {
        System.out.println("Drawing a Square");
    }

    public double calculateArea() {
        return side * side;
    }
}

class Triangle3 extends Shape5 {
    private double base;
    private double height;

    public Triangle3(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public void draw() {
        System.out.println("Drawing a Triangle");
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }
}

