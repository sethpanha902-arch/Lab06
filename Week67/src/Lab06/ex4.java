package Lab06;

class BankAccount {
    String account_number;
    double balance;

    BankAccount(String account_number, double balance) {
        this.account_number = account_number;
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    double interest_rate;

    SavingsAccount(String account_number,
                   double balance,
                   double interest_rate) {

        super(account_number, balance);
        this.interest_rate = interest_rate;
    }
}

public class ex4 {
    public static void main(String[] args) {
        SavingsAccount account =
            new SavingsAccount("ACC001", 1000, 0.05);

        System.out.println("Account: " + account.account_number);
        System.out.println("Balance: " + account.balance);
        System.out.println("Interest: " + account.interest_rate);
    }
}