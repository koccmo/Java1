package roman.lesson_11.day_4.task_25;


import java.util.HashSet;
import java.util.Set;

public class BookDatabaseImplTest {
    public static void main(String[] args) {
        BookDatabaseImplTest test = new BookDatabaseImplTest();
        test.findUniqueBooks();
    }

    void findUniqueBooks() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book garden = new Book("James", "Garden", "2000");
        Book porch = new Book("James", "Garden", "2001");
        Book hope = new Book("John", "Hope", "1999");
        
        bookDatabase.save(garden);
        bookDatabase.save(porch);
        bookDatabase.save(hope);

        Set<Book> books = new HashSet<>();
        books.add(garden);
        books.add(porch);
        books.add(hope);

        checkResult(books.equals(bookDatabase.findUniqueBooks()), "Find unique Books");
    }

    void checkResult(boolean condition, String nameOfTest) {
        if (condition) {
            System.out.println(nameOfTest + (" Test = OK!"));
        } else {
            System.out.println(nameOfTest + (" Test = Fail!"));
        }
    }
}
