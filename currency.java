import java.util.Scanner;

public class currency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Currency Converter");
        System.out.println("1. INR to USD");
        System.out.println("2. USD to INR");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter amount in INR: ");
            double amountINR = scanner.nextDouble();
            double exchangeRate = 0.014; // 1 INR = 0.014 USD (you can update this value with the current exchange rate)
            double amountUSD = amountINR * exchangeRate;
            System.out.println("Amount in USD: " + amountUSD);
        } else if (choice == 2) {
            System.out.print("Enter amount in USD: ");
            double amountUSD = scanner.nextDouble();
            double exchangeRate = 71.43; // 1 USD = 71.43 INR (you can update this value with the current exchange rate)
            double amountINR = amountUSD * exchangeRate;
            System.out.println("Amount in INR: " + amountINR);
        } else {
            System.out.println("Invalid choice. Please select 1 or 2.");
        }

        scanner.close();
    }
}