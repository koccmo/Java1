package student_igors_bartkevics.lesson_11.homework.level_2_intern.task_10;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
class BookValidator {

	@CodeReviewComment(teacher = "isAuthorBook(...) ?")
    boolean isBookByAuthor(Book book, String author) {
        return (book.getAuthor().equals(author));
    }

}
