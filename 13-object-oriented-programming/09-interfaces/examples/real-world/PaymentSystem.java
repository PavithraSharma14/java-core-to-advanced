
/**
 * Real-world example using interface
 * User doesn't care HOW payment works
 */

interface PaymentInterface {
    void pay(double amount);
}

class UPIPaymentInterface implements PaymentInterface {
    public void pay(double amount) {
        System.out.println("Paid via UPI: " + amount);
    }
}

class CardPaymentInterface implements PaymentInterface {
    public void pay(double amount) {
        System.out.println("Paid via Card: " + amount);
    }
}

public class PaymentSystem {

    public static void main(String[] args) {

        PaymentInterface p;

        p = new UPIPaymentInterface();
        p.pay(500);

        p = new CardPaymentInterface();
        p.pay(1000);
    }
}