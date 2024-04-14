package StructuralPatterns.Proxy;

public class Main {
    public static void main(String[] args) {
        BookSearchInterface bookSearch = new BookSearch();
        BookSearchInterface proxy = new BookSearchProxy(bookSearch);

        String ISBN = "12345";
        Book book = proxy.getBook(ISBN);
        System.out.println(book);

        book = proxy.getBook(ISBN);
        System.out.println(book);
    }
}
