package student_eduards_jasvins.lesson_11.day_3;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
class BookValidator {

	@CodeReviewComment(teacher = "What this method do? Please create more explaining method name, use verb for this purpose!")
    boolean isBookAuthor (Book book, String author) {
        return (book.getAuthor().equals(author));
    }

	@CodeReviewComment(teacher = "What this method do? Please create more explaining method name, use verb for this purpose!")
    boolean isBookTitle(Book book, String title) { return (book.getTitle().equals(title)); }
}
