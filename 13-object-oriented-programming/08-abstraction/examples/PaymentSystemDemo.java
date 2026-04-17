/**
 * Real-world abstraction example: Payment System
 * User only sees "pay()", not internal implementation
 */

// Abstract class
abstract class Payment {

    // Abstract method
    abstract void pay(double amount);
}

// UPI Payment implementation
class UPIPayment extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

// Card Payment implementation
class CardPayment extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Card");
    }
}

public class PaymentSystemDemo {
    public static void main(String[] args) {

        Payment p1 = new UPIPayment();
        p1.pay(500);

        Payment p2 = new CardPayment();
        p2.pay(1000);
    }
}
