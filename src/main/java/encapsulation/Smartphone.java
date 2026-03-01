package encapsulation;

public class Smartphone {
    private String brand;
    private String model;
    private int storageCapacity;


    public Smartphone(String brand, String model, int storageCapacity) {
        this.brand = brand;
        this.model = model;
        this.storageCapacity = storageCapacity;

    }
    public String getBrand() {
        return brand;

    }
    public String getModel() {
        return model;

    }
    public int getStorageCapacity() {
        return storageCapacity;

    }
    public void setBrand(String brand) {
        this.brand = brand;

    }
    public void setModel(String model) {
        this.model = model;

    }
    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;

    }
    public void increaseStorage(int additionalStorage) {
        if (additionalStorage > 0) {
            storageCapacity += additionalStorage;
            System.out.println("Storage increased by " + additionalStorage + " GB.");
        } else {
            System.out.println("Invalid storage amount!");
        }
    }
    public void info() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Storage: " + storageCapacity + " GB");
        }
    }
