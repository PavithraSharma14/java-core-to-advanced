
/**
 * Real-world example using interface
 * User doesn't care HOW payment works
 */

interface Payment {
    void pay(double amount);
}

class UPIPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid via UPI: " + amount);
    }
}

class CardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid via Card: " + amount);
    }
}

public class PaymentSystemDemo {

    public static void main(String[] args) {

        Payment p;

        p = new UPIPayment();
        p.pay(500);

        p = new CardPayment();
        p.pay(1000);
    }
}