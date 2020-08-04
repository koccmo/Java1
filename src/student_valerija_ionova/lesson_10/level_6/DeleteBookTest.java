package student_valerija_ionova.lesson_10.level_6;

public class DeleteBookTest {

    public static void main (String [] args) {
        DeleteBookTest deleteBookTest = new DeleteBookTest();

        deleteBookTest.testDeleteExistingBook();
        deleteBookTest.testDeleteNotExistingBook();
    }

    void printResult(String name, boolean testPassed){
        if (testPassed){
            System.out.println(name+" OK");
        }else{
            System.out.println(name+" FAIL");
        }
    }

    void testDeleteExistingBook(){
        BookReaderImpl bookReader = new BookReaderImpl();
        Book book1 = new Book("Chemistry", "Professor");
        Book book2 = new Book ("Math", "Professor");
        Book book3 = new Book ("Math", "Professor");
        BookLibrary bookLibrary = new BookLibrary(book1, book2);


        printResult("testDeleteExistingBook", bookReader.deleteBook(book3, bookLibrary));
    }

    void testDeleteNotExistingBook(){
        BookReaderImpl bookReader = new BookReaderImpl();
        Book book1 = new Book("Chemistry", "Professor");
        Book book2 = new Book ("Math", "Professor");
        Book book3 = new Book ("Math for Students", "Professor");
        BookLibrary bookLibrary = new BookLibrary(book1, book2);


        printResult("testDeleteNotExistingBook", !bookReader.deleteBook(book3, bookLibrary));
    }


}
