import java.util.Scanner;

// PaymentStrategy.java - Strategy interface
interface PaymentStrategy {
    void pay(double amount);
}

// Concrete implementation of Credit Card payment strategy
class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String name;
    private String expiryDate;
    private String cvv;

    public CreditCardPayment(String cardNumber, String name, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.name = name;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
        // Additional logic for credit card payment goes here
    }
}

// Concrete implementation of PayPal payment strategy
class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal.");
        // Additional logic for PayPal payment goes here
    }
}

// Concrete implementation of Bit Coin payment strategy
class BitCoinPayment implements PaymentStrategy {
    private String walletAddress;

    public BitCoinPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Bit Coin.");
        // Additional logic for Bit Coin payment goes here
    }
}

// Context class that uses the payment strategy
class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(double amount) {
        if (paymentStrategy != null) {
            paymentStrategy.pay(amount);
        } else {
            System.out.println("Please set a payment strategy before checkout.");
        }
    }
}

// Main class to test the Strategy Design Pattern
public class BillPayment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Payment Strategy:");
        System.out.println("1. Credit Card");
        System.out.println("2. PayPal");
        System.out.println("3. Bit Coin");
        System.out.print("Enter your choice (1/2/3): ");
        int paymentChoice = scanner.nextInt();

        PaymentStrategy paymentStrategy = null;

        switch (paymentChoice) {
            case 1:
                paymentStrategy = createCreditCardPayment(scanner);
                break;
            case 2:
                paymentStrategy = createPayPalPayment(scanner);
                break;
            case 3:
                paymentStrategy = createBitCoinPayment(scanner);
                break;
            default:
                System.out.println("Invalid choice. Exiting.");
                scanner.close();
                System.exit(0);
        }

        System.out.print("Enter Amount: ");
        double amount = scanner.nextDouble();

        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStrategy(paymentStrategy);
        cart.checkout(amount);

        scanner.close();
    }

    private static PaymentStrategy createCreditCardPayment(Scanner scanner) {
        System.out.print("Enter Credit Card Number (must be 16 digits): ");
        String cardNumber = scanner.next();
        System.out.print("Enter Name: ");
        String name = scanner.next();
        System.out.print("Enter Expiry Date (MM/YY): ");
        String expiryDate = scanner.next();
        System.out.print("Enter CVV (must be 3 digits): ");
        String cvv = scanner.next();
        return new CreditCardPayment(cardNumber, name, expiryDate, cvv);
    }

    private static PaymentStrategy createPayPalPayment(Scanner scanner) {
        System.out.print("Enter PayPal Email: ");
        String email = scanner.next();
        return new PayPalPayment(email);
    }

    private static PaymentStrategy createBitCoinPayment(Scanner scanner) {
        System.out.print("Enter Bit Coin Wallet Address: ");
        String walletAddress = scanner.next();
        return new BitCoinPayment(walletAddress);
    }
}
