package roman.lesson_11.day_2.task_12;

public class BookDatabaseImplTest {
    public static void main(String[] args) {
        BookDatabaseImplTest test = new BookDatabaseImplTest();
        test.countAllBook();
    }

    void countAllBook() {
        Book garden = new Book("James", "Garden");
        Book hope = new Book("John", "Hope");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(garden);
        bookDatabase.save(hope);
        checkResult(bookDatabase.countAllBooks() == 2, "" +
                "Count all book in library");
    }

    public void checkResult(boolean condition, String nameOfTest) {
        if (condition) {
            System.out.println(nameOfTest + " Test = OK!");
        } else {
            System.out.println(nameOfTest + " Test = FAIL!");
        }
    }
}
