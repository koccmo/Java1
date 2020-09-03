package student_valerija_ionova.lesson_11.level_2.task_6_14;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class BookDatabaseImplTest {

    public static void main (String [] args){

        BookDatabaseImplTest bookDatabaseImplTest = new BookDatabaseImplTest();

        bookDatabaseImplTest.testAddBookLongNumber1();
        bookDatabaseImplTest.testAddBookLongNumber2();
        bookDatabaseImplTest.testAddBookElement();
        bookDatabaseImplTest.testRemoveBookTrue();
        bookDatabaseImplTest.testRemoveBookFalse();
        bookDatabaseImplTest.testRemoveBookListCheck();
        bookDatabaseImplTest.testRemoveBookByBookTrue();
        bookDatabaseImplTest.testRemoveBookByBookFalse();
        bookDatabaseImplTest.testRemoveBookByBookListCheck();
        bookDatabaseImplTest.testFindByIdTrue();
        bookDatabaseImplTest.testFindByIdFalse();
        bookDatabaseImplTest.testFindBookByAuthor();
        bookDatabaseImplTest.testFindBookByAuthorNoFindedBooks();
        bookDatabaseImplTest.testFindBookByTitle();
        bookDatabaseImplTest.testFindBookByTitleNoFindedBooks();
        bookDatabaseImplTest.testBookDataBaseSize();
        bookDatabaseImplTest.testDeleteBookByAuthor();
        bookDatabaseImplTest.testDeleteBookByAuthorNoFindedBooks();
        bookDatabaseImplTest.testDeleteBookByTitle();
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

    void testRemoveBookByBookTrue(){

        Book book1 = new Book ("Author1", "Title1");
        Book book2 = new Book ("Author2", "Title2");
        Book book3 = new Book ("Author3", "Title3");

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);

        Book bookToDelete = new Book ("Author1", "Title1");


        checkResult("testRemoveBookByBookTrue", bookDatabase.delete(bookToDelete));
    }

    void testRemoveBookByBookFalse(){

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();

        Book bookToDelete = new Book ("Author1", "Title1");

        checkResult("testRemoveBookFalse", !bookDatabase.delete(bookToDelete));
    }

    void testRemoveBookByBookListCheck(){

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

        Book bookToDelete = new Book ("Author2", "Title2");

        bookDatabase.delete(bookToDelete);
        checkResult("testRemoveBook", bookDatabase.getBookDataBase().equals(listForCheck));
    }

    void testFindByIdTrue(){

        Book book1 = new Book ("Author1", "Title1");
        Book book2 = new Book ("Author2", "Title2");
        Book book3 = new Book ("Author3", "Title3");

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);

        Optional<Book> result = Optional.of(book3);

        checkResult("testFindByIdTrue", bookDatabase.findById(3L).equals(result));
    }

    void testFindByIdFalse(){

        Book book1 = new Book ("Author1", "Title1");
        Book book2 = new Book ("Author2", "Title2");
        Book book3 = new Book ("Author3", "Title3");

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);

        checkResult("testFindByIdFalse", bookDatabase.findById(15L).equals(Optional.empty()));
    }

    void testFindBookByAuthor(){

        Book book1 = new Book ("Author1", "Title1");
        Book book2 = new Book ("Author2", "Title2");
        Book book3 = new Book ("Author3", "Title3");
        Book book4 = new Book ("Author2", "Title4");

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);

        List <Book> result = new ArrayList<>();
        result.add(book2);
        result.add(book4);

        checkResult("testFindBookByAuthor", bookDatabase.findByAuthor("Author2").equals(result));
    }

    void testFindBookByAuthorNoFindedBooks(){

        Book book1 = new Book ("Author1", "Title1");
        Book book2 = new Book ("Author2", "Title2");
        Book book3 = new Book ("Author3", "Title3");
        Book book4 = new Book ("Author2", "Title4");

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        checkResult("testFindBookByAuthor", bookDatabase.findByAuthor("Author15").equals(new ArrayList<>()));
    }

    void testFindBookByTitle(){

        Book book1 = new Book ("Author1", "Title1");
        Book book2 = new Book ("Author2", "Title2");
        Book book3 = new Book ("Author3", "Title3");
        Book book4 = new Book ("Author2", "Title2");

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);

        List <Book> booksWithTitle = new ArrayList <>();
        booksWithTitle.add(book3);
        checkResult("testFindBookByTitle", bookDatabase.findByTitle("Title3").equals(booksWithTitle));
    }

    void testFindBookByTitleNoFindedBooks(){

        Book book1 = new Book ("Author1", "Title1");
        Book book2 = new Book ("Author2", "Title2");
        Book book3 = new Book ("Author3", "Title3");
        Book book4 = new Book ("Author2", "Title4");

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        checkResult("testFindBookByTitleNoFindedBooks", bookDatabase.findByAuthor("NoTitle").equals(new ArrayList<>()));
    }

    void testBookDataBaseSize(){

        Book book1 = new Book ("Author1", "Title1");
        Book book2 = new Book ("Author2", "Title2");
        Book book3 = new Book ("Author3", "Title3");
        Book book4 = new Book ("Author2", "Title4");

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        checkResult("testBookDataBaseSize", bookDatabase.countAllBooks() == 4);
    }

    void testDeleteBookByAuthor(){

        Book book1 = new Book ("Author1", "Title1");
        Book book2 = new Book ("Author2", "Title2");
        Book book3 = new Book ("Author3", "Title3");
        Book book4 = new Book ("Author2", "Title4");

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);

        bookDatabase.deleteByAuthor("Author2");

        List<BookAndId> listForCheck = new ArrayList<>();
        BookAndId bookId1 = new BookAndId(book1, 1L);
        BookAndId bookId3 = new BookAndId(book3, 3L);
        listForCheck.add(bookId1);
        listForCheck.add(bookId3);
        //System.out.println(bookDatabase.getBookDataBase());
        checkResult("testDeleteBookByAuthor", bookDatabase.getBookDataBase().equals(listForCheck));
    }

    void testDeleteBookByAuthorNoFindedBooks(){

        Book book1 = new Book ("Author1", "Title1");
        Book book2 = new Book ("Author2", "Title2");
        Book book3 = new Book ("Author3", "Title3");
        Book book4 = new Book ("Author2", "Title4");

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);

        bookDatabase.deleteByAuthor("NoAuthor");

        List<BookAndId> listForCheck = new ArrayList<>();
        BookAndId bookId1 = new BookAndId(book1, 1L);
        BookAndId bookId2 = new BookAndId(book2, 2L);
        BookAndId bookId3 = new BookAndId(book3, 3L);
        BookAndId bookId4 = new BookAndId(book4, 4L);
        listForCheck.add(bookId1);
        listForCheck.add(bookId2);
        listForCheck.add(bookId3);
        listForCheck.add(bookId4);

        checkResult("testDeleteBookByAuthorNoFindedBooks", bookDatabase.getBookDataBase().equals(listForCheck));
    }

    void testDeleteBookByTitle(){

        Book book1 = new Book ("Author1", "Title1");
        Book book2 = new Book ("Author2", "Title2");
        Book book3 = new Book ("Author3", "Title3");
        Book book4 = new Book ("Author2", "Title4");

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);

        bookDatabase.deleteByTitle("Title4");

        List<BookAndId> listForCheck = new ArrayList<>();
        BookAndId bookId1 = new BookAndId(book1, 1L);
        BookAndId bookId2 = new BookAndId(book2, 2L);
        BookAndId bookId3 = new BookAndId(book3, 3L);
        listForCheck.add(bookId1);
        listForCheck.add(bookId2);
        listForCheck.add(bookId3);
        //System.out.println(bookDatabase.getBookDataBase());
        checkResult("testDeleteBookByTitle", bookDatabase.getBookDataBase().equals(listForCheck));
    }

}
