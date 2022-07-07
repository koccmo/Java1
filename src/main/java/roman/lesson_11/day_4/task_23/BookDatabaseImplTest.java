package roman.lesson_11.day_4.task_23;

import java.util.HashSet;
import java.util.Set;

public class BookDatabaseImplTest {
    public static void main(String[] args) {
        BookDatabaseImplTest test = new BookDatabaseImplTest();
        test.findUniqueAuthors();
    }

    void findUniqueAuthors() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book garden = new Book("James", "Garden", "2000");
        Book porch = new Book("James", "Porch", "2001");
        Book hope = new Book("John", "Hope", "1999");

        bookDatabase.save(garden);
        bookDatabase.save(porch);
        bookDatabase.save(hope);

        Set<String> authors = new HashSet<>();
        authors.add("James");
        authors.add("John");

        checkResult(authors.equals(bookDatabase.findUniqueAuthors()), "Find unique book Authors");
    }

    void checkResult(boolean condition, String nameOfTest) {
        if (condition) {
            System.out.println(nameOfTest + (" Test = OK!"));
        } else {
            System.out.println(nameOfTest + (" Test = Fail!"));
        }
    }
}
