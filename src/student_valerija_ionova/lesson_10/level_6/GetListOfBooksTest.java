package student_valerija_ionova.lesson_10.level_6;

public class GetListOfBooksTest {

    public static void main (String [] args){

        GetListOfBooksTest getListOfBooksTest = new GetListOfBooksTest();

        getListOfBooksTest.testGetListOf1Book();
        getListOfBooksTest.testGetListOf2Books();
    }

    void printResult(String name, boolean testPassed){
        if (testPassed){
            System.out.println(name+" OK");
        }else{
            System.out.println(name+" FAIL");
        }
    }

    void testGetListOf1Book(){

        BookReaderImpl bookReader = new BookReaderImpl();
        Book book1 = new Book ("Monkey", "Author");
        BookLibrary bookLibrary = new BookLibrary(book1);

        printResult("testGetListOf1Book", bookReader.getListOfBooks(bookLibrary)[0][0].equals("Monkey"));
    }

    void testGetListOf2Books(){

        BookReaderImpl bookReader = new BookReaderImpl();
        Book book1 = new Book ("Monkey", "Author");
        Book book2 = new Book ("Monkey and friend", "Author");
        BookLibrary bookLibrary = new BookLibrary(book1, book2);

        printResult("testGetListOf2Books", bookReader.getListOfBooks(bookLibrary)[1][1].equals("Author"));
    }

}
