package oop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        try {//try catch block to avoid crashing
            int age = scanner.nextInt();
            System.out.println("Age of a person: " + age);
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Invalid Input");
        }

    }
}
