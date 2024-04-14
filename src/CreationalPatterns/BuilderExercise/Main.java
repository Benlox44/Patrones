package CreationalPatterns.BuilderExercise;

public class Main {

    public static void main(String[] args) {
        
        Book book1 = new Book.Builder("book1").setEditor("Editor A").setYear(2020).build();
        Book book2 = new Book.Builder("book2").setEditor("Editor B").setYear(2024).build();

        Book[] books = {book1, book2};

        for (Book book : books) {
            System.out.println(book);
        }

    }
}