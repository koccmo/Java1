package roman.lesson_10.day_6.task_23;

public class Book {
    private String title;
    private String author;
    private boolean beenRead = false;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void setBeenRead(boolean beenRead) {
        this.beenRead = beenRead;
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
}
