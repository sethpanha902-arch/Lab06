package Lab06;

class LibraryItem {
    protected String _title;
    protected int _id;

    LibraryItem(String title, int id) {
        this._title = title;
        this._id = id;
    }

    void display_info() {
        System.out.println("Title: " + _title);
        System.out.println("ID: " + _id);
    }
}

class Book extends LibraryItem {

    Book(String title, int id) {
        super(title, id);
    }

    @Override
    void display_info() {
        System.out.println("Book Title: " + _title);
        System.out.println("Book ID: " + _id);
    }

    void show_title() {
        System.out.println("Subclass accesses: " + _title);
    }
}

public class ex5 {
    public static void main(String[] args) {
        Book b = new Book("Java Programming", 101);

        b.display_info();
        b.show_title();

    }
}
