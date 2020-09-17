package student_valerija_ionova.lesson_11.level_2_7_v2;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

public class BookDatabaseImplTest {

    BookDatabaseImpl bookDatabase = new BookDatabaseImpl();

    Book book1 = new Book("Author1", "Title1", "1");
    Book book2 = new Book("Author2", "Title2", "1");
    Book book3 = new Book("Author3", "Title3", "3");
    Book book4 = new Book("Author4", "Title4", "4");
    Book book5 = new Book("Author5", "Title5", "5");
    Book book6 = new Book("Author5", "Title4", "6");

    @Before
    public void init (){
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        bookDatabase.save(book5);
        bookDatabase.save(book6);

    }

    @Test
    public void testMethodDeleteById(){
        assertEquals(true, bookDatabase.delete(2L));
        assertEquals(false, bookDatabase.getListOfBooks().contains(book2));
        assertEquals(5, bookDatabase.getListOfBooks().size());
        assertEquals(false, bookDatabase.delete(2L));
    }

    @Test
    public void testMethodDeleteByBook(){
        assertEquals(true, bookDatabase.delete(book1));
        assertEquals(false, bookDatabase.getListOfBooks().contains(book1));
        assertEquals(5, bookDatabase.getListOfBooks().size());
    }

    @Test
    public void testMethodFindById(){
        assertEquals(Optional.of(book3), bookDatabase.findById(3L));
        assertEquals(Optional.empty(), bookDatabase.findById(55L));
        assertEquals(6, bookDatabase.getListOfBooks().size());
    }

    @Test
    public void testMethodFindByAuthor(){
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book5);
        expectedResult.add(book6);
        List <Book> result;
        result = bookDatabase.findByAuthor("Author5");
        assertEquals(expectedResult, result);
        assertEquals(6, bookDatabase.getListOfBooks().size());

    }

    @Test
    public void testMethodFindByAuthorNothingFound(){
        List<Book> expectedResult = new ArrayList<>();
        List <Book> result;
        result = bookDatabase.findByAuthor("Author555");
        assertEquals(expectedResult, result);
        assertEquals(6, bookDatabase.getListOfBooks().size());
    }

    @Test
    public void testMethodFindByTitle(){
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book4);
        expectedResult.add(book6);
        List <Book> result;
        result = bookDatabase.findByTitle("Title4");
        assertEquals(expectedResult, result);
        assertEquals(6, bookDatabase.getListOfBooks().size());

    }

    @Test
    public void testMethodFindByTitleNothingFound(){
        List<Book> expectedResult = new ArrayList<>();
        List <Book> result;
        result = bookDatabase.findByTitle("Title555");
        assertEquals(expectedResult, result);
        assertEquals(6, bookDatabase.getListOfBooks().size());
    }

    @Test
    public void testMethodCountAllBooks(){
        assertEquals(6, bookDatabase.countAllBooks());
    }

    @Test
    public void testMethodDeleteByAuthor(){
        bookDatabase.deleteByAuthor("Author1");
        assertEquals(false, bookDatabase.getListOfBooks().contains(book1));
        assertEquals(5, bookDatabase.countAllBooks());
        bookDatabase.deleteByAuthor("Author5");
        assertEquals(false,
                bookDatabase.getListOfBooks().contains(book5) && bookDatabase.getListOfBooks().contains(book6));
        assertEquals(3, bookDatabase.countAllBooks());
    }

    @Test
    public void testMethodDeleteByTitle(){
        bookDatabase.deleteByTitle("Title2");
        assertEquals(false, bookDatabase.getListOfBooks().contains(book2));
        assertEquals(5, bookDatabase.countAllBooks());
        bookDatabase.deleteByTitle("Title4");
        assertEquals(false,
                bookDatabase.getListOfBooks().contains(book4) && bookDatabase.getListOfBooks().contains(book6));
        assertEquals(3, bookDatabase.countAllBooks());
    }

    @Test
    public void testAuthorSearchCriteria(){
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Author1");
        assertEquals(true, authorSearchCriteria.match(book1));
        assertEquals(false, authorSearchCriteria.match(book4));
    }

    @Test
    public void testTitleSearchCriteria(){
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Title3");
        assertEquals(true, titleSearchCriteria.match(book3));
        assertEquals(false, titleSearchCriteria.match(book4));
    }

    @Test
    public void testYearSearchCriteria(){
        SearchCriteria yearSearchCriteria = new YearOfIssueSearchCriteria("1");
        assertEquals(true, yearSearchCriteria.match(book1));
        assertEquals(false, yearSearchCriteria.match(book4));
    }

}