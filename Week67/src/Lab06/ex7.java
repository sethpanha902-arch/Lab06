package Lab06;

abstract class Payment {
    abstract void process_payment(double amount);
}

class CreditCardPayment extends Payment {
    @Override
    void process_payment(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card.");
    }
}

class PayPalPayment extends Payment {
    @Override
    void process_payment(double amount) {
        System.out.println("Paid $" + amount + " using PayPal.");
    }
}

class BankTransferPayment extends Payment {
    @Override
    void process_payment(double amount) {
        System.out.println("Paid $" + amount + " using Bank Transfer.");
    }
}

public class ex7 {
    public static void main(String[] args) {

        Payment p1 = new CreditCardPayment();
        Payment p2 = new PayPalPayment();
        Payment p3 = new BankTransferPayment();

        p1.process_payment(100);
        p2.process_payment(200);
        p3.process_payment(300);
    }
}
