package inheritance;

public class MainInheritance {
   public static void main(String[] args) {
       //Animal
       Animal animal = new Animal();
       animal.makeSound();

       Cat cat = new Cat();
       cat.makeSound();
       System.out.println();


       //Vehicle
       Vehicle vehicle = new Vehicle();
       vehicle.drive();

       Car car = new Car();
       car.drive();
       System.out.println();


       //Shape
       Shape shape = new Shape();
       System.out.println("Generic shape area: " + shape.getArea());

       Rectangle rectangle = new Rectangle(5, 10);
       System.out.println("Rectangle area: " + rectangle.getArea());
       System.out.println();


       //Employee2
       Employee2 employee2 = new Employee2();
       employee2.work();
       System.out.println("Salary: " + employee2.getSalary());

       HRManager hrManager = new HRManager();
       hrManager.work();
       hrManager.addEmployee("Liam");
       System.out.println("Salary: " + hrManager.getSalary());
       System.out.println();


       //BankAccount2
       SavingsAccount savingsAccount = new SavingsAccount(800);

       savingsAccount.deposit(100);
       System.out.println("Balance: " + savingsAccount.getBalance());

       savingsAccount.withdraw(450);
       System.out.println("Balance: " + savingsAccount.getBalance());

       savingsAccount.withdraw(230);
       System.out.println("Balance: " + savingsAccount.getBalance());
       System.out.println();


       //Animal2
       Animal2 genericAnimal = new Animal2();
       genericAnimal.move();

       Cheetah cheetah = new Cheetah();
       cheetah.move();
       System.out.println();


       //Person2
       Employee employee = new Employee("jk", "Smith", 632456, "Developer");

       System.out.println("First Name: " + employee.getFirstName());
       System.out.println("Last Name: " + employee.getLastName());
       System.out.println("Employee ID: " + employee.getEmployeeId());
       System.out.println();


       //Shape2
       Circle circle = new Circle(3);

       System.out.println("Circle Area: " + circle.getArea());
       System.out.println("Circle Perimeter: " + circle.getPerimeter());
       System.out.println();


       //Vehicle2
       Car2 car2 = new Car2("Toyota", "Camry", 2020, "Petrol");
       Truck truck = new Truck("Volvo", "FH", 2018, "Diesel");
       Motorcycle moto = new Motorcycle("Yamaha", "R1", 2021, "Petrol");

       System.out.println(car2.getMake() + " max speed: " + car2.maxSpeed() + " km/h, Fuel efficiency: " + car2.fuelEfficiency() + " km/l");
       System.out.println(truck.getMake() + " max speed: " + truck.maxSpeed() + " km/h, Fuel efficiency: " + truck.fuelEfficiency() + " km/l");
       System.out.println(moto.getMake() + " max speed: " + moto.maxSpeed() + " km/h, Fuel efficiency: " + moto.fuelEfficiency() + " km/l");

       double hours = 2.5;
       System.out.println(car2.getMake() + " distance traveled in " + hours + " hours: " + car2.distanceTraveled(hours) + " km");
       System.out.println(truck.getMake() + " distance traveled in " + hours + " hours: " + truck.distanceTraveled(hours) + " km");
       System.out.println(moto.getMake() + " distance traveled in " + hours + " hours: " + moto.distanceTraveled(hours) + " km");
       System.out.println();



       //Employee3
       Manager manager = new Manager("Alice Johnson", "123 Main St", 90000);
       Developer developer = new Developer("Bob Smith", "456 Oak St", 75000);
       Programmer programmer = new Programmer("Charlie Lee", "789 Pine St", 60000);

       manager.generatePerformanceReport();
       System.out.println("Bonus: $" + manager.calculateBonus());
       manager.manageProjects();
       System.out.println();

       developer.generatePerformanceReport();
       System.out.println("Bonus: $" + developer.calculateBonus());
       developer.manageProjects();
       System.out.println();

       programmer.generatePerformanceReport();
       System.out.println("Bonus: $" + programmer.calculateBonus());
       programmer.manageProjects();
       System.out.println();
   }
}