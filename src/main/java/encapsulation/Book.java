package encapsulation;

public class Book {
    private String title;
    private String author;
    private double price;


    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;

    }
    public String getTitle() {
        return title;

    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;

    }
    public void setTitle(String title) {
        this.title = title;

    }
    public void setAuthor(String author) {
        this.author = author;

    }
    public void setPrice(double price) {
        this.price = price;

    }
    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            double discountAmount = price * percentage / 100;
            price -= discountAmount;
            System.out.println("Discount applied: " + percentage + "%");
        } else {
            System.out.println("Invalid discount percentage!");
        }
    }
    public void info() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);

    }

        // Main method for testing
        public static void main(String[] args) {


        }
    }

