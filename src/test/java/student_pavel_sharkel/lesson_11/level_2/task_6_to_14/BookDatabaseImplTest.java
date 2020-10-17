package student_pavel_sharkel.lesson_11.level_2.task_6_to_14;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    @Test
    public void findByIdTrueTest() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        Book book3 = new Book("Author3", "Title3");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        Optional<Book> result = bookDatabase.findById(3L);
        assertEquals(Optional.of(book3), result);
    }

    @Test
    public void findByIdFalseTest() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        Book book3 = new Book("Author3", "Title3");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        Optional<Book> result = bookDatabase.findById(4L);
        assertEquals(Optional.empty(), result);
    }

    @Test
    public void findByAuthorTrueTest() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        Book book3 = new Book("Author3", "Title3");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        List<Book> toCompare = new ArrayList<>();
        toCompare.add(book2);
        List<Book> result = bookDatabase.findByAuthor("Author2");
        assertEquals(toCompare, result);
    }

    @Test
    public void findByAuthorFalseTest() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        Book book3 = new Book("Author3", "Title3");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        List<Book> toCompare = new ArrayList<>();
        List<Book> result = bookDatabase.findByAuthor("Author4");
        assertEquals(toCompare, result);
    }

    @Test
    public void findByTitleTrueTest() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        Book book3 = new Book("Author3", "Title3");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        List<Book> toCompare = new ArrayList<>();
        toCompare.add(book2);
        List<Book> result = bookDatabase.findByTitle("Title2");
        assertEquals(toCompare, result);
    }

    @Test
    public void findByTitleFalseTest() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        Book book3 = new Book("Author3", "Title3");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        List<Book> toCompare = new ArrayList<>();
        List<Book> result = bookDatabase.findByTitle("Title4");
        assertEquals(toCompare, result);
    }

    @Test
    public void bookCountingTrueTest() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        Book book3 = new Book("Author3", "Title3");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        int result = bookDatabase.countAllBooks();
        assertEquals(3, result);
    }

    @Test
    public void bookCountingFalseTest() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        int result = bookDatabase.countAllBooks();
        assertEquals(0, result);
    }

    @Test
    public void bookDeletingByAuthorTrueTest() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        Book book3 = new Book("Author3", "Title3");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.deleteByAuthor("Author2");
        List<Book> result = bookDatabase.getActualList();
        List<Book> toCompare = new ArrayList<>();
        toCompare.add(book1);
        toCompare.add(book3);
        assertEquals(toCompare, result);
    }

    @Test
    public void bookDeletingByAuthorFalseTest() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        Book book3 = new Book("Author3", "Title3");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.deleteByAuthor("Author4");
        List<Book> result = bookDatabase.getActualList();
        List<Book> toCompare = new ArrayList<>();
        toCompare.add(book1);
        toCompare.add(book2);
        toCompare.add(book3);
        assertEquals(toCompare, result);
    }

    @Test
    public void bookDeletingByTitleTrueTest() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        Book book3 = new Book("Author3", "Title3");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.deleteByTitle("Title2");
        List<Book> result = bookDatabase.getActualList();
        List<Book> toCompare = new ArrayList<>();
        toCompare.add(book1);
        toCompare.add(book3);
        assertEquals(toCompare, result);
    }

    @Test
    public void bookDeletingByTitleFalseTest() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        Book book3 = new Book("Author3", "Title3");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.deleteByTitle("Title4");
        List<Book> result = bookDatabase.getActualList();
        List<Book> toCompare = new ArrayList<>();
        toCompare.add(book1);
        toCompare.add(book2);
        toCompare.add(book3);
        assertEquals(toCompare, result);
    }

    @Test
    public void sortedBooksTest() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        Book book3 = new Book("Author3", "Title3");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);

        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Author2");
        List<Book> result = bookDatabase.find(authorSearchCriteria);
        List<Book> expected = new ArrayList<>();
        expected.add(book2);
        assertEquals(expected, result);
    }
}