package encapsulation;

public class Car {
    private String company_name;
    private String model_name;
    private int year;
    private int mileage;

    public Car(String company_name, String model_name, int year,int mileage) {
        this.company_name = company_name;
        this.model_name = model_name;
        this.year = year;
        this.mileage = mileage;

    }
    public String getCompany_name() {
        return company_name;

    }
    public String getModel_name() {
        return model_name;

    }
    public int getYear() {
        return year;

    }
    public int getMileage() {
        return mileage;

    }
    public void setCompany_name(String company_name) {
        this.company_name = company_name;

    }
    public void setModel_name(String model_name) {
        this.model_name = model_name;

    }
    public void setYear(int year) {
        this.year = year;

    }
    public void setMileage(int mileage) {
        this.mileage = mileage;

    }
    public void info(){
        System.out.println("Company Name: " + company_name);
        System.out.println("Model Name: " + model_name);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage);

    }
}
