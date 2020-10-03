package student_aleksandra_maksimovic.lesson_11.level_2_6;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class SearchCriteriaImplTest
{
    Book book1 = new Book("Author1", "Title1", 1963);
    Book book2 = new Book("Author2", "Title2", 2000);

    @Test
    public void authorSearchCriteriaTest() {
        AuthorSearchCriteria criteria = new AuthorSearchCriteria("Author1");
        assertTrue(criteria.match(book1));
        assertFalse(criteria.match(book2));
    }

    @Test
    public void titleSearchCriteriaTest() {
        TitleSearchCriteria criteria = new TitleSearchCriteria("Title1");
        assertTrue(criteria.match(book1));
        assertFalse(criteria.match(book2));
    }

    @Test
    public void yearOfIssueSearchCriteriaTest() {
        YearOfIssueSearchCriteria criteria = new YearOfIssueSearchCriteria(1963);
        assertTrue(criteria.match(book1));
        assertFalse(criteria.match(book2));
    }

    @Test
    public void andSearchCriteriaTest() {
        AndSearchCriteria criteria = new AndSearchCriteria(new AuthorSearchCriteria("Author1"), new TitleSearchCriteria("Title1"));
        assertTrue(criteria.match(book1));
    }

    @Test
    public void orSearchCriteriaTest() {
        OrSearchCriteria criteria = new OrSearchCriteria(new AuthorSearchCriteria("Author1"), new AuthorSearchCriteria("Author2"));
        assertTrue(criteria.match(book1));
        assertTrue(criteria.match(book2));
    }
}