package student_valerija_ionova.lesson_10.level_6.refactoring_methods_mot_more_than_3_strings;

import java.util.Objects;

class Book {

    private String title;
    private String author;
    private boolean isRead = false;

    Book (String title, String author){
        this.author = author;
        this.title = title;
    }

    String getTitle (){
        return title;
    }

    String getAuthor (){
        return author;
    }

    boolean getIsRead (){
        return isRead;
    }

    void setRead (boolean isRead){
        this.isRead = isRead;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}
