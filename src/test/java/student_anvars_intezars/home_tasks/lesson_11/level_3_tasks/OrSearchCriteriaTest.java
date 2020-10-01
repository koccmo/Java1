package student_anvars_intezars.home_tasks.lesson_11.level_3_tasks;

import org.junit.Test;

import static org.junit.Assert.*;

public class OrSearchCriteriaTest {

    @Test
    public void orSearchCriteriaTest() {
        Book firstBook = new Book("Nassim Nicholas Taleb","Antifragile","2003");
        AuthorSearchCriteria leftCondition = new AuthorSearchCriteria("Nassim Nicholas Taleb");
        YearOfIssueSearchCriteria rightCondition = new YearOfIssueSearchCriteria("2008");
        OrSearchCriteria orSearchCriteria = new OrSearchCriteria(leftCondition,rightCondition);
        boolean result = orSearchCriteria.match(firstBook);
        assertTrue(result);
    }

    @Test
    public void orSearchCriteriaTest2() {
        Book firstBook = new Book("Nassim Nicholas Taleb","Antifragile","2003");
        AuthorSearchCriteria leftCondition = new AuthorSearchCriteria("Juval Noah Harari");
        YearOfIssueSearchCriteria rightCondition = new YearOfIssueSearchCriteria("2003");
        OrSearchCriteria orSearchCriteria = new OrSearchCriteria(leftCondition,rightCondition);
        boolean result = orSearchCriteria.match(firstBook);
        assertTrue(result);
    }

    @Test
    public void orSearchCriteriaTestNegativeResult() {
        Book firstBook = new Book("Nassim Nicholas Taleb","Antifragile","2003");
        AuthorSearchCriteria leftCondition = new AuthorSearchCriteria("Juval Noah Harari");
        YearOfIssueSearchCriteria rightCondition = new YearOfIssueSearchCriteria("2008");
        OrSearchCriteria orSearchCriteria = new OrSearchCriteria(leftCondition,rightCondition);
        boolean result = orSearchCriteria.match(firstBook);
        assertTrue(result);
    }

}