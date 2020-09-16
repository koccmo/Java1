package student_dmitrijs_jasvins.lesson_10.day_6;

import java.util.List;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
public interface BookReader {

    boolean addBook(Book book);

    boolean removeBook(Book book);

    @CodeReviewComment(teacher = "Method name should start with small letter!")
    boolean MarkBookAsAlreadyRead(Book book);

	@CodeReviewComment(teacher = "Method name should start with small letter!")
    boolean MarkBookAsNotRead(Book book);

    String[] listOfAllBooks();

    String[] listOfAllReadBooks();

    String[] listOfAllNotReadBooks();

    List<Book> listByAuthorOrContainsPartOfAuthorName(String author);

    List<Book> listByTitleOrContainsPartOfTitle(String title);
}
