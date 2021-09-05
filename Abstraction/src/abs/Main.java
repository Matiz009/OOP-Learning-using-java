package abs;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length: ");
        double length= scanner.nextDouble();
        System.out.println("Press 1 to calculate area of rectangle");
        System.out.println("Press 2 to calculate area of circle");
        System.out.println("Press 0 to exit");
        System.out.print("Enter your choice: ");
        int dec= scanner.nextInt();
        if (dec==1){
            System.out.print("Enter the width: ");
            double width= scanner.nextDouble();
            rectangle rect = new rectangle(length,width);
            rect.calculateArea(length);
        }else if(dec==2){
            circle Circle = new circle(length);
            Circle.calculateArea(length);
        }else if(dec==0){
            System.exit(0);
        }else{
            System.out.println("Invalid Input");
        }
	
    }
}
