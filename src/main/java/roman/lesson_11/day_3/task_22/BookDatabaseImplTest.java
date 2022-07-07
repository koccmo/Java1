package roman.lesson_11.day_3.task_22;

import java.util.ArrayList;
import java.util.List;

public class BookDatabaseImplTest {
    public static void main(String[] args) {
        BookDatabaseImplTest test = new BookDatabaseImplTest();
        test.positiveFindTest();
    }

    void positiveFindTest() {
        Book garden = new Book("James", "Garden", "2002");
        Book porch = new Book("James", "Garden", "2002");
        Book hope = new Book("John", "Garden", "2002");
        Book peace = new Book("Smith", "Garden", "2001");

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(garden);
        bookDatabase.save(porch);
        bookDatabase.save(hope);
        bookDatabase.save(peace);

        SearchCriteria authorAndTitleCriteria = new AndSearchCriteria(new AuthorSearchCriteria("James"),
                new TitleSearchCriteria("Garden"));

        List<Book> list = new ArrayList<>();
        list.add(garden);
        list.add(porch);

        checkResult(bookDatabase.find(authorAndTitleCriteria).equals(list),
                "Positive Find");
    }

    void checkResult(boolean condition, String nameOfTest) {
        if (condition) {
            System.out.println(nameOfTest + " Test = OK!");
        } else {
            System.out.println(nameOfTest + " Test + FAIL!");
        }
    }
}
