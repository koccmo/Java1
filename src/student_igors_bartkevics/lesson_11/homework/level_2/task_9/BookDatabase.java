package student_igors_bartkevics.lesson_11.homework.level_2.task_9;

import java.util.Optional;

public interface BookDatabase {

    Long save(Book book);

    boolean delete(Long bookId);

    boolean delete(Book book);

    Optional<Book> findById(Long bookId);
}
