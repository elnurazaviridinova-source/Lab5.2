package polymorphism;

public class MainPolymorphism {
   public static void main(String[] args) {
       //Animal3
       Animal3 animal = new Animal3();
       Animal3 bird = new Bird();
       Animal3 cat3 = new Cat3();

       animal.sound();
       bird.sound();
       cat3.sound();
       System.out.println();

       //Vehicle3
       Vehicle3 vehicle3 = new Vehicle3();
       Vehicle3 car = new Car();
       Vehicle3 bicycle = new Bicycle();

       vehicle3.speedUp();
       car.speedUp();
       bicycle.speedUp();
       System.out.println();



       //Shape3
       Shape3 circle = new Circle(5);
       Shape3 rectangle = new Rectangle(4, 6);
       Shape3 triangle = new Triangle(3, 7);

       System.out.println("Circle area: " + circle.calculateArea());
       System.out.println("Rectangle area: " + rectangle.calculateArea());
       System.out.println("Triangle area: " + triangle.calculateArea());
       System.out.println();



       //Employee4
       Employee4 manager = new Manager(5000, 1000);
       Employee4 programmer = new Programmer(4000, 10);

       System.out.println("Manager salary: $" + manager.calculateSalary());
       System.out.println("Programmer salary: $" + programmer.calculateSalary());
       System.out.println();


       //Sports
       Sports sport1 = new Football();
       Sports sport2 = new Basketball();
       Sports sport3 = new Rugby();

       sport1.play();
       sport2.play();
       sport3.play();
       System.out.println();


       //Shape4
       Shape4 circle2 = new Circle2(5);
       Shape4 rectangle2 = new Rectangle2(4, 6);
       Shape4 triangle2 = new Triangle2(3, 4, 5, 3, 4);

       System.out.println("Circle area: " + circle2.getArea());
       System.out.println("Circle perimeter: " + circle2.getPerimeter());

       System.out.println("Rectangle area: " + rectangle2.getArea());
       System.out.println("Rectangle perimeter: " + rectangle2.getPerimeter());

       System.out.println("Triangle area: " + triangle2.getArea());
       System.out.println("Triangle perimeter: " + triangle2.getPerimeter());
       System.out.println();



       //Animal4
       Animal4 bird2 = new Bird2();
       Animal4 panthera = new Panthera();

       bird2.move();
       bird2.makeSound();

       panthera.move();
       panthera.makeSound();
       System.out.println();


       //Shape5
       Shape5 circle3    = new Circle3(5);
       Shape5 square = new Square(4);
       Shape5 triangle3 = new Triangle3(3, 6);

       circle3.draw();
       System.out.println("Circle area: " + circle.calculateArea());

       square.draw();
       System.out.println("Square area: " + square.calculateArea());

       triangle3.draw();
       System.out.println("Triangle area: " + triangle.calculateArea());
       System.out.println();


       //BankAccount3
       BankAccount3 savings = new SavingsAccount(2000);
       BankAccount3 checking = new CheckingAccount(1500);

       savings.deposit(500);
       savings.withdraw(1200);
       savings.withdraw(800);

       checking.deposit(200);
       checking.withdraw(1600);
       checking.withdraw(1000);
       System.out.println();



       //Animal5
       Animal5 lion = new Lion();
       Animal5 tiger = new Tiger();
       Animal5 panther = new Panther();

       lion.eat();
       lion.sound();

       tiger.eat();
       tiger.sound();

       panther.eat();
       panther.sound();
       System.out.println();


       //Vehicle4
       Vehicle4 car4 = new Car4();
       Vehicle4 motorcycle4 = new Motorcycle4();

       car4 .startEngine();
       car4 .stopEngine();

       motorcycle4.startEngine();
       motorcycle4.stopEngine();
       System.out.println();



       //Shape6
       Shape6 circle6 = new Circle6(5);
       Shape6 cylinder = new Cylinder(3, 7);

       circle6.draw();
       System.out.println("Circle area: " + circle.calculateArea());

       cylinder.draw();
       System.out.println("Cylinder total surface area: " + cylinder.calculateArea());
   }
}