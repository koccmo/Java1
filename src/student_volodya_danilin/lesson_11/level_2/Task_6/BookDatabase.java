package student_volodya_danilin.lesson_11.level_2.Task_6;

import java.util.Optional;

public interface BookDatabase {

    Long save(Book book);

    boolean delete(Long bookId);

    boolean delete(Book book);

    Optional<Book> findById(Long bookId);

}
