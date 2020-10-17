package student_pavel_sharkel.lesson_11.level_2.task_6_to_14;

import org.junit.Test;

import static org.junit.Assert.*;

public class AndSearchCriteriaTest {

    @Test
    public void andSearchCriteriaTrueTest() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Author");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Title");
        SearchCriteria andSearchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        Book book = new Book("Author", "Title");
        boolean result = andSearchCriteria.match(book);
        assertEquals(true, result);
    }

    @Test
    public void andSearchCriteriaFalseTest() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Authors");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Title");
        SearchCriteria andSearchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        Book book = new Book("Author", "Title");
        boolean result = andSearchCriteria.match(book);
        assertEquals(false, result);
    }

}