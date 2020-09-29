package student_anvars_intezars.home_tasks.lesson_11.level_2.task_6;

import teacher.codereview.CodeReview;

import java.util.Optional;

@CodeReview(approved = true)
interface BookDataBase {

    Long save(Book book);

    boolean delete(Long bookId);

    Optional<Book> findById(Long bookId);

}
