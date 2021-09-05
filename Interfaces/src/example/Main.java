package example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of hours: ");
        int hours = scanner.nextInt();
        System.out.print("Enter number of months: ");
        int months = scanner.nextInt();
        ArrayList<payable> payable = new ArrayList<>();

        Employee employee = new Employee(hours);
        stipend Stipend = new stipend(months);
        payable.add(employee);
        payable.add(Stipend);
        System.out.println("Total Salary : " +calculateTotalSalary(payable));
    }
    static int calculateTotalSalary(ArrayList<payable> payable){
        int totalSalary=0;
        for (payable pay:payable){
            totalSalary=totalSalary+pay.calculateSalary();
        }
        return totalSalary;
    }
}
