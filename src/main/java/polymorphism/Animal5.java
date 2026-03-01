package polymorphism;

public class Animal5 {
    public void eat() {
        System.out.println("Animal eats food");
    }

    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Lion extends Animal5 {
    public void eat() {
        System.out.println("Lion eats meat");
    }

    public void sound() {
        System.out.println("Lion roars");
    }
}

class Tiger extends Animal5 {
    public void eat() {
        System.out.println("Tiger eats meat");
    }

    public void sound() {
        System.out.println("Tiger growls");
    }
}

class Panther extends Animal5 {
    public void eat() {
        System.out.println("Panther eats meat");
    }

    public void sound() {
        System.out.println("Panther growls softly");
    }
}
