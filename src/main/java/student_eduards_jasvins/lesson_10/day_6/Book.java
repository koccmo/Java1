package student_eduards_jasvins.lesson_10.day_6;

import java.util.Objects;

class Book {

    private String author;
    private String title;

    Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    String getAuthor() { return author; }
    String getTitle() { return title; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(author, book.author) &&
                Objects.equals(title, book.title);
    }

}
