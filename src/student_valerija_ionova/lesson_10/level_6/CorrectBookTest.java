package student_valerija_ionova.lesson_10.level_6;

public class CorrectBookTest {

    public static void main (String [] args){

        CorrectBookTest correctBookTest = new CorrectBookTest();

        correctBookTest.testCorrectBook();
        correctBookTest.testNotCorrectBookNull();
        correctBookTest.testNotCorrectBookNoName();
    }

    void printResult(String name, boolean testPassed){
        if (testPassed){
            System.out.println(name+" OK");
        }else{
            System.out.println(name+" FAIL");
        }
    }

    void testCorrectBook(){
        BookReaderImpl bookReader = new BookReaderImpl();

        BookLibrary bookLibrary = new BookLibrary();
        Book book1 = new Book("Umbrella", "Laura Diekens");

        printResult("testCorrectBook", bookReader.addBook(book1, bookLibrary));
    }

    void testNotCorrectBookNull(){
        BookReaderImpl bookReader = new BookReaderImpl();

        BookLibrary bookLibrary = new BookLibrary();
        Book book1 = new Book(null, null);

        printResult("testNotCorrectBook", !bookReader.addBook(book1, bookLibrary));
    }

    void testNotCorrectBookNoName(){
        BookReaderImpl bookReader = new BookReaderImpl();

        BookLibrary bookLibrary = new BookLibrary();
        Book book1 = new Book("", "Bobby Smith");

        printResult("testNotCorrectBook", !bookReader.addBook(book1, bookLibrary));
    }

}
