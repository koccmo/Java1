package student_igors_bartkevics.lesson_11.homework.level_2_intern.task_6;

import java.util.ArrayList;
import java.util.List;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
class BookDatabaseImpl implements BookDatabase{

	@CodeReviewComment(teacher = "This field should be private.")
    List<Book> books = new ArrayList<>();

	@CodeReviewComment(teacher = "This field should be private.")
	Long currentId = 1L;

    public Long getCurrentId() {
        return currentId;
    }

    @Override
    public Long save(Book book) {
        books.add(book);
        Long bookId = currentId;
        book.setId(bookId);
        currentId++;
        return currentId;
    }
}
