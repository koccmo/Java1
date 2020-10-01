package student_valerija_ionova.lesson_10.level_6.refactoring_methods_mot_more_than_3_strings;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class BookReaderImplTest {

    Book book1 = new Book("Title1", "Author1");
    BookReader bookReader = new BookReaderImpl(book1);

    @Test
    public void testAddNewBook (){
        Book book2 = new Book("Title2", "Author2");
        assertTrue(bookReader.addBook(book2));
        assertEquals(book2, bookReader.getBookDatabase().get(1));
    }

    @Test
    public void testAddExistingBook (){
        Book book2 = new Book("Title1", "Author1");
        assertTrue(!bookReader.addBook(book2));
        assertEquals(1, bookReader.getBookDatabase().size());
    }

    @Test
    public void testAddNotValidBookNullAuthor (){
        Book book2 = new Book("Title1", null);
        assertTrue(!bookReader.addBook(book2));
        assertEquals(1, bookReader.getBookDatabase().size());
    }

    @Test
    public void testAddNotValidBookNullTitle (){
        Book book2 = new Book(null, "Author1");
        assertTrue(!bookReader.addBook(book2));
        assertEquals(1, bookReader.getBookDatabase().size());
    }

    @Test
    public void testAddNotValidBookEmptyAuthor (){
        Book book2 = new Book("Title1", "");
        assertTrue(!bookReader.addBook(book2));
        assertEquals(1, bookReader.getBookDatabase().size());
    }

    @Test
    public void testAddNotValidBookEmptyTitle (){
        Book book2 = new Book("", "Author1");
        assertTrue(!bookReader.addBook(book2));
        assertEquals(1, bookReader.getBookDatabase().size());
    }

    @Test
    public void testDeleteNewBook (){
        Book book2 = new Book("Title2", "Author2");
        assertTrue(!bookReader.deleteBook(book2));
        assertEquals(1, bookReader.getBookDatabase().size());
    }

    @Test
    public void testDeleteExistingBook (){
        Book book1 = new Book("Title1", "Author1");
        assertTrue(bookReader.deleteBook(book1));
        assertEquals(0, bookReader.getBookDatabase().size());
    }

    @Test
    public void testGetArrayOfStrings1Book (){
        String [] expectedArray = {"Title1 [Author1]"};
        assertArrayEquals(expectedArray, bookReader.getArrayOfBooks());
    }

    @Test
    public void testGetArrayOfStrings2Books (){
        Book book2 = new Book ("Title2", "Author2");
        bookReader.addBook(book2);
        String [] expectedArray = {"Title1 [Author1]", "Title2 [Author2]"};
        assertArrayEquals(expectedArray, bookReader.getArrayOfBooks());
    }

    @Test
    public void testFindByAuthorEquals(){
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book1);
        assertEquals(expectedResult, bookReader.findBookByAuthor("Author1"));
    }

    @Test
    public void testFindByAuthorStartsWith(){
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book1);
        assertEquals(expectedResult, bookReader.findBookByAuthor("Auth"));
    }

    @Test
    public void testFindByTitleEquals(){
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book1);
        assertEquals(expectedResult, bookReader.findBookByTitle("Title1"));
    }

    @Test
    public void testFindByTitleStartsWith(){
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book1);
        assertEquals(expectedResult, bookReader.findBookByTitle("Tit"));
    }

    @Test
    public void testMarkAsReadBookExists(){
        Book bookIsRead = new Book ("Title1", "Author1");
        assertTrue(bookReader.markAsRead(bookIsRead));
        assertTrue(bookReader.getBookDatabase().get(0).getIsRead());
    }

    @Test
    public void testMarkAsReadBookNotExistingBook(){
        Book bookIsRead = new Book ("Title11", "Author11");
        assertTrue(!bookReader.markAsRead(bookIsRead));
    }

    @Test
    public void testMarkAsNotReadBookExists(){
        Book bookIsRead = new Book ("Title1", "Author1");
        assertTrue(bookReader.markAsNotRead(bookIsRead));
        assertTrue(!bookReader.getBookDatabase().get(0).getIsRead());
    }

    @Test
    public void testMarkAsNotReadBookNotExistingBook(){
        Book bookIsRead = new Book ("Title11", "Author11");
        assertTrue(!bookReader.markAsRead(bookIsRead));
    }

    @Test
    public void testGetArrayOfReadBooks (){
        Book book2 = new Book ("Title2", "Author2");
        Book book3 = new Book ("Title3", "Author3");
        bookReader.addBook(book2);
        bookReader.addBook(book3);
        bookReader.markAsRead(book1);
        bookReader.markAsRead(book3);
        String [] expectedArray = {"Title1 [Author1]", "Title3 [Author3]"};
        assertArrayEquals(expectedArray, bookReader.getArrayOfReadBooks());
    }

    @Test
    public void testGetArrayOfNotReadBooks (){
        Book book2 = new Book ("Title2", "Author2");
        Book book3 = new Book ("Title3", "Author3");
        bookReader.addBook(book2);
        bookReader.addBook(book3);
        bookReader.markAsNotRead(book1);
        bookReader.markAsRead(book2);
        bookReader.markAsNotRead(book3);
        String [] expectedArray = {"Title1 [Author1]", "Title3 [Author3]"};
        assertArrayEquals(expectedArray, bookReader.getArrayOfNotReadBooks());
    }


}