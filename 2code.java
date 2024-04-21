import java.util.Scanner;

public class SimpleBankingApp {
    private static double balance = 0; // Initial balance

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        while (!quit) {
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    withdraw(withdrawalAmount);
                    break;
                case 4:
                    quit = true;
                    System.out.println("Thank you for using our banking app.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
        scanner.close();
    }

    private static void checkBalance() {
        System.out.println("Your balance is: $" + balance);
    }

    private static void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("$" + amount + " has been deposited into your account.");
        } else {
            System.out.println("Invalid amount. Deposit amount must be greater than 0.");
        }
    }

    private static void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("$" + amount + " has been withdrawn from your account.");
            } else {
                System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("Invalid amount. Withdrawal amount must be greater than 0.");
        }
    }
}
