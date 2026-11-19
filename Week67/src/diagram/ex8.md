classDiagram
    class Product {
        +String name
        +double price
        +Product(String name, double price)
        +get_info() String
    }

    class Electronics {
        +int warranty
        +Electronics(String name, double price, int warranty)
        +get_info() String
    }

    class Clothing {
        +String size
        +Clothing(String name, double price, String size)
        +get_info() String
    }

    class Book {
        +String author
        +Book(String name, double price, String author)
        +get_info() String
    }

    Product <|-- Electronics
    Product <|-- Clothing
    Product <|-- Book
