package student_pavel_sharkel.lesson_11.level_2_to_5.task_6_to_27;

import org.junit.Test;

import static org.junit.Assert.*;

public class TitleSearchCriteriaTest {

    @Test
    public void titleSearchCriteriaTest() {
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Title2");
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        boolean result = titleSearchCriteria.match(book2);
        assertEquals(true, result);
    }

}