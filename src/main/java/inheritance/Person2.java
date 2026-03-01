package inheritance;

public class Person2 {
    private String firstName;
    private String lastName;

    public Person2(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }
    public String getFirstName() {
        return firstName;

    }
    public String getLastName() {
        return lastName;
    }
}
class Employee extends Person2 {
    private int employeeId;
    private String jobTitle;

    public Employee(String firstName, String lastName, int employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;

    }

    public String getLastName() {
        return super.getLastName() + " (" + jobTitle + ")";

    }
    public int getEmployeeId() {
        return employeeId;
    }
}


