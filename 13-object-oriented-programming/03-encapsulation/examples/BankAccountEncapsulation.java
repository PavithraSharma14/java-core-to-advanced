/**
 * Real-world example of encapsulation using a BankAccount class.
 */

class BankAccount {

    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class BankAccountEncapsulation {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.deposit(1000);
        account.deposit(500);

        System.out.println("Balance: " + account.getBalance());
    }
}
