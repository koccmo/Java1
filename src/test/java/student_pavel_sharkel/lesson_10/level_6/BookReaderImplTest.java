package student_pavel_sharkel.lesson_10.level_6;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookReaderImplTest {

    Book book1 = new Book("Book1", "Author1");
    Book book2 = new Book("Book2", "Author2");
    Book book3 = new Book("Book3", "Author3");

    @Test
    public void addBookTrueTest() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("Book1", "Author1");
        Book book2 = new Book("Book2", "Author2");
        Book book3 = new Book("Book3", "Author3");
        Book book4 = new Book("Book4", "Author4");
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        bookReader.addBook(book3);
        boolean result = bookReader.addBook(book4);
        assertEquals(true, result);

    }

    @Test
    public void addBookFalseTest() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("Book1", "Author1");
        Book book2 = new Book("Book2", "Author2");
        Book book3 = new Book("Book3", "Author3");
        Book book4 = new Book("Book2", "Author2");
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        bookReader.addBook(book3);
        boolean result = bookReader.addBook(book4);
        assertEquals(false, result);

    }

}