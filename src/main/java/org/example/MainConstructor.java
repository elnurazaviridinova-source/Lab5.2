package org.example;

import org.example.constructor.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon i
public class MainConstructor {
    public static void main(String[] args) {
        //cat
        Cat cat = new Cat();
        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        System.out.println();

        //dog
        Dog dog = new Dog("Teddy", "grey");
        System.out.println(dog.getName());
        System.out.println(dog.getColor());
        System.out.println();

        //book
        Book book = new Book();
        Book book1 = new Book("Emma", "Anna");
        Book book2 = new Book("Emma", "Anna", 666);

        book.info();
        book1.info();
        book2.info();
        System.out.println();


        //student
        Student student = new Student();
        Student student1 = new Student(236745, "Anna", 67);

        student.info();
        student1.info();
        System.out.println();


        //Rectangle
        Rectangle rectangle1 = new Rectangle(23, 15);
        rectangle1.info();

        System.out.println("----Copy----");

        Rectangle rectangle2 = new Rectangle(rectangle1);
        rectangle2.info();
        System.out.println();


        //Account
        Account account1 = new Account("432356", 4666);
        account1.info();

        System.out.println();

        Account account2 = new Account("", -566);
        account2.info();
        System.out.println();


        //Car
        Car car1 = new Car();
        car1.info();

        System.out.println();

        Car car2 = new Car("Toyota", "Camry", 2002);
        car2.info();
        System.out.println();


        //Classroom
        String[] studentsList = {"Alice", "Bob", "Anna"};
        Classroom class1 = new Classroom("Math 101", studentsList);
        class1.info();
    }
}


