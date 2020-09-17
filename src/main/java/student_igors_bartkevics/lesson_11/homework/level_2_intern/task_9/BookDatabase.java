package student_igors_bartkevics.lesson_11.homework.level_2_intern.task_9;

import java.util.Optional;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
interface BookDatabase {

    Long save(Book book);

    boolean delete(Long bookId);

    boolean delete(Book book);

    Optional<Book> findById(Long bookId);
}
