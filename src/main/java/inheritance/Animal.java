package inheritance;

 public class Animal {
     public void makeSound() {
         System.out.println("Some generic animal sound");
     }
 }
class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}
