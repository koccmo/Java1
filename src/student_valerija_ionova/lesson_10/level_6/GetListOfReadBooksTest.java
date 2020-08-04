package student_valerija_ionova.lesson_10.level_6;

import java.util.ArrayList;

public class GetListOfReadBooksTest {

    public static void main (String [] args){

        GetListOfReadBooksTest getListOfReadBooksTest = new GetListOfReadBooksTest();

        getListOfReadBooksTest.testListOfReadBooks();
        getListOfReadBooksTest.testListOf2ReadBooks();
    }

    void printResult(String name, boolean testPassed){
        if (testPassed){
            System.out.println(name+" OK");
        }else{
            System.out.println(name+" FAIL");
        }
    }

    void testListOfReadBooks(){
        Book book1 = new Book("Maugli", "Kipling");
        Book book2 = new Book("Maugli and friends", "Kiplings son");
        Book book3 = new Book("Magli and wife", "Kiplings daughter");
        BookLibrary bookLibrary = new BookLibrary(book1, book2, book3);

        BookReaderImpl bookReader = new BookReaderImpl();

        bookReader.isRead(book2, bookLibrary, true);
        String [][] expectedResult = {{"Maugli and friends", "Kiplings son"}};

        printResult("testListOfReadBooks", bookReader.getListOfReadBooks(bookLibrary)[0][0].equals(expectedResult[0][0]));
    }

    void testListOf2ReadBooks(){
        Book book1 = new Book("Maugli", "Kipling");
        Book book2 = new Book("Maugli and friends", "Kiplings son");
        Book book3 = new Book("Maugli and wife", "Kiplings daughter");
        BookLibrary bookLibrary = new BookLibrary(book1, book2, book3);

        BookReaderImpl bookReader = new BookReaderImpl();

        bookReader.isRead(book2, bookLibrary, true);
        bookReader.isRead(book3, bookLibrary, true);
        String [][] expectedResult = {{"Maugli and friends", "Kiplings son"}, {"Maugli and wife", "Kiplings daughter"}};

        printResult("testListOf2ReadBooks", bookReader.getListOfReadBooks(bookLibrary)[1][1].equals(expectedResult[1][1]));
    }

}
