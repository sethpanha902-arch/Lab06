package Lab06ex8and9;
import java.util.ArrayList;
import java.util.List;
class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    String get_info() {
        return name + " - $" + price;
    }
}

class Electronics extends Product {
    int warranty;

    Electronics(String name, double price, int warranty) {
        super(name, price);
        this.warranty = warranty;
    }

    @Override
    String get_info() {
        return super.get_info() + ", Warranty: " + warranty + " months";
    }
}

class Clothing extends Product {
    String size;

    Clothing(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    @Override
    String get_info() {
        return super.get_info() + ", Size: " + size;
    }
}

class Book extends Product {
    String author;

    Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }
    @Override
    String get_info() {
        return super.get_info() + ", Author: " + author;
    }
}
public class exericse8{
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Electronics("Laptop", 900, 24));
        products.add(new Clothing("T-Shirt", 15, "M"));
        products.add(new Book("Java OOP", 30, "John"));

        for (Product p : products) {
            System.out.println(p.get_info());
        }
    }
}

