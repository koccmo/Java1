package student_valerija_ionova.lesson_11.level_2_7_v2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookDatabaseImplTest {

    BookDatabaseImpl bookDatabase = new BookDatabaseImpl();

    Book book1 = new Book("Author1", "Title1");
    Book book2 = new Book("Author2", "Title2");
    Book book3 = new Book("Author3", "Title3");
    Book book4 = new Book("Author4", "Title4");
    Book book5 = new Book("Author5", "Title5");

    @Before
    public void init (){
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        bookDatabase.save(book5);

    }

    @Test
    public void testMethodDeleteById(){
        assertEquals(true, bookDatabase.delete(2L));
        assertEquals(false, bookDatabase.getListOfBooks().contains(book2));
        assertEquals(4, bookDatabase.getListOfBooks().size());
        assertEquals(false, bookDatabase.delete(2L));
    }

    @Test
    public void testMethodDeleteByBook(){
        assertEquals(true, bookDatabase.delete(book1));
        assertEquals(false, bookDatabase.getListOfBooks().contains(book1));
        assertEquals(4, bookDatabase.getListOfBooks().size());
    }



}