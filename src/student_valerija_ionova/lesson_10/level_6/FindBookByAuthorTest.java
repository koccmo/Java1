package student_valerija_ionova.lesson_10.level_6;

import java.util.ArrayList;

public class FindBookByAuthorTest {

    public static void main (String [] args){

        FindBookByAuthorTest findBookTest = new FindBookByAuthorTest();

        findBookTest.testFindExistingBook();
        findBookTest.testFindNotExistingBook();
        findBookTest.testFindExistingBookNotFullName();
    }

    void printResult(String name, boolean testPassed){
        if (testPassed){
            System.out.println(name+" OK");
        }else{
            System.out.println(name+" FAIL");
        }
    }

    void testFindExistingBook(){
        BookReaderImpl bookReader = new BookReaderImpl();
        Book book1  = new Book("Bird", "Best author");
        Book book2 = new Book("Bird and pony", "Best author");
        Book book3 = new Book("Bird and pony", "Best author");

        BookLibrary bookLibrary = new BookLibrary(book1, book2);

        ArrayList<Book> expectedList = new ArrayList<>();
        expectedList.add(book1);
        expectedList.add(book2);

        printResult("testFindExistingBook", bookReader.findBookByAuthor("Best author", bookLibrary).equals(expectedList));

    }

    void testFindNotExistingBook(){
        BookReaderImpl bookReader = new BookReaderImpl();
        Book book1  = new Book("Bird", "Best author");
        Book book2 = new Book("Bird and pony", "Best author");
        Book book3 = new Book("Bird and pony", "Best author");

        BookLibrary bookLibrary = new BookLibrary(book1, book2);

        printResult("testFindNotExistingBook", bookReader.findBookByAuthor("Worst author", bookLibrary).size() == 0);

    }

    void testFindExistingBookNotFullName(){
        BookReaderImpl bookReader = new BookReaderImpl();
        Book book1  = new Book("Bird", "Best author");
        Book book2 = new Book("Bird and pony", "Best author");
        Book book3 = new Book("Bird and pony", "Best author");

        BookLibrary bookLibrary = new BookLibrary(book1, book2);

        ArrayList<Book> expectedList = new ArrayList<>();
        expectedList.add(book1);
        expectedList.add(book2);

        printResult("testFindExistingBookNotFullName", bookReader.findBookByAuthor("Bes", bookLibrary).equals(expectedList));

    }

}
