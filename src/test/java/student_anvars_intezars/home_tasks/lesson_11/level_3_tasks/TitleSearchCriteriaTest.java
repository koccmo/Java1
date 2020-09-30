package student_anvars_intezars.home_tasks.lesson_11.level_3_tasks;

import org.junit.Test;

import static org.junit.Assert.*;

public class TitleSearchCriteriaTest {

    @Test
    public void bookMatchByTitleTest() {

        Book firstBook = new Book("Nassim Nicholas Taleb","Antifragile");
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Antifragile");
        boolean result = titleSearchCriteria.match(firstBook);
        assertTrue(result);
    }

}