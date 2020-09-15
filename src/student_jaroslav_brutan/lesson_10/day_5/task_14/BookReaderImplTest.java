package student_jaroslav_brutan.lesson_10.day_5.task_14;

public class BookReaderImplTest {

    public static void main(String[] args) {
        BookReaderImplTest test = new BookReaderImplTest();
        test.canAddABook();
    }

    void canAddABook(){
        Book addBook1 = new Book("J.R.Tolkien","Hobbit");
        Book addBook2 = new Book("F.Dostoyevsky","The Idiot");
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(addBook1);
        bookReader.addBook(addBook2);
        boolean result = bookReader.bookAlreadyInLibrary(addBook1);
        if (result){
            System.out.println("Test - OK!");
        } else {
            System.out.println("Test - FAIL!");
        }
    }
}
