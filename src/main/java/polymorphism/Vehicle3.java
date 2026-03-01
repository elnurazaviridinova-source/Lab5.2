package polymorphism;

public class Vehicle3 {
    private int speed;

    public Vehicle3() {
            speed = 0;
    }
    public void speedUp() {
        speed += 5;
        System.out.println("Vehicle speed: " + speed);
    }
}
class Car extends Vehicle3 {
    public void speedUp() {
        int speed = 0;
        speed += 20;
        System.out.println("Car speed: " + speed);
    }
}

class Bicycle extends Vehicle3 {
    public void speedUp() {
        int speed = 0;
        speed += 10;
        System.out.println("Bicycle speed: " + speed);
    }
}
