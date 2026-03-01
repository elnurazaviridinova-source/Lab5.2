package inheritance;

public class Vehicle {
    public void drive() {
        System.out.println("Vehicle is moving");

    }
}

class Car extends Vehicle{
    public void drive() {
        System.out.println("Repairing a cer");
    }
}
