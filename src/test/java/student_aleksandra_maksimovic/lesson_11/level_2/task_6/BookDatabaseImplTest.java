package student_aleksandra_maksimovic.lesson_11.level_2.task_6;





import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

public class BookDatabaseImplTest {

    Book book1 = new Book("Author1", "Title1");
    Book book2 = new Book("Author2", "Title2");
    Book book3 = new Book("Author3", "Title3");
    Book book4 = new Book("Author3", "Title4");
    Book book5 = new Book("Author4", "Title4");


 private BookDatabaseImpl bookDatabase;

    @Before
    public void init() {

        bookDatabase  = new BookDatabaseImpl() {
        };
    }

    @Test
    public void saveTest() {

        Long id = bookDatabase.save(new Book("Author1", "Title1"));

        boolean condition = id == 2;
        assertTrue(condition);
    }

   @Test
    public void deleteByIDTest() {

       bookDatabase.save(book1);
       bookDatabase.save(book2);
       bookDatabase.save(book3);
       boolean condition = bookDatabase.delete(2L);
       assertTrue(condition);
    }
  @Test
    public void deleteNegativeTest() {

        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.delete(2L);
        boolean condition = bookDatabase.delete(2L);
        assertFalse(condition);

    }

    @Test
    public void deleteBookTest() {

        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        boolean condition = bookDatabase.delete(book3);
        assertTrue(condition);
    }

    @Test
    public void deleteBookNegativeTest() {

        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.delete(3L);
        boolean condition = bookDatabase.delete(book3);
        assertFalse(condition);
    }

    @Test
    public void findByIdTest() {

        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        Optional<Book> findBook = bookDatabase.findById(1L);

        boolean condition = findBook.isPresent() && findBook.get().equals(book1);
        assertTrue(condition);
    }

    @Test
    public void findByIdNegativeTest() {

        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        Optional<Book> optionalBook = bookDatabase.findById(4L);
        boolean condition = optionalBook.isEmpty();
        assertTrue(condition);
    }

    @Test
    public void findByAuthorTest() {
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);

        List<Book> booksByAuthor = new ArrayList<>();
        booksByAuthor.add(book3);
        booksByAuthor.add(book4);


        boolean condition = bookDatabase.findByAuthor("Author3").equals(booksByAuthor);
        assertTrue(condition);
    }

    @Test
    public void findByTitle() {
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        bookDatabase.save(book5);

        List<Book> booksByTitle = new ArrayList<>();
        booksByTitle.add(book4);
        booksByTitle.add(book5);

        boolean condition = bookDatabase.findByTitle("Title4").equals(booksByTitle);
        assertTrue(condition);
    }


    @Test
    public void countAllBooksTest() {
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);

        assertEquals(bookDatabase.countAllBooks(), 3);
    }

    @Test
    public void deleteBooksByAuthorTest() {
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        bookDatabase.save(book5);

        bookDatabase.deleteByAuthor("Author3");

        assertEquals(bookDatabase.countAllBooks(), 3);

        assertNotNull(bookDatabase.findById(book1.getId()));
        assertNotNull(bookDatabase.findById(book2.getId()));
        assertNotNull(bookDatabase.findById(book5.getId()));

    }

    @Test
    public void deleteBooksByTitleTest() {
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        bookDatabase.save(book5);

        bookDatabase.deleteByTitle("Title4");

        assertEquals(bookDatabase.countAllBooks(), 3);

        assertNotNull(bookDatabase.findById(book1.getId()));
        assertNotNull(bookDatabase.findById(book2.getId()));
        assertNotNull(bookDatabase.findById(book3.getId()));
    }

    @Test
    public void searchByCriteriaTest() {
        Book book1 = new Book("Kuper", "Zveroboj");
        Book book2 = new Book("Kuper", "Moh");
        Book book3 = new Book("Ruper", "Puper");

        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);

        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboj");
        SearchCriteria searchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);

        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book1);

        List<Book> result = bookDatabase.find(searchCriteria);

        assertEquals(result, expectedResult);
    }

}