package inheritance;

class Employee3 {
    private String name;
    private String address;
    private double salary;
    private String jobTitle;

    public Employee3(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double calculateBonus() {
        return salary * 0.1;
    }

    public void generatePerformanceReport() {
        System.out.println("Performance report for " + name + " (" + jobTitle + ")");
        System.out.println("Salary: $" + salary);
        System.out.println("Address: " + address);
    }

    public void manageProjects() {
        System.out.println(name + " is managing general projects.");
    }
}

class Manager extends Employee3 {
    public Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    public double calculateBonus() {
        return getSalary() * 0.2;
    }

    public void manageProjects() {
        System.out.println(getName() + " is overseeing multiple teams and projects.");
    }
}

class Developer extends Employee3 {
    public Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }

    public double calculateBonus() {
        return getSalary() * 0.15;
    }

    public void generatePerformanceReport() {
        super.generatePerformanceReport();
        System.out.println("Coding performance and project contributions are excellent.");
    }
}

class Programmer extends Employee3 {
    public Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }

    public double calculateBonus() {
        return getSalary() * 0.12;
    }

    public void manageProjects() {
        System.out.println(getName() + " is implementing and debugging code for projects.");
    }
}
