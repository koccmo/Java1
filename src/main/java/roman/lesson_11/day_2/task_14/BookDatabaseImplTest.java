package roman.lesson_11.day_2.task_14;


public class BookDatabaseImplTest {
    public static void main(String[] args) {
        BookDatabaseImplTest test = new BookDatabaseImplTest();
        test.deleteByTitle();
    }

    void deleteByTitle() {
        Book garden = new Book("James", "Garden");
        Book porch = new Book("James", "Porch");
        Book hope = new Book("John", "Garden");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(garden);
        bookDatabase.save(porch);
        bookDatabase.save(hope);
        bookDatabase.deleteByTitle("Garden");
        checkResult(bookDatabase.countAllBooks() == 1,
                "Delete books by Author");
    }

    void checkResult(boolean condition, String nameOfTest) {
        if (condition) {
            System.out.println(nameOfTest + " Test = OK!");
        } else {
            System.out.println(nameOfTest + " Test = Fail");
        }
    }
}
