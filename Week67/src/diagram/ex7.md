classDiagram
    class Payment {
        <<abstract>>
        +process_payment(double amount)*
    }

    class CreditCardPayment {
        +process_payment(double amount) void
    }

    class PayPalPayment {
        +process_payment(double amount) void
    }

    class BankTransferPayment {
        +process_payment(double amount) void
    }

    Payment <|-- CreditCardPayment
    Payment <|-- PayPalPayment
    Payment <|-- BankTransferPayment
