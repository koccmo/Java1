package student_valerija_ionova.lesson_10.level_6;

import java.util.ArrayList;

public class AddBookTest {

    public static void main (String [] args){

        AddBookTest addBookTest = new AddBookTest();

        addBookTest.testAddFirstBook();
        addBookTest.testAddSecondNewBook();
        addBookTest.testAddSecondOldBook();
    }

    void printResult(String name, boolean testPassed){
        if (testPassed){
            System.out.println(name+" OK");
        }else{
            System.out.println(name+" FAIL");
        }
    }

    void testAddFirstBook(){
        BookReaderImpl bookReader = new BookReaderImpl();
        Book book1 = new Book ("Tree", "Darvin");
        BookLibrary bookLibrary = new BookLibrary();
        bookReader.addBook(book1, bookLibrary);
        ArrayList <Book> expectedResult = new ArrayList <>();
        expectedResult.add(book1);
        printResult("testAddFirstBook", bookLibrary.getBookLibrary().equals(expectedResult));
    }

    void testAddSecondNewBook(){
        BookReaderImpl bookReader = new BookReaderImpl();
        Book book1 = new Book ("Tree", "Darvin");
        Book book2 = new Book ("Tree and Monkey", "John Tree");
        BookLibrary bookLibrary = new BookLibrary(book1);

        printResult("testAddSecondNewBook", bookReader.addBook(book2, bookLibrary));
    }

    void testAddSecondOldBook(){
        BookReaderImpl bookReader = new BookReaderImpl();
        Book book1 = new Book ("Tree", "Darvin");
        Book book2 = new Book ("Tree and Monkey", "John Tree");
        Book book3 = new Book ("Tree and Monkey", "John Tree");
        BookLibrary bookLibrary = new BookLibrary(book1, book2);

        printResult("testAddSecondOldBook", !bookReader.addBook(book3, bookLibrary));
    }

}
