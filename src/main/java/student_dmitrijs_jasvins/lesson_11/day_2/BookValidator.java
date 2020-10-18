package student_dmitrijs_jasvins.lesson_11.day_2;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
class BookValidator {

    boolean isBookAuthor (Book book, String author) {
        return (book.getAuthor().equals(author));
    }

    boolean isBookTitle(Book book, String title) {
        return (book.getTitle().equals(title)); }
}
