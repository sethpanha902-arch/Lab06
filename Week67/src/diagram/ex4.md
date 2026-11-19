classDiagram
    class BankAccount {
        +String account_number
        +double balance
        +BankAccount(String account_number, double balance)
        +display_info() void
    }

    class SavingsAccount {
        +double interest_rate
        +SavingsAccount(String account_number, double balance, double interest_rate)
        +display_info() void
    }

    BankAccount <|-- SavingsAccount
