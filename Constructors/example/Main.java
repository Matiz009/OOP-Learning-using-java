import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name=scanner.nextLine();
        int age = scanner.nextInt();
        double salary = scanner.nextDouble();
        String location = scanner.nextLine();
        Employee employee = new Employee(name,age,salary,location);
        System.out.println("Enter the amount");
        double raise= scanner.nextDouble();
        employee.raise(raise);
    }
}