package student_valerija_ionova.lesson_10.level_6;

import java.util.ArrayList;
import java.util.Arrays;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "Please remove unused imports.")
public class GetListOfReadBooksTest {

    public static void main (String [] args){

        GetListOfReadBooksTest getListOfReadBooksTest = new GetListOfReadBooksTest();

        getListOfReadBooksTest.testListOfReadBooks();
        getListOfReadBooksTest.testListOf2ReadBooks();
        getListOfReadBooksTest.testListOfNotReadBooks();
        getListOfReadBooksTest.testListOf2NotReadBooks();

    }

    boolean arrayEquals(String [][] array1, String[][] array2){
        for (int i = 0; i<array1.length; i++){
            for (int j=0; j< array1[i].length; j++) {
                if (!array1[i][j].equals(array2[i][j])){
                    return false;
                }
            }
        }
        return true;
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

        printResult("testListOfReadBooks", arrayEquals(bookReader.getListOfReadBooks(bookLibrary),expectedResult));
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

        printResult("testListOf2ReadBooks", arrayEquals(bookReader.getListOfReadBooks(bookLibrary),expectedResult));
    }

    void testListOfNotReadBooks(){
        Book book1 = new Book("Maugli", "Kipling");
        Book book2 = new Book("Maugli and friends", "Kiplings son");
        Book book3 = new Book("Magli and wife", "Kiplings daughter");
        BookLibrary bookLibrary = new BookLibrary(book1, book2, book3);

        BookReaderImpl bookReader = new BookReaderImpl();

        bookReader.isRead(book2, bookLibrary, true);
        bookReader.isRead(book3, bookLibrary, true);

        String [][] expectedResult = {{"Maugli", "Kipling"}};

        printResult("testListOfNotReadBooks", arrayEquals(bookReader.getListOfNotReadBooks(bookLibrary),expectedResult));
    }

    void testListOf2NotReadBooks(){
        Book book1 = new Book("Maugli", "Kipling");
        Book book2 = new Book("Maugli and friends", "Kiplings son");
        Book book3 = new Book("Maugli and wife", "Kiplings daughter");
        BookLibrary bookLibrary = new BookLibrary(book1, book2, book3);

        BookReaderImpl bookReader = new BookReaderImpl();

        bookReader.isRead(book1, bookLibrary, true);

        String [][] expectedResult = {{"Maugli and friends", "Kiplings son"}, {"Maugli and wife", "Kiplings daughter"}};

        printResult("testListOf2NotReadBooks", arrayEquals(bookReader.getListOfNotReadBooks(bookLibrary), expectedResult));
    }

}
