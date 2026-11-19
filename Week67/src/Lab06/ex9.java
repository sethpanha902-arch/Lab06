package Lab06;

import java.util.*;

abstract class Transport {
    double distance;

    Transport(double distance) {
        this.distance = distance;
    }

    abstract double calculate_fare();

    void display_fare() {
        System.out.println(
            getClass().getSimpleName()
            + " Fare: $"
            + calculate_fare()
        );
    }
}

class BusTransport extends Transport {

    BusTransport(double distance) {
        super(distance);
    }

    @Override
    double calculate_fare() {
        return distance * 1.5;
    }
}

class MetroTransport extends Transport {

    MetroTransport(double distance) {
        super(distance);
    }

    @Override
    double calculate_fare() {
        return 10 + (distance * 2);
    }
}

class TaxiTransport extends Transport {

    TaxiTransport(double distance) {
        super(distance);
    }

    @Override
    double calculate_fare() {
        return 20 + (distance * 5);
    }
}

public class ex9 {
    public static void main(String[] args) {

        List<Transport> transports = new ArrayList<>();

        transports.add(new BusTransport(10));
        transports.add(new MetroTransport(15));
        transports.add(new TaxiTransport(8));

        for (Transport t : transports) {
            t.display_fare();
        }
    }
}