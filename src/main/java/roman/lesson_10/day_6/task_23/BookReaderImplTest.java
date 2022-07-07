package roman.lesson_10.day_6.task_23;

public class BookReaderImplTest {
    public static void main(String[] args) {
        BookReaderImplTest test = new BookReaderImplTest();
        test.negativeMarkBookAsNotReadBookNotInLibrary();
        test.positiveMarkBookAsRead();
        test.negativeMarkBookNotInLibraryAsRead();
        test.positiveMarkBookAsNotRead();
    }

    public void negativeMarkBookAsNotReadBookNotInLibrary() {
        Book war = new Book("War", "John James");
        Book peace = new Book("Peace", "John James");
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(war);
        checkResult(!bookReader.markBooKAsNotRead(peace),
                "Negative mark book as not read, because book not in book reader");
    }

    public void positiveMarkBookAsNotRead() {
        Book peace = new Book("Peace", "John James");
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(peace);
        bookReader.markBookAsRead(peace);
        checkResult(bookReader.markBooKAsNotRead(peace),
                "Positive mark book as not read");
    }

    public void negativeMarkBookNotInLibraryAsRead() {
        Book peace = new Book("Peace", "J.John");
        Book garden = new Book("Garden", "James Smith");
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(peace);
        checkResult(!bookReader.markBookAsRead(garden),
                "Negative mark book as Read, book not in list");
    }

    public void positiveMarkBookAsRead() {
        Book peace = new Book("Peace", "John James");
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(peace);
        checkResult(bookReader.markBookAsRead(peace),
                "Positive mark book as read");
    }

    public void checkResult(boolean condition, String nameOfTest) {
        if (condition) {
            System.out.println(nameOfTest + " Test = OK!");
        } else {
            System.out.println(nameOfTest + " Test = FAIL!");
        }
    }
}
