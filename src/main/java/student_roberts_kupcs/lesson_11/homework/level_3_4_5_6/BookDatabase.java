package student_roberts_kupcs.lesson_11.homework.level_3_4_5_6;

import java.util.List;
import java.util.Map;
import java.util.Set;

interface BookDatabase {

    Map<String, Integer> getEachAuthorBookCount();

    Map<String, List<Book>> getAuthorToBooksMap();

    Set<String> find(String text);

    boolean contains(Book book);

    Set<Book> findUniqueBooks();

    Set<String> findUniqueTitles();

    Set<String> findUniqueAuthors();

    List<Book> find(SearchCriteria searchCriteria);

}
