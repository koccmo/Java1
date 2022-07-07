package roman.lesson_10.day_6.task_22;

public class Book {
    private String title;
    private String author;
    private boolean beenRead = false;

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

    public boolean isBeenRead() {
        return beenRead;
    }

    public void setBeenRead() {
        this.beenRead = true;
    }
}
