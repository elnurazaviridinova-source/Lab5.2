package inheritance;

public class Shape {
    public double getArea() {
        return 0;
    }
}
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
public double getArea(){
    return length * width;
    }
}
