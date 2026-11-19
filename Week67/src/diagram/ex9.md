classDiagram
    class Transport {
        <<abstract>>
        +double distance
        +Transport(double distance)
        +calculate_fare() double*
        +display_fare() void
    }

    class BusTransport {
        +BusTransport(double distance)
        +calculate_fare() double
    }

    class MetroTransport {
        +MetroTransport(double distance)
        +calculate_fare() double
    }

    class TaxiTransport {
        +TaxiTransport(double distance)
        +calculate_fare() double
    }

    Transport <|-- BusTransport
    Transport <|-- MetroTransport
    Transport <|-- TaxiTransport
