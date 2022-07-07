package roman.lesson_11.day_2.task_11;

import java.util.ArrayList;
import java.util.List;

public class BookDatabaseImplTest {
    public static void main(String[] args) {
        BookDatabaseImplTest test = new BookDatabaseImplTest();
        test.positiveFindBookByTitle();
        test.negativeFindByTitle();
    }

    void positiveFindBookByTitle() {
        Book garden = new Book("James", "Garden");
        Book porch = new Book("John", "Garden");
        Book hope = new Book("Smith", "Hope");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(garden);
        bookDatabase.save(porch);
        bookDatabase.save(hope);
        List<Book> bookListWithSameTitle = new ArrayList<>();
        bookListWithSameTitle.add(garden);
        bookListWithSameTitle.add(porch);
        checkResult(bookDatabase.findByTitle("Garden").equals(bookListWithSameTitle),
                "Book with same title");
    }

    void negativeFindByTitle() {
        Book porch = new Book("John", "Garden");
        Book hope = new Book("Smith", "Hope");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(porch);
        bookDatabase.save(hope);
        List<Book> bookListWithSameTitle = new ArrayList<>();
        checkResult(bookDatabase.findByTitle("Sea").equals(bookListWithSameTitle),
                "Negative find by title");
    }

    void checkResult(boolean condition, String nameOfTest) {
        if (condition) {
            System.out.println(nameOfTest + " Test = OK!");
        } else {
            System.out.println(nameOfTest + " Test = FAIL!");
        }
    }
}
