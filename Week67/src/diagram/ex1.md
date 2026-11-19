classDiagram
    class Vehicle {
        +String brand
        +int year
        +Vehicle(String brand, int year)
        +start()
    }

    class Car {
        +int num_doors
        +Car(String brand, int year, int num_doors)
        +honk()
    }

    Vehicle <|-- CarclassDiagram
    class Vehicle {
        +String brand
        +int year
        +Vehicle(String brand, int year)
        +start()
    }

    class Car {
        +int num_doors
        +Car(String brand, int year, int num_doors)
        +honk()
    }

    Vehicle <|-- Car