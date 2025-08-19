
package com.carfolks;

import java.util.List;

// This class represents the detailed input about a car, 
// potentially extracted from a seller's video or listing.
public class CarInput {

    private String make;
    private String model;
    private int year;
    private double mileage;
    private String vin;
    private String color;
    private String bodyType; // e.g., Sedan, SUV, Truck
    private Engine engine;
    private Transmission transmission;
    private List<String> features; // e.g., "Panoramic Sunroof", "Heated Seats"
    private String condition; // e.g., "Excellent", "Good", "Fair"
    private String history; // e.g., "One owner", "Clean title", "No accidents"
    private String sellerType; // e.g., "Dealership", "Private Seller"
    private String sellerComments;

    // Nested static classes for structured data
    public static class Engine {
        private String type; // e.g., "V6", "4-Cylinder Turbo"
        private double displacement; // in liters
        private String fuelType; // e.g., "Gasoline", "Diesel", "Electric"

        // Getters and Setters
        public String getType() { return type; }
        public void setType(String type) { this.type = type; }
        public double getDisplacement() { return displacement; }
        public void setDisplacement(double displacement) { this.displacement = displacement; }
        public String getFuelType() { return fuelType; }
        public void setFuelType(String fuelType) { this.fuelType = fuelType; }
    }

    public static class Transmission {
        private String type; // e.g., "Automatic", "Manual"
        private int gears;

        // Getters and Setters
        public String getType() { return type; }
        public void setType(String type) { this.type = type; }
        public int getGears() { return gears; }
        public void setGears(int gears) { this.gears = gears; }
    }

    // Getters and Setters for CarInput fields
    public String getMake() { return make; }
    public void setMake(String make) { this.make = make; }
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
    public double getMileage() { return mileage; }
    public void setMileage(double mileage) { this.mileage = mileage; }
    public String getVin() { return vin; }
    public void setVin(String vin) { this.vin = vin; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public String getBodyType() { return bodyType; }
    public void setBodyType(String bodyType) { this.bodyType = bodyType; }
    public Engine getEngine() { return engine; }
    public void setEngine(Engine engine) { this.engine = engine; }
    public Transmission getTransmission() { return transmission; }
    public void setTransmission(Transmission transmission) { this.transmission = transmission; }
    public List<String> getFeatures() { return features; }
    public void setFeatures(List<String> features) { this.features = features; }
    public String getCondition() { return condition; }
    public void setCondition(String condition) { this.condition = condition; }
    public String getHistory() { return history; }
    public void setHistory(String history) { this.history = history; }
    public String getSellerType() { return sellerType; }
    public void setSellerType(String sellerType) { this.sellerType = sellerType; }
    public String getSellerComments() { return sellerComments; }
    public void setSellerComments(String sellerComments) { this.sellerComments = sellerComments; }
}
