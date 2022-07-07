package roman.lesson_10.day_6.task_22;

public class BookReaderImplTest {
    public static void main(String[] args) {
        BookReaderImplTest test = new BookReaderImplTest();
        test.positiveMarkBookAsRead();
        test.negativeMarkBookAsReadWhatNotInLibrary();
    }

    public void negativeMarkBookAsReadWhatNotInLibrary() {
        Book peace = new Book("Peace", "John Wood");
        Book garden = new Book("Garden", "James Nolan");
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(peace);
        checkResult(!bookReader.markBookBeenRead(garden),
                "Mark book what not in library as been read");
    }

    public void positiveMarkBookAsRead() {
        Book hope = new Book("Hope", "Nolan Polan");
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(hope);
        checkResult(bookReader.markBookBeenRead(hope),
                "Mark book been read");
    }

    public void checkResult(boolean condition, String nameOfTest) {
        if (condition) {
            System.out.println(nameOfTest + " Test = OK!");
        } else {
            System.out.println(nameOfTest + " Test = Fail!");
        }
    }
}
