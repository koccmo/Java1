package student_pavel_sharkel.lesson_11.level_2.task_6_to_14;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface BookDatabase {

    Long save (Book book);

    boolean delete(Long bookId);

    boolean delete(Book book);

    Optional<Book> findById(Long bookId);

    List<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);

    int countAllBooks();

    void deleteByAuthor(String author);

    List<Book> getActualList();

    void deleteByTitle(String title);

    List<Book> find(SearchCriteria searchCriteria);

    Set<String> findUniqueAuthors();


}
