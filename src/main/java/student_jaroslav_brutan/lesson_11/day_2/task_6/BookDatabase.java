package student_jaroslav_brutan.lesson_11.day_2.task_6;

import java.util.List;
import java.util.Optional;

public interface BookDatabase {

    Long save(Book book);

    boolean delete(Long bookId);

    boolean delete(Book book);

    Optional<Book> findById(Long bookId);

    List<Book> findByAuthor(String author);

}
