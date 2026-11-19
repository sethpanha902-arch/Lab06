classDiagram
    class Person {
        +String name
        +Person(String name)
    }

    class Student {
        +String student_id
        +Student(String name, String student_id)
    }

    class OnlineStudent {
        +String zoom_id
        +OnlineStudent(String name, String student_id, String zoom_id)
    }

    Person <|-- Student
    Student <|-- OnlineStudent
