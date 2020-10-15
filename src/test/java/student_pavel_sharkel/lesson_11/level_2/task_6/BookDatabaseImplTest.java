package student_pavel_sharkel.lesson_11.level_2.task_6;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookDatabaseImplTest {

    @Test
    public void deteleByIdTrueTest() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        Book book3 = new Book("Author3", "Title3");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        boolean result = bookDatabase.delete(2L);
        assertEquals(true, result);
    }

    @Test
    public void deteleByIdFalseTest() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        Book book3 = new Book("Author3", "Title3");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        boolean result = bookDatabase.delete(4L);
        assertEquals(false, result);
    }

    @Test
    public void deleteByObjectTrueTest() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        Book book3 = new Book("Author3", "Title3");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        boolean result = bookDatabase.delete(book2);
        assertEquals(true, result);
    }

    @Test
    public void deleteByObjectFalseTest() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        Book book3 = new Book("Author3", "Title3");
        bookDatabase.save(book1);
        //bookDatabase.save(book2);
        bookDatabase.save(book3);
        boolean result = bookDatabase.delete(book2);
        assertEquals(false, result);
    }

}