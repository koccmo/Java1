package roman.lesson_10.day_6.task_24_25;

import java.util.List;

public class BookReaderImplTest {
    public static void main(String[] args) {
        BookReaderImplTest test = new BookReaderImplTest();
        test.doListBookAsRead();
        test.markBookAsBeenRead();
        test.arrayListAsReadBookFromLibrary();
    }

    public void doListBookAsRead() {
        Book garden = new Book("Garden", "James James");
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(garden);
        bookReader.markBookAsRead(garden);
        String[] listOfBookBeenRead = bookReader.listOfBookBeenRead();
        checkResult(listOfBookBeenRead[0].compareTo("Garden [ James James ]") == 0,
                "Make array from list as read books");
    }

    public void markBookAsBeenRead() {
        Book garden = new Book("Garden", "James James");
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(garden);
        bookReader.markBookAsRead(garden);
        checkResult(bookReader.getLibrary().get(0).isBookAsRead(),
                "Mark book as been read");
    }

    public void arrayListAsReadBookFromLibrary() {
        Book garden = new Book("Garden", "John James");
        Book world = new Book("World", "Boris Junk");
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(garden);
        bookReader.addBook(world);
        bookReader.markBookAsRead(garden);
        bookReader.markBooKAsNotRead(world);
        String[] arrayListBookAsRead = bookReader.listOfBookBeenRead();
        checkResult(arrayListBookAsRead[0].compareTo("Garden [ John James ]") == 0,
                "Array list of book from library been read ");
    }

    public void checkResult(boolean condition, String nameOfTest) {
        if (condition) {
            System.out.println(nameOfTest + " Test = OK!");
        } else {
            System.out.println(nameOfTest + " Test = FAIL!");
        }
    }
}
