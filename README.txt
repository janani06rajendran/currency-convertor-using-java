
                                               INTERN-SAVY   JAVA PROGRAMMING TASK

 1) Creating a currency converter using Java in Visual Studio Code involves building a simple application that takes a user's input in one currency and converts it to another currency based on the current exchange rate. In this task  we'll use the exchange rate between INR  to USD and USD toINR .

Here's a step-by-step process on how to create the currency converter:

Step 1: Setup Visual Studio Code
If you haven't already installed Visual Studio Code and Java, you should do so first. Follow the official guides for installation.

Step 2: Create a new Java Project
Open Visual Studio Code and create a new folder for your project. Inside the folder, create a new Java file named "Currency.java."

Step 3: Define the Currency Class
Open "Currency.java" and define the Currencyclass. This class will contain the logic for currency conversion.

JAVA PROGRAM;
import java.util.Scanner;

public class Currency {

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
            double exchangeRate = 0.014; // 1 INR = 0.014 USD 
            double amountUSD = amountINR * exchangeRate;
            System.out.println("Amount in USD: " + amountUSD);
        } else if (choice == 2) {
            System.out.print("Enter amount in USD: ");
            double amountUSD = scanner.nextDouble();
            double exchangeRate = 71.43; // 1 USD = 71.43 INR 
            double amountINR = amountUSD * exchangeRate;
            System.out.println("Amount in INR: " + amountINR);
        } else {
            System.out.println("Invalid choice. Please select 1 or 2.");
        }

        scanner.close();
    }
}

Step 4: Compile and Run the Program
Open the terminal in Visual Studio Code and navigate to the folder containing "Currency.java." Compile the Java file using the following command.
This will generate a "Currency.class" file. Now, run the program using the following command.

Step 5: Test the Currency Converter
Once the program is running, it will prompt you to enter an amount in INR. Input a value, and it will calculate and display the equivalent amount in USD based on the exchange rate.

Keep in mind that the exchange rate used in this example is just a placeholder and might not reflect the current real-world exchange rate. For a real-world application, you would need to fetch the latest exchange rate from a reliable source, such as an API.

Additionally, you can enhance the program by allowing the user to choose different currency pairs, handle incorrect input, or add error handling for network-related issues when fetching real-time exchange rates.

This example provides a basic foundation for a currency converter in Java. Depending on your requirements, you can extend and customize the application to suit your needs.