package student_pavel_sharkel.lesson_11.level_2_to_5.task_6_to_27;

import org.junit.Test;

import static org.junit.Assert.*;

public class AuthorSearchCriteriaTest {

    @Test
    public void searchCriteriaTest() {
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Author2");
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        boolean result = authorSearchCriteria.match(book2);
        assertEquals(true, result);
    }

}