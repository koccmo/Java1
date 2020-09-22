package student_jaroslav_brutan.lesson_11.day_5.all_tasks;

import student_jaroslav_brutan.lesson_11.day_3.all_tasks.SearchCriteria;


import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface BookDatabase {

    Long save(Book book);

    boolean delete(Long bookId);

    boolean delete(Book book);

    Optional<Book> findById(Long bookId);

    List<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);

    int countAllBooks();

    void deleteByAuthor(String author);

    void deleteByTitle(String title);

    Set<String> findUniqueAuthors();

    Set<String> findUniqueTitles();

    Set<Book> findUniqueBooks();

    boolean contains(Book book);

    List<Book> find(SearchCriteria searchCriteria);


}
