package student_anvars_intezars.home_tasks.lesson_11.level_3_tasks;

import org.junit.Test;

import static org.junit.Assert.*;

public class AuthorSearchCriteriaTest {

    @Test
    public void bookMatchByAuthorTest() {

        Book firstBook = new Book("Nassim Nicholas Taleb","Antifragile");
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Nassim Nicholas Taleb");
        boolean result = authorSearchCriteria.match(firstBook);
        assertTrue(result);
    }

}