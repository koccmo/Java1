package student_roberts_kupcs.lesson_11.homework.level_2.Task_6_14;

import java.util.List;
import java.util.Optional;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
interface BookDatabase {
    Long save(Book book);

    boolean delete(long bookId);

    boolean delete(Book book);

    Optional<Book> findById(Long bookId);

    List<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);

    int countAllBooks();

    void deleteByAuthor(String author);

    void deleteByTitle(String title);
}
