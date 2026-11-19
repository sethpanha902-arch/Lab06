package Challenge;


class Person {

    protected String name;

    public Person(String name) {
        this.name = name;
    }
}

class Employee extends Person {

    public Employee(String name) {
        super(name);
    }

    public void work() {
        System.out.println(name + " is working.");
    }

    public String get_role() {
        return "Employee";
    }
}

abstract class Teacher extends Employee {

    public Teacher(String name) {
        super(name);
    }

    public abstract void work();

    public abstract String get_role();
}

class MathTeacher extends Teacher {

    public MathTeacher(String name) {
        super(name);
    }

    public void work() {
        System.out.println(name + " teaches Mathematics.");
    }

    public String get_role() {
        return "Math Teacher";
    }
}

class ScienceTeacher extends Teacher {

    public ScienceTeacher(String name) {
        super(name);
    }

    public void work() {
        System.out.println(name + " teaches Science.");
    }

    public String get_role() {
        return "Science Teacher";
    }
}

public class Challenge9 {
    public static void main(String[] args) {

        Employee[] teachers = {
            new MathTeacher("John"),
            new ScienceTeacher("Sarah")
        };

        for (Employee t : teachers) {
            t.work();
            System.out.println("Role: " + t.get_role());
            System.out.println();
        }
    }
}
