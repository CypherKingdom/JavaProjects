package design_patterns.architectural.mvcExample2;
//model
public class Car {
    private String licensePlate;
    private String brand;
    private String model;
    private double retalPrice;
    private boolean available;

    
    public Car(String licensePlate, String brand, String model, double retalPrice) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.model = model;
        this.retalPrice = retalPrice;
        this.available = true;
    }
    public String getLicensePlate() {
        return licensePlate;
    }
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public double getRetalPrice() {
        return retalPrice;
    }
    public void setRetalPrice(double retalPrice) {
        this.retalPrice = retalPrice;
    }
    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
    @Override
    public String toString() {
        return "Car [licensePlate=" + licensePlate + ", brand=" + brand + ", model=" + model + ", retalPrice="
                + retalPrice + ", available=" + available + "]";
    }

    

}
