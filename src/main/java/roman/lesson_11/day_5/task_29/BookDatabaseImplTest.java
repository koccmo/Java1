package roman.lesson_11.day_5.task_29;


import java.util.HashMap;
import java.util.Map;

public class BookDatabaseImplTest {
    public static void main(String[] args) {
        BookDatabaseImplTest test = new BookDatabaseImplTest();
        test.mapOFAuthorBookCount();
    }

    void mapOFAuthorBookCount() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book garden = new Book("James", "Garden", "2000");
        Book porch = new Book("James", "Garden", "2001");
        Book hope = new Book("John", "Hope", "1999");
        
        bookDatabase.save(garden);
        bookDatabase.save(porch);
        bookDatabase.save(hope);

        Map<String, Integer> authorsBookMapCount = new HashMap<>();
        authorsBookMapCount.put("James", 2);
        authorsBookMapCount.put("John", 1);

        checkResult(bookDatabase.getEachAuthorBookCount().equals(authorsBookMapCount),
                "Map of Authors Books Count");
    }

    void checkResult(boolean condition, String nameOfTest) {
        if (condition) {
            System.out.println(nameOfTest + " Test = OK!");
        } else {
            System.out.println(nameOfTest + " Test = Fail!");
        }
    }
}
