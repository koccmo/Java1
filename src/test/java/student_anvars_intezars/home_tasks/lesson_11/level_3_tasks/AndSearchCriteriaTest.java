package student_anvars_intezars.home_tasks.lesson_11.level_3_tasks;

import org.junit.Test;

import static org.junit.Assert.*;

public class AndSearchCriteriaTest {

    @Test
    public void andSearchCriteriaTest() {

        Book firstBook = new Book("Nassim Nicholas Taleb","Antifragile","2003");
        AuthorSearchCriteria leftCondition = new AuthorSearchCriteria("Nassim Nicholas Taleb");
        YearOfIssueSearchCriteria rightCondition = new YearOfIssueSearchCriteria("2003");
        AndSearchCriteria andSearchCriteria = new AndSearchCriteria(leftCondition,rightCondition);
        boolean result = andSearchCriteria.match(firstBook);
        assertTrue(result);
    }

}