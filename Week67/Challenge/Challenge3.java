package Challenge;

interface Trackable {
    void track();
}

abstract class DeliveryService implements Trackable {

    protected double distance;

    public DeliveryService(double distance) {
        this.distance = distance;
    }

    public abstract double calculate_eta();
}

class CourierService extends DeliveryService {

    public CourierService(double distance) {
        super(distance);
    }

    public void track() {
        System.out.println("Courier is on the way.");
    }

    public double calculate_eta() {
        return distance / 30;
    }
}

class DroneDelivery extends DeliveryService {

    public DroneDelivery(double distance) {
        super(distance);
    }

    public void track() {
        System.out.println("Drone is delivering the package.");
    }

    public double calculate_eta() {
        return distance / 60;
    }
}

class CargoTruck extends DeliveryService {

    public CargoTruck(double distance) {
        super(distance);
    }

    public void track() {
        System.out.println("Cargo truck is on the road.");
    }

    public double calculate_eta() {
        return distance / 50;
    }
}

public class Challenge3 {
    public static void main(String[] args) {

        DeliveryService[] deliveries = {
            new CourierService(60),
            new DroneDelivery(60),
            new CargoTruck(60)
        };

        for (DeliveryService d : deliveries) {
            d.track();
            System.out.println("ETA: " +
                    d.calculate_eta() + " hours");
            System.out.println();
        }
    }
}

