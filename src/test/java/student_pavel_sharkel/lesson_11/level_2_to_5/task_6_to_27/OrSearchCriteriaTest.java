package student_pavel_sharkel.lesson_11.level_2_to_5.task_6_to_27;

import org.junit.Test;

import static org.junit.Assert.*;

public class OrSearchCriteriaTest {

    @Test
    public void orSearchCriteriaTrue1Test() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("NotAuthor");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Title");
        SearchCriteria orSearchCriteria = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        Book book = new Book("Author", "Title");
        boolean result = orSearchCriteria.match(book);
        assertEquals(true, result);
    }

    @Test
    public void orSearchCriteriaTrue2Test() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Author");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("NotTitle");
        SearchCriteria orSearchCriteria = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        Book book = new Book("Author", "Title");
        boolean result = orSearchCriteria.match(book);
        assertEquals(true, result);
    }

    @Test
    public void orSearchCriteriaFalseTest() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("NotAuthor");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("NotTitle");
        SearchCriteria orSearchCriteria = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        Book book = new Book("Author", "Title");
        boolean result = orSearchCriteria.match(book);
        assertEquals(false, result);
    }

}