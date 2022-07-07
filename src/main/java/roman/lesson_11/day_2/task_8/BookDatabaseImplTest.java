package roman.lesson_11.day_2.task_8;

public class BookDatabaseImplTest {
    public static void main(String[] args) {
        BookDatabaseImplTest test = new BookDatabaseImplTest();
        test.deleteByBook();
    }

    public void deleteByBook() {
        Book garden = new Book("James", "Garden");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(garden);
        checkResult(bookDatabase.delete(new Book("James", "Garden"))
                        && bookDatabase.getBooks().isEmpty(),
                "Delete book from list by Book");
    }

    public void checkResult(boolean condition, String nameOfTest) {
        if (condition) {
            System.out.println(nameOfTest + " Test = OK!");
        } else {
            System.out.println(nameOfTest + " Test = False!");
        }
    }
}
