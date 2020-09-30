package student_anvars_intezars.home_tasks.lesson_11.level_3_tasks;

import org.junit.Test;

import static org.junit.Assert.*;

public class YearOfIssueSearchCriteriaTest {

    @Test
    public void bookMatchByYearTest() {

        Book firstBook = new Book("Nassim Nicholas Taleb","Antifragile","2003");
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("2003");
        boolean result = yearOfIssueSearchCriteria.match(firstBook);
        assertTrue(result);
    }

}