package roman.lesson_11.day_2.task_10;

import java.util.ArrayList;
import java.util.List;

public class BookDatabaseImplTest {
    public static void main(String[] args) {
        BookDatabaseImplTest test = new BookDatabaseImplTest();
        test.findByAuthorSeveralBook();
        test.negativeFindBookByAuthor();
        test.findByAuthorWithEmptyLibrary();
    }

    void findByAuthorSeveralBook() {
        Book garden = new Book("James", "Garden");
        Book porch = new Book("James", "Porch");
        Book dor = new Book("John", "Dor");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(garden);
        bookDatabase.save(porch);
        bookDatabase.save(dor);
        List<Book> bookListWithSameAuthor = new ArrayList<>();
        bookListWithSameAuthor.add(garden);
        bookListWithSameAuthor.add(porch);
        checkResult(bookDatabase.findByAuthor("James").equals(bookListWithSameAuthor),
                "Positive find two book with same Author");
    }

    void negativeFindBookByAuthor() {
        Book garden = new Book("James", "Garden");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(garden);
        List<Book> bookListWithSameAuthor = new ArrayList<>();
        checkResult(bookDatabase.findByAuthor("John").equals(bookListWithSameAuthor),
                "Negative find with same author");
    }

    void findByAuthorWithEmptyLibrary() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        List<Book> bookListWithSameAuthor = new ArrayList<>();
        checkResult(bookDatabase.findByAuthor("James").equals(bookListWithSameAuthor),
                "Find book with same Author then Library empty");
    }

    void checkResult(boolean condition, String nameOfTest) {
        if (condition) {
            System.out.println(nameOfTest + " Test = OK!");
        } else {
            System.out.println(nameOfTest + " Test = FAIL!");
        }
    }
}
