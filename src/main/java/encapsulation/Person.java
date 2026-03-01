package encapsulation;

public class Person {
    private String name;
    private int age;
    private String country;

    public Person(String name, String country, int age) {
        this.name = name;
        this.country = country;
        this.age = age;

    }
    public String getName() {
        return name;

    }
    public String getCountry() {
        return country;

    }
    public int getAge() {
        return age;

    }
    public void setName(String name) {
        this.name = name;

    }
    public void setCountry(String country) {
        this.country = country;

    }
    public void setAge(int age) {
        this.age = age;
    }
    public void info(){
        System.out.println("Name: " + name);
        System.out.println("Country: " + country);
        System.out.println("Age: " + age);

    }
}
