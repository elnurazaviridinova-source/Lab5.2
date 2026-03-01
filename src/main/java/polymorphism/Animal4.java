package polymorphism;

public class Animal4 {
    public void move() {
        System.out.println("Animal moves");
    }

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Bird2 extends Animal4 {
    public void move() {
        System.out.println("Bird flies in the sky");
    }

    public void makeSound() {
        System.out.println("Bird chirps");
    }
}

class Panthera extends Animal4 {
    public void move() {
        System.out.println("Panthera runs on the ground");
    }

    public void makeSound() {
        System.out.println("Panthera roars");
    }
}
