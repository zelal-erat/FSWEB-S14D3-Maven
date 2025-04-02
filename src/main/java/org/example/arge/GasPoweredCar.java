package org.example.arge;


public class GasPoweredCar extends CarSkeleton {
    private int averageKmPerLiter;
    private int cylinders;

    public GasPoweredCar(String name, String description, int averageKmPerLiter, int cylinders) {
        super(name, description);
    }


    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public double getAverageKmPerLiter() {
        return averageKmPerLiter;
    }

    public void setAvgKmPerLitre(int avgKmPerLitre) {
        this.averageKmPerLiter = avgKmPerLitre;
    }

    @Override
    protected void runEngine() {
        System.out.println("Gas-powered engine running");
    }
}