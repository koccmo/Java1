package student_dmitrijs_jasvins.lesson_10.day_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class BookReaderTest {
    public static void main(String[] args) {
        BookReaderTest test = new BookReaderTest();
        test.shouldReturnTrueIfBookIsInELibraryAndMarkedAsNotRead();
        test.shouldReturnTrueIfBookIsInELibraryAndMarkedAsRead();
        test.shouldReturnFalseIfBookIsNotInELibrary();
    }

    public void shouldReturnTrueIfBookIsInELibraryAndMarkedAsNotRead() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book book = new Book("Dmitry", "Dmitry Jasvins");
        bookReader.addBook(book);
        if (bookReader.MarkBookAsNotRead(book)) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }
    public void shouldReturnTrueIfBookIsInELibraryAndMarkedAsRead () {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book book = new Book("Dmitry", "Dmity Jasvins");
        bookReader.addBook(book);
        if (bookReader.MarkBookAsAlreadyRead(book)){
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }
    public void shouldReturnFalseIfBookIsNotInELibrary () {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book book = new Book("Dmitry", "Dmity Jasvins");
        bookReader.addBook(book);
        if (bookReader.MarkBookAsAlreadyRead(new Book("A", "B"))) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }

}
