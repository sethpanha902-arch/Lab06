classDiagram
    class Shape {
        +area() double
    }

    class Circle {
        +double radius
        +Circle(double radius)
        +area() double
    }

    class Rectangle {
        +double length
        +double width
        +Rectangle(double length, double width)
        +area() double
    }

    class Triangle {
        +double base
        +double height
        +Triangle(double base, double height)
        +area() double
    }

    Shape <|-- Circle
    Shape <|-- Rectangle
    Shape <|-- Triangle
