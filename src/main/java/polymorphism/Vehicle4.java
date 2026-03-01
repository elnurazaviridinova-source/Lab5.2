package polymorphism;

public class Vehicle4 {
    public void startEngine() {
        System.out.println("Vehicle engine starts");
    }

    public void stopEngine() {
        System.out.println("Vehicle engine stops");
    }
}

class Car4 extends Vehicle4 {
    public void startEngine() {
        System.out.println("Car engine starts with a key");
    }

    public void stopEngine() {
        System.out.println("Car engine stops when key is turned off");
    }
}

class Motorcycle4 extends Vehicle4 {
    public void startEngine() {
        System.out.println("Motorcycle engine starts with a kick");
    }

    public void stopEngine() {
        System.out.println("Motorcycle engine stops by pressing the button");
    }
}
