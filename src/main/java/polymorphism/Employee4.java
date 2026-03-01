package polymorphism;

public class Employee4 {
    public double calculateSalary() {
        return 0;
    }
}

class Manager extends Employee4 {
    private double baseSalary;
    private double bonus;

    public Manager(double baseSalary, double bonus) {
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    public double calculateSalary() {
        return baseSalary + bonus;
    }
}

class Programmer extends Employee4 {
    private double baseSalary;
    private double overtime;

    public Programmer(double baseSalary, double overtime) {
        this.baseSalary = baseSalary;
        this.overtime = overtime;
    }

    public double calculateSalary() {
        return baseSalary + (overtime * 20);
    }
}
