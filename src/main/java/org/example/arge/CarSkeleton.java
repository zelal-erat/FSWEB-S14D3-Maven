package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Public methods
    public void startEngine() {
        System.out.println("Engine starting");
        runEngine();
    }

    public void drive() {
        System.out.println("Driving the car");
        runEngine();
    }

    // Protected method
    protected void runEngine() {
        System.out.println("Running engine");
    }
}
