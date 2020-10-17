package student_pavel_sharkel.lesson_11.level_2.task_6_to_14;

import org.junit.Test;

import static org.junit.Assert.*;

public class YearOfIssueSearchCriteriaTest {

    @Test
    public void yearOfIssueTrueTest(){
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1991");
        Book book1 = new Book("Author1", "Title1", "1990");
        Book book2 = new Book("Author2", "Title2", "1991");
        boolean result = yearOfIssueSearchCriteria.match(book2);
        assertEquals(true, result);
    }

    @Test
    public void yearOfIssueFalseTest(){
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1991");
        Book book1 = new Book("Author1", "Title1", "1990");
        Book book2 = new Book("Author2", "Title2", "1992");
        boolean result = yearOfIssueSearchCriteria.match(book2);
        assertEquals(false, result);
    }

}