package roman.lesson_11.day_5.task_28;


import java.util.List;
import java.util.Map;

public class BookDatabaseImplTest {
    public static void main(String[] args) {
        BookDatabaseImplTest test = new BookDatabaseImplTest();
        test.mapOFAuthorBook();
    }

    void mapOFAuthorBook() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book garden = new Book("James", "Garden", "2000");
        Book porch = new Book("James", "Garden", "2001");
        Book hope = new Book("John", "Hope", "1999");
        
        bookDatabase.save(garden);
        bookDatabase.save(porch);
        bookDatabase.save(hope);

        Map<String, List<Book>> authorsBookMap = bookDatabase.getAuthorToBooksMap();

        checkResult(authorsBookMap.get("James").size() == 2 &&
                authorsBookMap.get("John").size() == 1,
                "Map of Authors Books");
    }

    void checkResult(boolean condition, String nameOfTest) {
        if (condition) {
            System.out.println(nameOfTest + " Test = OK!");
        } else {
            System.out.println(nameOfTest + " Test = Fail!");
        }
    }
}
