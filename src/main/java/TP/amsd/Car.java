package TP.amsd;

public class Car {
    private String plateNumber;
    private String brand;
    private double price;
    private boolean isRented;

    // Constructeurr
    public Car(String plateNumber, String brand, double price, boolean isRented) {
        this.plateNumber = plateNumber;
        this.brand = brand;
        this.price = price;
        this.isRented = isRented;
    }

    // Getters et Setters
    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }
}
