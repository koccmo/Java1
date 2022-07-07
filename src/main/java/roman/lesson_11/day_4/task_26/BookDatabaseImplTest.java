package roman.lesson_11.day_4.task_26;




import java.util.HashSet;
import java.util.Set;

public class BookDatabaseImplTest {
    public static void main(String[] args) {
        BookDatabaseImplTest test = new BookDatabaseImplTest();
        test.ifContainBook();
    }

    void ifContainBook() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book garden = new Book("James", "Garden", "2000");
        Book porch = new Book("James", "Garden", "2001");
        Book hope = new Book("John", "Hope", "1999");
        
        bookDatabase.save(garden);
        bookDatabase.save(porch);
        bookDatabase.save(hope);

        checkResult(bookDatabase.contains(new Book("James", "Garden", "2000")),
                "Contain book in bookDatabase");
    }

    void checkResult(boolean condition, String nameOfTest) {
        if (condition) {
            System.out.println(nameOfTest + " Test = OK!");
        } else {
            System.out.println(nameOfTest + " Test = Fail!");
        }
    }
}
