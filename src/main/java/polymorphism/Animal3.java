package polymorphism;
 public class Animal3 {
    public void sound() {
        System.out.println("Some generic animal sound");
    }
}

class Bird extends Animal3 {
    public void sound() {
        System.out.println("Chirp chirp");
    }
}

class Cat3 extends Animal3 {
    public void sound() {
        System.out.println("Meow");
    }
}

