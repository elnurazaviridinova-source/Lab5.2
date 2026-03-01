package inheritance;

public class Animal2 {
    public void move() {
        System.out.println("Animal is moving");
    }
}
    class Cheetah extends Animal2 {
        public void move() {
            System.out.println("Cheetah runs very fast");
        }
    }
