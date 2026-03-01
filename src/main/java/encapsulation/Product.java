package encapsulation;

public class Product {
    private String productName;
    private String productCode;
    private double price;


    public Product(String productName, String productCode, double price) {
        this.productName = productName;
        this.productCode = productCode;
        this.price = price;

    }
    public String getProductName() {
        return productName;

    }
    public String getProductCode() {
        return productCode;

    }
    public double getPrice() {
        return price;

    }
    public void setProductName(String productName) {
        this.productName = productName;

    }
    public void setProductCode(String productCode) {
        this.productCode = productCode;

    }
    public void setPrice(double price) {
        this.price = price;

    }
    public void applyDiscount(double percentage){
        if (percentage > 0 && percentage <= 100) {
            price = price - (price * percentage / 100);
        } else {
            System.out.println("Invalid discount percentage ");
        }
    }
    public void info(){
        System.out.println("ProductName: "+ productName);
        System.out.println("ProductCode: "+ productCode);
        System.out.println("ProductPrice: "+ price);

    }
}
