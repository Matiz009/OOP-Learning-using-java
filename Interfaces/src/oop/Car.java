package oop;

public class Car implements CarbonFootPrintProducer{
    double milesDriven;

    public Car(double milesDriven) {
        this.milesDriven = milesDriven;
    }

    @Override
    public double getCarbonFootPrint() {
        double co2Produced=milesDriven* 0.0000292;
        System.out.println("Carbon Dioxide produced by car : "+co2Produced);
        return co2Produced;
    }
}
