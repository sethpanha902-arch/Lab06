package Challenge;


class InsurancePolicy {
    public double calculate_premium() {
        return 100.0;
    }
}

class HealthInsurance extends InsurancePolicy {
    @Override
    public double calculate_premium() {
        return 200.0;
    }
}

class CarInsurance extends InsurancePolicy {
    @Override
    public double calculate_premium() {
        return 150.0;
    }

    public double calculate_premium(int age) {
        return age > 60 ? 300.0 : 150.0;
    }

    public double calculate_premium(int age, int accidentHistory) {
        return 150.0 + (age * 2) + (accidentHistory * 50);
    }
}

public class EXChallenge1 {
    public static void main(String[] args) {

        InsurancePolicy p1 = new HealthInsurance();
        InsurancePolicy p2 = new CarInsurance();

        System.out.println("Health Premium: " +
                p1.calculate_premium());

        System.out.println("Car Premium: " +
                p2.calculate_premium());

        CarInsurance car = new CarInsurance();

        System.out.println("Car Premium by Age: " +
                car.calculate_premium(65));

        System.out.println("Car Premium by Age and Accidents: " +
                car.calculate_premium(25, 2));
    }
}
