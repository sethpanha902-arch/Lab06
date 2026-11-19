package Lab06;
class Vehicle {
    String brand;
    int year;
    Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void start() {
        System.out.println(brand + " is starting.");
    }
}

class Car extends Vehicle {
    int num_doors;

    Car(String brand, int year, int num_doors) {
        super(brand, year);
        this.num_doors = num_doors;
    }

    void honk() {
        System.out.println("Beep Beep!");
    }
}

public class ex1 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Toyota", 2022);
        Car c = new Car("Honda", 2024, 4);

        v.start();
        c.start();
        c.honk();
    }
}