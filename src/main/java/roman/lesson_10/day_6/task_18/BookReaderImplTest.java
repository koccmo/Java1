package roman.lesson_10.day_6.task_18;

import java.util.List;

public class BookReaderImplTest {
    public static void main(String[] args) {
        BookReaderImplTest test = new BookReaderImplTest();
        test.positiveAddBookToListFromLibraryWithSameAuthor();
        test.negativeAddBookToListFromLibraryWithSameAuthor();
    }

    public void positiveAddBookToListFromLibraryWithSameAuthor() {
        Book world = new Book("World", "James Smith");
        Book garden = new Book("Garden", "James Smith");
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(world);
        bookReader.addBook(garden);
        List<Book> listOfBookWithSameAuthor = bookReader.findBookBuyAuthor("James Smith");
        checkResult(listOfBookWithSameAuthor.size() == 2,
                "Added 2 book to List of book with same Author from library");
    }

    public void negativeAddBookToListFromLibraryWithSameAuthor() {
        Book world = new Book("World", "James Smith");
        Book garden = new Book("Garden", "Jame Smith");
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(world);
        bookReader.addBook(garden);
        List<Book> listOfBookWithSameAuthor = bookReader.findBookBuyAuthor("James Smith");
        checkResult(listOfBookWithSameAuthor.size() != 2,
                "Added 1 book to list with same Author from library");
    }

    public void checkResult(boolean condition, String nameOfTest) {
        if(condition) {
            System.out.println(nameOfTest + " Test = OK!");
        } else {
            System.out.println(nameOfTest + " Test = Fail!");
        }
    }
}
