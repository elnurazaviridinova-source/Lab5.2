package polymorphism;

public class Shape6 {
    public void draw() {
        System.out.println("Drawing a shape");
    }

    public double calculateArea() {
        return 0;
    }
}

class Circle6 extends Shape6 {
    private double radius;

    public Circle6(double radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Drawing a Circle");
    }

    public double calculateArea() {
        return 3.14 * radius * radius;
    }
}

class Cylinder extends Shape6 {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public void draw() {
        System.out.println("Drawing a Cylinder");
    }

    public double calculateArea() {
        // Total surface area = 2πr(h + r)
        return 2 * 3.14 * radius * (height + radius);
    }
}
