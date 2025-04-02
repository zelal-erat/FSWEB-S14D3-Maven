package org.example.company;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    // Constructor
    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = Boolean.TRUE;
        this.wheels = 4;
    }

    // Getter methods
    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    // startEngine() metodunu güncelle
    public String startEngine() {
        // getClass().getSimpleName() sınıf ismini alır
        System.out.println(getClass().getSimpleName());  // Loglamak için
        return "the car's engine is starting";
    }

    // accelerate() metodunu güncelle
    public String accelerate() {
        System.out.println(getClass().getSimpleName());  // Loglamak için
        return "the car is accelerating";
    }

    // brake() metodunu güncelle
    public String brake() {
        System.out.println(getClass().getSimpleName());  // Loglamak için
        return "the car is braking";
    }

    @Override
    public String toString() {
        return "Car[name=" + name + ", cylinders=" + cylinders + ", engine=" + engine + ", wheels=" + wheels + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return cylinders == car.cylinders && name.equals(car.name);
    }
}
