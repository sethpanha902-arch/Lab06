classDiagram
    class Employee {
        +String name
        +double salary
        +Employee(String name, double salary)
        +calculate_bonus() double
    }

    class Manager {
        +Manager(String name, double salary)
        +calculate_bonus() double
    }

    class Intern {
        +Intern(String name, double salary)
        +calculate_bonus() double
    }

    Employee <|-- Manager
    Employee <|-- Intern
