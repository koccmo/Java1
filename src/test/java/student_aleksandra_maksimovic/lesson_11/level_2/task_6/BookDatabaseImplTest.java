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
        assertEquals(condition, true);
    }

   @Test
    public void deleteByIDTest() {

       bookDatabase.save(book1);
       bookDatabase.save(book2);
       bookDatabase.save(book3);
       boolean condition = bookDatabase.delete(2L);
       assertEquals(condition,true);
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
        Book findBook = bookDatabase.findById(1L).get();
        boolean condition = findBook.equals(book1);
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

        List<Book> booksByAuthor = new ArrayList<>();
        booksByAuthor.add(book2);
        booksByAuthor.add(book1);
        booksByAuthor.add(book3);


        boolean condition = bookDatabase.findByAuthor("Author2").equals(booksByAuthor);
        assertFalse(condition);//TODO
    }

    @Test
    public void findByTitle() {
        //TODO
    }


    @Test
    public void countAllBooksTest() {

        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        boolean condition = bookDatabase.countAllBooks() == 3;
        assertEquals(condition, true);
    }

    @Test
    public void deleteBooksByAuthorTest() {
        //TODO

    }

    @Test
    public void deleteBooksByTitleTest() {
        //TODO
    }

}