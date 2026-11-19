package Lab06;
class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    double calculate_bonus() {
        return salary * 0.10;
    }
}

class Manager extends Employee {
    Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculate_bonus() {
        return salary * 0.20;
    }
}

class Intern extends Employee {
    Intern(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculate_bonus() {
        return salary * 0.05;
    }
}

public class ex2 {
    public static void main(String[] args) {
        Employee e = new Employee("John", 1000);
        Employee m = new Manager("David", 2000);
        Employee i = new Intern("Alex", 800);

        System.out.println(e.calculate_bonus());
        System.out.println(m.calculate_bonus());
        System.out.println(i.calculate_bonus());
    }
}