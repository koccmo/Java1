package student_anvars_intezars.home_tasks.lesson_11.level_2.task_6;

import java.util.ArrayList;
import java.util.List;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
class BookDataBaseImpl implements BookDataBase {

	@CodeReviewComment(teacher = "Must be private!")
    List<Book> books = new ArrayList<>();
    private Long id = 0L;

    @Override
    public Long save(Book book) {
        id++;
        book.setId(id);
        books.add(book);

        return id;
    }


    @Override
    public boolean delete(Long bookID) {
        if (books.removeIf(book -> book.getId().equals(bookID))) {
            return true;
        }
            return false;
    }
}
