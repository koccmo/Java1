package student_valerija_ionova.lesson_11.level_2.task_6_14_not_approve;

import java.util.Objects;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "id - must be property of class Book!")
public class BookAndId {

    private Book book;
    private Long number;

    BookAndId(Book book, Long number){
        this.book = book;
        this.number = number;
    }

    Book getBook (){
        return book;
    }

    Long getNumber(){
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookAndId bookAndId = (BookAndId) o;
        return Objects.equals(book, bookAndId.book) &&
                Objects.equals(number, bookAndId.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(book, number);
    }

    @Override
    public String toString() {
        return "BookAndId{" +
                "book=" + book +
                ", number=" + number +
                '}';
    }
}
