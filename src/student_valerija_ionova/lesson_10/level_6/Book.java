package student_valerija_ionova.lesson_10.level_6;

import java.util.Objects;

public class Book {

    private String title;
    private String author;
    private boolean isRead;

    Book (String title, String author){
        this.title = title;
        this.author = author;
    }

    String getTitle(){
        return title;
    }

    String getAuthor(){
        return author;
    }

    boolean getIsRead(){
        return isRead;
    }

    void setIsRead(boolean status){
        isRead = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return title.equals(book.title) &&
                author.equals(book.author);
    }

}
