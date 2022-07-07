package roman.lesson_11.day_2.task_7;

public class BookDatabaseImplTest {
    public static void main(String[] args) {
        BookDatabaseImplTest test = new BookDatabaseImplTest();
        test.positiveRemoveById();
        test.negativeDeleteById();

    }

    public void positiveRemoveById() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        //Book peace = new Book("James", "Peace");
        bookDatabase.save(new Book("James", "Peace"));
        checkResult(bookDatabase.delete(1L) && bookDatabase.getBooks().isEmpty(),
                "Positive remove");
    }

    public void negativeDeleteById() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(new Book("James", "Peace"));
        checkResult(!bookDatabase.delete(2L), "Negative Delete");
    }

    public void checkResult(boolean condition, String nameOfTest) {
        if (condition) {
            System.out.println(nameOfTest + " Test = OK!");
        } else {
            System.out.println(nameOfTest + " Test = FALSE!");
        }
    }
}
