package Challenge;

class Discount {
    public double apply(double amount) {
        return amount - (amount * 0.05);
    }
}

class SeasonalDiscount extends Discount {

    @Override
    public double apply(double amount) {

        double price = super.apply(amount);

        return price - (price * 0.10);
    }

    public double withoutSuper(double amount) {
        return amount - (amount * 0.10);
    }
}

public class Challenge2 {
    public static void main(String[] args) {

        Discount d = new Discount();
        SeasonalDiscount s = new SeasonalDiscount();

        System.out.println("Original Price: 1000");

        System.out.println("Normal Discount: " +
                d.apply(1000));

        System.out.println("Seasonal Discount: " +
                s.apply(1000));

        System.out.println("Without super(): " +
                s.withoutSuper(1000));
    }
}

