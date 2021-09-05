package oop;

import java.util.ArrayList;
import java.util.Scanner;

public class Main  {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the milesDriven by car: ");
        double miles=scanner.nextDouble();
        System.out.print("Enter the area of House: ");
        double area=scanner.nextDouble();
        Car car = new Car(miles);
        House house = new House(area);
        ArrayList<CarbonFootPrintProducer> carbonFootPrintProducers = new ArrayList<>();
        carbonFootPrintProducers.add(car);
        carbonFootPrintProducers.add(house);
        System.out.println("The Total Carbon Foot is "+ calculateTotalFootPrint(carbonFootPrintProducers)+" tons(s) of CO2.");


    }
    public static double  calculateTotalFootPrint(ArrayList<CarbonFootPrintProducer> entities){
        double totalCarbon =0;
        for(CarbonFootPrintProducer alpha :entities){
            totalCarbon= totalCarbon+alpha.getCarbonFootPrint();
        }
        return totalCarbon;
    }
}
