package StructuralPatterns.Proxy;

public class Book {
    private String ISBN;
    private String title;

    public Book(String ISBN, String title) {
        this.ISBN = ISBN;
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return "ISBN: " + ISBN + ", title: " + title;
    }
}
