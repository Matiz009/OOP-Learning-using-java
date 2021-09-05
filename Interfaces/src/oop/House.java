package oop;

public class House implements CarbonFootPrintProducer{
    double coveredArea;

    public House(double coveredArea) {
        this.coveredArea = coveredArea;
    }

    @Override
    public double getCarbonFootPrint() {
        double co2Produced=coveredArea* 0.005;
        System.out.println("Total Carbon Dioxide Produced by House : "+co2Produced);
        return co2Produced;
    }
}
