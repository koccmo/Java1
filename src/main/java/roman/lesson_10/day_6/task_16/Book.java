package roman.lesson_10.day_6.task_16;

public class Book {
    private String title;
    private String author;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getTitle() { return title; }

    public String getAuthor() { return author; }
}
