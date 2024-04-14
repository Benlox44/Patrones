package StructuralPatterns.Proxy;

public class BookSearch implements BookSearchInterface {

    @Override
    public Book getBook(String ISBN) {
        if (ISBN.equals("12345")) {
            return new Book("12345", "The Great Gatsby");
        } else {
            return null;
        }
    }
}
