package Challenge;


abstract class RentalItem {

    protected String name;

    public RentalItem(String name) {
        this.name = name;
    }

    public abstract double calculate_cost(int days);
}

class CarRental extends RentalItem {

    public CarRental(String name) {
        super(name);
    }

    public double calculate_cost(int days) {
        return days * 50;
    }
}

class BikeRental extends RentalItem {

    public BikeRental(String name) {
        super(name);
    }

    public double calculate_cost(int days) {
        return days * 10;
    }
}

class ToolRental extends RentalItem {

    public ToolRental(String name) {
        super(name);
    }

    public double calculate_cost(int days) {
        return days * 15;
    }
}

class CameraRental extends RentalItem {

    public CameraRental(String name) {
        super(name);
    }

    public double calculate_cost(int days) {
        return days * 25;
    }
}

public class Challenge8 {
    public static void main(String[] args) {

        RentalItem[] items = {
            new CarRental("Toyota"),
            new BikeRental("Mountain Bike"),
            new ToolRental("Drill"),
            new CameraRental("Canon")
        };

        int days = 3;

        for (RentalItem item : items) {
            System.out.println("Item: " + item.name);
            System.out.println("Cost: $" +
                    item.calculate_cost(days));
            System.out.println();
        }
    }
}
