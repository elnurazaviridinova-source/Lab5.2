package encapsulation;

public class Desktop {
    private String brand;
    private String processor;
    private int ramSize;

    public Desktop(String brand, String processor, int ramSize) {
        this.brand = brand;
        this.processor = processor;
        this.ramSize = ramSize;

    }
    public String getBrand() {
        return brand;

    }
    public String getProcessor() {
        return processor;

    }
    public int getRamSize() {
        return ramSize;

    }
    public void setBrand(String brand) {
        this.brand = brand;

    }
    public void setProcessor(String processor) {
        this.processor = processor;

    }
    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;

    }
    public void upgradeRam(int additionalRam) {
        if (additionalRam > 0) {
            ramSize += additionalRam;
            System.out.println("Ram upgraded by: " + additionalRam + "GB");
        } else {
            System.out.println("Invalid Ram amount");

        }
    }
    public void info(){
        System.out.println("Brand: " + brand);
        System.out.println("Processor: " + processor);
        System.out.println("Ram: " + ramSize);
        }
    }

