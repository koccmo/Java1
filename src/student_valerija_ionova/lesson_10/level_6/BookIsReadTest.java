package student_valerija_ionova.lesson_10.level_6;

public class BookIsReadTest {

    public static void main (String [] args){

        BookIsReadTest bookIsReadTest = new BookIsReadTest();

        bookIsReadTest.testIsReadExistingBook();
        bookIsReadTest.testIsReadNotExistingBook();
        bookIsReadTest.testIsReadExistingBookStatusIsRead();
        bookIsReadTest.testIsNotReadExistingBook();
        bookIsReadTest.testIsNotReadNotExistingBook();
    }

    void printResult(String name, boolean testPassed){
        if (testPassed){
            System.out.println(name+" OK");
        }else{
            System.out.println(name+" FAIL");
        }
    }

    void testIsReadExistingBook(){
        BookReaderImpl bookReader = new BookReaderImpl();
        Book book1 = new Book ("Monkey", "Author");
        Book book2 = new Book ("Elephant", "Author Bobby");
        Book book3 = new Book ("Elephant", "Author Bobby");

        BookLibrary bookLibrary = new BookLibrary(book1, book2);

        printResult("testIsReadExistingBook", bookReader.isRead(book3, bookLibrary, true));
    }

    void testIsReadNotExistingBook(){
        BookReaderImpl bookReader = new BookReaderImpl();
        Book book1 = new Book ("Monkey", "Author");
        Book book2 = new Book ("Elephant", "Author Bobby");
        Book book3 = new Book ("Elephant and Dog", "Author Bobby");

        BookLibrary bookLibrary = new BookLibrary(book1, book2);

        printResult("testIsReadNotExistingBook", !bookReader.isRead(book3, bookLibrary, true));
    }

    void testIsReadExistingBookStatusIsRead(){
        BookReaderImpl bookReader = new BookReaderImpl();
        Book book1 = new Book ("Monkey", "Author");
        Book book2 = new Book ("Elephant", "Author Bobby");
        Book book3 = new Book ("Elephant", "Author Bobby");

        BookLibrary bookLibrary = new BookLibrary(book1, book2);
        bookReader.isRead(book3, bookLibrary, true);

        printResult("testIsReadNotExistingBook", bookLibrary.getBookLibrary().get(1).getIsRead());
    }

    void testIsNotReadExistingBook(){
        BookReaderImpl bookReader = new BookReaderImpl();
        Book book1 = new Book ("Monkey", "Author");
        Book book2 = new Book ("Elephant", "Author Bobby");
        Book book3 = new Book ("Elephant", "Author Bobby");

        BookLibrary bookLibrary = new BookLibrary(book1, book2);

        printResult("testIsReadExistingBook", bookReader.isRead(book3, bookLibrary, false));
    }

    void testIsNotReadNotExistingBook(){
        BookReaderImpl bookReader = new BookReaderImpl();
        Book book1 = new Book ("Monkey", "Author");
        Book book2 = new Book ("Elephant", "Author Bobby");
        Book book3 = new Book ("Elephant and Dog", "Author Bobby");

        BookLibrary bookLibrary = new BookLibrary(book1, book2);

        printResult("testIsReadNotExistingBook", !bookReader.isRead(book3, bookLibrary, false));
    }

}
