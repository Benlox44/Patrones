package StructuralPatterns.Proxy;

import java.util.ArrayList;
import java.util.List;

public class BookSearchProxy implements BookSearchInterface {
    private BookSearchInterface base;
    private List<Book> cache;

    public BookSearchProxy(BookSearchInterface base) {
        this.base = base;
        cache = new ArrayList<Book>();
    }

    @Override
    public Book getBook(String ISBN) {
        for (Book book : cache) {
            if (book.getISBN().equals(ISBN)) {
                System.out.println("Book found in cache");
                return book;
            }
        }

        Book book = base.getBook(ISBN);
        if (book != null) {
            System.out.println("Adding Book in cache");
            cache.add(book);
        }
        else {
            System.out.println("Book dont found");
        }
        return book;
    }
}
