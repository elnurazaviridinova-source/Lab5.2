package encapsulation;

import org.example.constructor.Account;
import org.example.constructor.Rectangle;

public class MainEncapsulation {
    public static void main(String[] args) {
        //Person
        Person person = new Person("Anna", "Germany", 21);
        person.info();

        System.out.println("Updating info...");
        person.setName("Juma");
        person.setCountry("Turkey");
        person.setAge(19);
        person.info();
        System.out.println();

        //BankAccount
        BankAccount bankAccount = new BankAccount("245673", 2000.78);
        bankAccount.info();

        System.out.println("Updating balance...");
        bankAccount.setBalance(300.45);
        bankAccount.info();
        System.out.println();

        //Rectangle
        org.example.constructor.Rectangle rectangle = new Rectangle(3.0, 2.0);
        rectangle.info();
        System.out.println("Updating values...");
        rectangle.setLength(10.0);
        rectangle.setWidth(7.5);
        rectangle.info();
        System.out.println();

        //Employee
        Employee employee = new Employee("Anna", 3456478, 23000);
        employee.info();

        System.out.println("Updating ID and Name...");
        employee.setId(102677);
        employee.setName("Bob");
        employee.info();
        System.out.println();

        //Circle
        Circle circle = new Circle(78);
        circle.info();

        System.out.println("Updating radius...");
        circle.setRadius(54.0);
        circle.info();
        System.out.println();



        //Car
        Car car = new Car("Toyota","Camry", 2000,7000);
        car.info();

        System.out.println("Updating model and year....");
        car.setModel_name("Corolla");
        car.setYear(2002);
        car.info();
        System.out.println();

        //Student
        Student student = new Student(465728, "Anna");

        student.addGrade(85);
        student.addGrade(92);
        student.addGrade(150);
        student.info();
        System.out.println();

        //Book
        Book book = new Book("Harry Potter", "J.K.Rowling", 1500.0);
        book.info();

        System.out.println("Applying 20% discount...");
        book.applyDiscount(20);
        book.info();
        System.out.println();

        //Smartphone
        Smartphone phone = new Smartphone("Samsung", "Galaxy S23", 128);
        phone.info();

        System.out.println("Increasing storage...");
        phone.increaseStorage(64);
        phone.info();
        System.out.println();

        //Desktop
        Desktop desktop = new Desktop("Dell", "Intel I6", 16);
        desktop.info();
        System.out.println("Upgrading Ram....");
        desktop.upgradeRam(7);
        desktop.info();
        System.out.println();

        //House
        House house = new House("Main Street 2", 6, 120.7);
        house.info();

        double price = house.calculatePrice(1600);
        System.out.println("Total Price: " + price);
        System.out.println();

        //Account
        Account2 account = new Account2("A1001", "J.K", 1000.0);
        account.info();

        System.out.println("Depositing $500...");
        account.deposit(500);
        account.info();

        System.out.println("Withdrawing $300...");
        account.withdraw(300);
        account.info();

        System.out.println("Trying to withdraw $2000...");
        account.withdraw(2000);
        System.out.println();

        //Movie
        Movie movie = new Movie("Home alone", "Chris Columbus", 103);
        System.out.println("Movie details: ");
        System.out.println(movie.getMovieDetails());

        System.out.println("Updating movie....");
        movie.setTitle("Home alone2");
        movie.setDuration(120);

        System.out.println(movie.getMovieDetails());
        System.out.println();


        //Product
        Product product = new Product("Iphone", "ph001", 87000);
        System.out.println("Before discount: ");
        product.info();

        System.out.println("Applying discount 15% ");
        product.applyDiscount(15);

        System.out.println("After discount: ");
        product.info();
        System.out.println();
    }
}
