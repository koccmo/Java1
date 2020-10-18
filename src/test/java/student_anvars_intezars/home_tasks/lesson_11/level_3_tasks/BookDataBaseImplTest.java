package student_anvars_intezars.home_tasks.lesson_11.level_3_tasks;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BookDataBaseImplTest {

    @Test
    public void findBookByAnySearchCriteriaTest() {

        Book newBook = new Book("Kuper","Zveroboi","1890");

        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria yearOfIssueCriteria = new YearOfIssueSearchCriteria("1890");
        SearchCriteria andSearchCriteria1 = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        SearchCriteria andSearchCriteria2 = new AndSearchCriteria(authorSearchCriteria,yearOfIssueCriteria);
        SearchCriteria orSearchCriteria = new OrSearchCriteria(authorSearchCriteria,yearOfIssueCriteria);

        BookDataBaseImpl dataBase = new BookDataBaseImpl();
        dataBase.save(newBook);
        List<Book> resultOfSearchByAuthor = dataBase.find(authorSearchCriteria);
        List<Book> resultOfSearchByTitle = dataBase.find(titleSearchCriteria);
        List<Book> resultOfSearchByYear = dataBase.find(yearOfIssueCriteria);
        List<Book> resultOfAndSearch = dataBase.find(andSearchCriteria1);
        List<Book> resultOfAndSearch2 = dataBase.find(andSearchCriteria2);
        List<Book> resultOfOrSearch = dataBase.find(orSearchCriteria);


        assertTrue(resultOfSearchByAuthor.contains(newBook));
        assertTrue(resultOfSearchByTitle.contains(newBook));
        assertTrue(resultOfSearchByYear.contains(newBook));
        assertTrue(resultOfAndSearch.contains(newBook));
        assertTrue(resultOfAndSearch2.contains(newBook));
        assertTrue(resultOfOrSearch.contains(newBook));





    }

}