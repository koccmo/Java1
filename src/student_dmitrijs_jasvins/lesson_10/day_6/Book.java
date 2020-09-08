package student_dmitrijs_jasvins.lesson_10.day_6;

public class Book {

    private String title;
    private String author;
    private boolean isReadied;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isReadied() {
        return isReadied;
    }

    public void setReadied(boolean readied) {
        isReadied = readied;
    }
}
