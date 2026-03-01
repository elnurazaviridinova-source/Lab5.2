package org.example.constructor;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;

    }
    public Rectangle(Rectangle rectangle){
        this.length = rectangle.length;
        this.width = rectangle.width;
    }

    public double getLength() {
        return length;

    }
    public double getWidth() {
        return width;

    }
    public void setLength(double length) {
        this.length = length;

    }
    public void setWidth(double width){
        this.width = width;

    }
    public void info(){
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);

    }
}
