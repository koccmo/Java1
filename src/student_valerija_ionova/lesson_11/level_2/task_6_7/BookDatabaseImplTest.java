package student_valerija_ionova.lesson_11.level_2.task_6_7;

import java.util.ArrayList;
import java.util.List;

class BookDatabaseImplTest {

    public static void main (String [] args){

        BookDatabaseImplTest bookDatabaseImplTest = new BookDatabaseImplTest();

        bookDatabaseImplTest.testAddBookLongNumber1();
        bookDatabaseImplTest.testAddBookLongNumber2();
        bookDatabaseImplTest.testAddBookElement();
        bookDatabaseImplTest.testRemoveBookTrue();
        bookDatabaseImplTest.testRemoveBookFalse();
        bookDatabaseImplTest.testRemoveBookListCheck();


    }

    void checkResult (String name, boolean testPassed){
        if (testPassed){
            System.out.println(name + " OK");
        }else{
            System.out.println(name + " FAIL");
        }
    }

    void testAddBookLongNumber1(){

        Book book1 = new Book ("Author1", "Title1");

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Long number = bookDatabase.save(book1);
        checkResult("testAddBook", number.equals(1L));
    }

    void testAddBookLongNumber2(){

        Book book1 = new Book ("Author1", "Title1");
        Book book2 = new Book ("Author2", "Title2");

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        Long number = bookDatabase.save(book2);
        checkResult("testAddBookLongNumber2", number.equals(2L));
    }

    void testAddBookElement(){

        Book book1 = new Book ("Author1", "Title1");
        BookAndId bookAndIdForCheck = new BookAndId(book1, 1L);

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        checkResult("testAddBookElement", bookDatabase.getBookAndId(0L).equals(bookAndIdForCheck));
    }

    void testRemoveBookTrue(){

        Book book1 = new Book ("Author1", "Title1");
        Book book2 = new Book ("Author2", "Title2");
        Book book3 = new Book ("Author3", "Title3");

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);


        checkResult("testRemoveBookTrue", bookDatabase.delete(2L));
    }

    void testRemoveBookFalse(){

        Book book1 = new Book ("Author1", "Title1");
        Book book2 = new Book ("Author2", "Title2");
        Book book3 = new Book ("Author3", "Title3");

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);

        checkResult("testRemoveBookFalse", !bookDatabase.delete(5L));
    }

    void testRemoveBookListCheck(){

        Book book1 = new Book ("Author1", "Title1");
        Book book2 = new Book ("Author2", "Title2");
        Book book3 = new Book ("Author3", "Title3");

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);

        List<BookAndId> listForCheck = new ArrayList<>();
        BookAndId bookId1 = new BookAndId(book1, 1L);
        BookAndId bookId3 = new BookAndId(book3, 3L);
        listForCheck.add(bookId1);
        listForCheck.add(bookId3);

        bookDatabase.delete(2L);
        //bookDatabase.getBookDataBase().forEach(System.out :: println);
        //listForCheck.forEach(System.out :: println);
        checkResult("testRemoveBook", bookDatabase.getBookDataBase().equals(listForCheck));
    }

}
