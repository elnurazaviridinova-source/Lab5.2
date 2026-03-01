package inheritance;

public class Vehicle2 {
    private String make;
    private String model;
    private int year;
    private String fuelType;

    public Vehicle2(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public String getFuelType() {
        return fuelType;
    }
    public double fuelEfficiency() {
        return 0;
    }
    public double maxSpeed() {
        return 0;
    }
    public double distanceTraveled(double hours) {
        return maxSpeed() * hours;
    }
}
class Car2 extends Vehicle2 {
    public Car2(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }
    public double fuelEfficiency() {
        return 15;
    }
    public double maxSpeed() {
        return 180;
    }
}
class Truck extends Vehicle2 {
    public Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }
    public double fuelEfficiency() {
        return 8;
    }
    public double maxSpeed() {
        return 120;
    }
}
class Motorcycle extends Vehicle2 {
    public Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }
    public double fuelEfficiency() {
        return 25;
    }
    public double maxSpeed() {
        return 200;
    }
}
