package student_valerija_ionova.lesson_11.level_7_senior_approved.super_task_2;


import java.util.List;
import java.util.Map;
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

    List<Book> find(List <SearchCriteria>searchCriteria, Paging paging, SortingAlgoritm sortingAlgoritm);

    Set<String> findUniqueAuthors();

    Set<String> findUniqueTitles();

    Set<Book> findUniqueBooks();

    boolean contains(Book book);

    Map<String, List<Book>> getAuthorToBooksMap();

    Map<String, Integer> getEachAuthorBookCount();

}
