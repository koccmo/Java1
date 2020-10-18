package student_dmitrijs_jasvins.lesson_11.day_4;



import java.util.List;
import java.util.Optional;
import java.util.Set;


interface BookDatabase {

    Long save(Book book);

    boolean delete(Long bookId);

    boolean delete(Book book);

    Optional<Book> findById(Long bookId);

    List<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);

    List<Book> find(SearchCriteria searchCriteria);

    int countAllBooks();

    void deleteByAuthor(String author);

    void deleteByTitle(String title);

    Set<String> findUniqueAuthors();

    Set<String> findUniqueTitles();

    Set<Book> findUniqueBooks();

    boolean contains(Book book);

}
