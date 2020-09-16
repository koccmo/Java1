package student_igors_bartkevics.lesson_11.homework.level_6_middle.task_38_approved;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public interface BookDatabase {

    Long save(Book book);      //1

    boolean delete(Long bookId); //5

    boolean delete(Book book);   //6

    Optional<Book> findById(Long bookId);   //2

    List<Book> findByAuthor(String author); //3

    List<Book> findByTitle(String title);   //4

    int countAllBooks();   //7

    void deleteByAuthor(String author);     //8

    void deleteByTitle(String title);       //9

    List<Book> find(SearchCriteria searchCriteria);

    Set<String> findUniqueAuthors();       //10

    Set<String> findUniqueTitles();        //11

    Set<Book> findUniqueBooks();           //12

    boolean contains(Book book);           //13

    Map<String, List<Book>> getAuthorToBooksMap();  //14

    Map<String, Integer> getEachAuthorBookCount();  //15
}
