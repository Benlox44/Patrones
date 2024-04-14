package CreationalPatterns.BuilderExercise;

public class Book {

    private String name, editor;
    private int year;

    private Book(Builder builder) {
        this.name = builder.name;
        this.editor = builder.editor;
        this.year = builder.year;
    }

    public String getName() {
        return name;
    }

    public String getEditor() {
        return editor;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book [name=" + name + ", editor=" + editor + ", year=" + year + "]";
    }

    static class Builder {

        private String name, editor;
        private int year;

        public Builder(String name) {
            this.name = name;
        }

        public Builder setEditor(String editor) {
            this.editor = editor;
            return this;
        }

        public Builder setYear(int year) {
            this.year = year;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}
