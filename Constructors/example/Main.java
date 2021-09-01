
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name=scanner.nextLine();
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        System.out.println("Enter your salary");
        double salary = scanner.nextDouble();
        System.out.println("Enter your Location");
        String location = scanner.nextLine();
        Employee employee = new Employee(name,age,salary,location);
        System.out.println("Enter the amount");
        double raise= scanner.nextDouble();
        employee.raise(raise);
    }
}