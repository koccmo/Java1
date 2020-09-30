package student_anvars_intezars.home_tasks.lesson_11.level_2.tasks;

import org.junit.Test;


import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

public class BookDataBaseImplTest {

    @Test
    public void generateIdTest() {

        BookDataBaseImpl bookDataBase = new BookDataBaseImpl();

        Book firstBook = new Book("Nassim Taleb", "Antifragile");
        Book secondBook = new Book("Juval Noah Harari", "Homo Deus");
        Long firstID = bookDataBase.save(firstBook);
        Long secondID = bookDataBase.save(secondBook);
        assertTrue(firstID == 1L);
        assertTrue(secondID == 2l);

    }

    @Test
    public void deleteBookByIDTest() {

        BookDataBaseImpl bookDataBase = new BookDataBaseImpl();

        Book firstBook = new Book("Nassim Taleb", "Antifragile");
        Book secondBook = new Book("Juval Noah Harari", "Homo Deus");
        Long firstID = bookDataBase.save(firstBook);
        Long secondID = bookDataBase.save(secondBook);
        Long bookID = secondBook.getId();
        Boolean result = bookDataBase.delete(bookID);
        assertEquals(result, true);


    }

    @Test
    public void deleteBookByIDTest2() {

        BookDataBaseImpl bookDataBase = new BookDataBaseImpl();

        Book firstBook = new Book("Nassim Taleb", "Antifragile");
        Book secondBook = new Book("Juval Noah Harari", "Homo Deus");
        Long firstID = bookDataBase.save(firstBook);
        Long secondID = bookDataBase.save(secondBook);
        Boolean result1 = bookDataBase.delete(firstID);
        Boolean result2 = bookDataBase.delete(secondID);
        assertEquals(result1, true);
        assertEquals(result2, true);
    }

    @Test
    public void testFindBookByID(){

        BookDataBaseImpl bookDataBase = new BookDataBaseImpl();

        Book firstBook = new Book("Nassim Taleb", "Antifragile");
        Book secondBook = new Book("Juval Noah Harari", "Homo Deus");
        Long firstID = bookDataBase.save(firstBook);
        Long secondID = bookDataBase.save(secondBook);
        Optional<Book> result1 = bookDataBase.findById(firstID);
        Optional<Book> result2 = bookDataBase.findById(secondID);
        assertTrue(result1.isPresent());
        assertTrue(result2.isPresent());
    }

    @Test
    public void testFindBookByAuthor() {

        BookDataBaseImpl bookDataBase = new BookDataBaseImpl();

        Book firstBook = new Book("Nassim Taleb", "Antifragile");
        Book secondBook = new Book("Juval Noah Harari", "Homo Deus");
        Book thirdBook = new Book("Juval Noah Harari","Homo Sapiens");
        bookDataBase.save(firstBook);
        bookDataBase.save(secondBook);
        bookDataBase.save(thirdBook);
        List<Book> result = bookDataBase.findByAuthor("Juval Noah Harari");
        assertTrue(result.contains(secondBook));
    }

    @Test
    public void testFindBooksByTitle() {

        BookDataBaseImpl bookDataBase = new BookDataBaseImpl();

        Book firstBook = new Book("Nassim Taleb", "Homo Sapiens");
        Book secondBook = new Book("Juval Noah Harari", "Homo Deus");
        Book thirdBook = new Book("Juval Noah Harari","Homo Sapiens");
        bookDataBase.save(firstBook);
        bookDataBase.save(secondBook);
        bookDataBase.save(thirdBook);
        List<Book> result = bookDataBase.findByTitle("Homo Sapiens");
        assertTrue(result.contains(firstBook));
    }

    @Test
    public void countBooksTest() {

        BookDataBaseImpl bookDataBase = new BookDataBaseImpl();

        Book firstBook = new Book("Nassim Taleb", "Homo Sapiens");
        Book secondBook = new Book("Juval Noah Harari", "Homo Deus");
        Book thirdBook = new Book("Juval Noah Harari","Homo Sapiens");
        bookDataBase.save(firstBook);
        bookDataBase.save(secondBook);
        bookDataBase.save(thirdBook);
        int result = bookDataBase.countAllBooks();
        assertEquals(result,3);
    }

    @Test
    public void deleteByAuthorTest() {

        BookDataBaseImpl bookDataBase = new BookDataBaseImpl();

        Book firstBook = new Book("Nassim Taleb", "Homo Sapiens");
        Book secondBook = new Book("Juval Noah Harari", "Homo Deus");
        Book thirdBook = new Book("Juval Noah Harari","Homo Sapiens");
        bookDataBase.save(firstBook);
        bookDataBase.save(secondBook);
        bookDataBase.save(thirdBook);
        bookDataBase.deleteByAuthor("Nassim Taleb");
        int result = bookDataBase.countAllBooks();
        assertEquals(result,2);
    }
}

