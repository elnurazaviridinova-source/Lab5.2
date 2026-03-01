package inheritance;

public class Employee2 {
    public void work() {
        System.out.println("Employee is working");
    }

    public double getSalary() {
        return 60000;
    }
}
class HRManager extends Employee2 {
    public void work() {
        System.out.println("HR Manager is managing employees");

    }
    public void addEmployee(String name) {
        System.out.println("Added new employee: " + name);
    }
}

