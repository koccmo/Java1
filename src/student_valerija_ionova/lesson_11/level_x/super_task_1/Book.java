package student_valerija_ionova.lesson_11.level_x.super_task_1;

import java.util.Objects;

public class Book {

    private String title;
    private String author;
    private String yearOfIssue;

    public Book(String author, String title, String yearOfIssue) {
        this.author = author;
        this.title = title;
        this.yearOfIssue = yearOfIssue;
    }


    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getYearOfIssue(){
        return this.yearOfIssue;
    }


    @Override
    public String toString() {
        return "\nBook\n" +
                "Title: " + title +
                "\nAuthor: " + author +
                "\nYearOfIssue: " + yearOfIssue +"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfIssue == book.yearOfIssue &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, yearOfIssue);
    }
}
