package student_jaroslav_brutan.lesson_11.day2_6.UI_Actions_approved;

import student_jaroslav_brutan.lesson_11.day2_6.AllSearchCriterias.SearchCriteria;
import student_jaroslav_brutan.lesson_11.day2_6.Book;
import teacher.codereview.CodeReview;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

@CodeReview(approved = true)
public interface BookDatabase {

    Long save(student_jaroslav_brutan.lesson_11.day2_6.UI_Actions_approved.Book book);

    boolean delete(Long bookId);

    boolean delete(student_jaroslav_brutan.lesson_11.day2_6.UI_Actions_approved.Book book);

    Optional<student_jaroslav_brutan.lesson_11.day2_6.Book> findById(Long bookId);

    List<student_jaroslav_brutan.lesson_11.day2_6.Book> findByAuthor(String author);

    List<student_jaroslav_brutan.lesson_11.day2_6.Book> findByTitle(String title);

    int countAllBooks();

    void deleteByAuthor(String author);

    void deleteByTitle(String title);

    Set<String> findUniqueAuthors();

    Set<String> findUniqueTitles();

    Set<student_jaroslav_brutan.lesson_11.day2_6.Book> findUniqueBooks();

    boolean contains(student_jaroslav_brutan.lesson_11.day2_6.UI_Actions_approved.Book book);

    List<student_jaroslav_brutan.lesson_11.day2_6.Book> find(SearchCriteria searchCriteria);

    Map<String, List<Book>> getAuthorToBooksMap();

    Map<String, Integer> getEachAuthorBookCount();
}
