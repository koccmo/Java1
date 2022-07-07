package roman.lesson_11.day_3.task_19;

import java.util.Objects;

public class Book {
    private String author;
    private String title;
    private Long id;
    private String yearOfIssue;

    public Book(String author, String title, String yearOfIssue) {
        this.author = author;
        this.title = title;
        this.yearOfIssue = yearOfIssue;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public Long getId() {
        return id;
    }

    public String getYearOfIssue() { return yearOfIssue; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(author, book.author) && Objects.equals(title, book.title) && Objects.equals(yearOfIssue, book.yearOfIssue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title, yearOfIssue);
    }
}
