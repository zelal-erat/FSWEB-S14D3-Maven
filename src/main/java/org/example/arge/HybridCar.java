package org.example.arge;

public class HybridCar extends CarSkeleton {
    private int avgKmPerLiter;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, int avgKmPerLiter, int batterySize, int cylinders) {
        super(name, description);
    }


    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }

    public double getAvgKmPerLiter() {
        return avgKmPerLiter;
    }

    public void setAvgKmPerLitre(int avgKmPerLiter) {
        this.avgKmPerLiter = avgKmPerLiter;
    }

    @Override
    protected void runEngine() {
        System.out.println("Hybrid engine running");
    }
}
