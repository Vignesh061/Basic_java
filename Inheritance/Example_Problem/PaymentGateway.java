import java.util.Scanner;

// Custom Exception for Insufficient Funds
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// Custom Exception for Invalid Card Details
class InvalidCardException extends Exception {
    public InvalidCardException(String message) {
        super(message);
    }
}

public class PaymentGateway {

    // Method to simulate payment processing
    public static void processPayment(double amount, String cardNumber) throws InsufficientFundsException, InvalidCardException {
        // Check for a valid card number (dummy check for simplicity)
        if (cardNumber.length() != 16) {
            throw new InvalidCardException("Invalid card number. Must be 16 digits.");
        }
        
        // Dummy account balance
        double accountBalance = 5000.0;

        // Check if account has enough balance
        if (amount > accountBalance) {
            throw new InsufficientFundsException("Insufficient funds. Your account balance is " + accountBalance);
        }

        // Simulate successful payment
        System.out.println("Payment of " + amount + " was successful.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input payment amount
            System.out.print("Enter payment amount: ");
            double amount = scanner.nextDouble();
            scanner.nextLine();  // Consume newline

            // Input card number
            System.out.print("Enter your 16-digit card number: ");
            String cardNumber = scanner.nextLine();

            // Process payment
            processPayment(amount, cardNumber);

        } catch (InsufficientFundsException e) {
            System.out.println("Payment failed: " + e.getMessage());
        } catch (InvalidCardException e) {
            System.out.println("Payment failed: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("Thank you for using our payment gateway.");
        }

        scanner.close();
    }
}