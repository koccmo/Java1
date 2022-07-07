package roman.lesson_10.day_6.task_24_25;

public class Book {
    private String title;
    private String author;
    private boolean bookAsRead = false;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void setBookAsRead(boolean bookAsRead) {
        this.bookAsRead = bookAsRead;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBookAsRead() {
        return bookAsRead;
    }
}
