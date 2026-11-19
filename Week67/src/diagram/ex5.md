classDiagram
    class LibraryItem {
        #String _title
        #int _id
        +LibraryItem(String title, int id)
        +display_info() void
    }

    class Book {
        +String author
        +Book(String title, int id, String author)
        +display_info() void
    }

    LibraryItem <|-- Book

