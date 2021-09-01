import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = scanner.nextLine();
        BankAccount bankAccount = new BankAccount(name);
        while (true) {
            System.out.println("Press 1 to deposit money");
            System.out.println("Press 2 to withdraw money");
            System.out.println("Press 0 to exit");
            System.out.println("Enter your choice");
            int dec = scanner.nextInt();
            switch (dec) {
                case 0 -> System.exit(0);
                case 1 -> {
                    System.out.print("Enter the amount you want to deposit:");
                    double amount = scanner.nextDouble();
                    bankAccount.deposit(amount);
                    System.out.println("Your name is " + bankAccount.getOwner());

                }
                case 2 -> {
                    System.out.print("Enter the amount you want to withdraw:");
                    double withDrawAmount = scanner.nextDouble();
                    bankAccount.withdraw(withDrawAmount);
                    System.out.println("Your name is " + bankAccount.getOwner());


                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
}