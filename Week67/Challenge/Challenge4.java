package Challenge;

class BankError extends Exception {
    public BankError(String message) {
        super(message);
    }
}

class InsufficientFundsError extends BankError {
    public InsufficientFundsError(String message) {
        super(message);
    }
}

class AccountNotFoundError extends BankError {
    public AccountNotFoundError(String message) {
        super(message);
    }
}

class CurrencyMismatchError extends BankError {
    public CurrencyMismatchError(String message) {
        super(message);
    }
}

class Bank {

    public void withdraw(double balance, double amount)
            throws BankError {

        if (amount > balance) {
            throw new InsufficientFundsError("Not enough money!");
        }

        System.out.println("Withdrawal successful.");
    }

    public void findAccount(boolean found) throws BankError {

        if (!found) {
            throw new AccountNotFoundError("Account not found!");
        }

        System.out.println("Account found.");
    }

    public void transfer(String currency1, String currency2)
            throws BankError {

        if (!currency1.equals(currency2)) {
            throw new CurrencyMismatchError("Wrong currency!");
        }

        System.out.println("Transfer successful.");
    }
}

public class Challenge4 {
    public static void main(String[] args) {

        Bank bank = new Bank();

        try {
            bank.withdraw(100, 200);
        } catch (BankError e) {
            System.out.println(e.getMessage());
        }

        try {
            bank.findAccount(false);
        } catch (BankError e) {
            System.out.println(e.getMessage());
        }

        try {
            bank.transfer("USD", "EUR");
        } catch (BankError e) {
            System.out.println(e.getMessage());
        }
    }
}
