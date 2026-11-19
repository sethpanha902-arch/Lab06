package Lab06;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    String student_id;

    Student(String name, String student_id) {
        super(name);
        this.student_id = student_id;
    }
}

class OnlineStudent extends Student {
    String zoom_id;

    OnlineStudent(String name, String student_id, String zoom_id) {
        super(name, student_id);
        this.zoom_id = zoom_id;
    }
}

public class ex3 {
    public static void main(String[] args) {
        OnlineStudent s = new OnlineStudent(
            "Dara", "ITC001", "ZOOM123"
        );

        System.out.println("Name: " + s.name);
        System.out.println("Student ID: " + s.student_id);
        System.out.println("Zoom ID: " + s.zoom_id);
    }
}
