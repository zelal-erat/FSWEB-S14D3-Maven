package org.example.arge;

public class ElectricCar extends CarSkeleton {
    private double avgKmPerCharge;
    private int batterySize;
    private String modelName;
    private String brandName;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
    }


    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public void setAvgKmPerCharge(int avgKmPerCharge) {
        this.avgKmPerCharge = avgKmPerCharge;
    }

    @Override
    protected void runEngine() {
        System.out.println("Electric engine running");
    }
}
