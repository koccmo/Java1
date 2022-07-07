package roman.lesson_11.day_2.task_9;



public class BookDatabaseImplTest {
    public static void main(String[] args) {
        BookDatabaseImplTest test = new BookDatabaseImplTest();
        test.findByIdPositiveTest();
    }

    void findByIdPositiveTest() {
        Book book1 = new Book("James", "Garden");
        Book book2 = new Book("John", "Hope");
        Book book3 = new Book("Math", "Just");
        BookDatabase bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        Book foundBook = bookDatabase.findById(3L).get();
        boolean condition = foundBook.equals(book3);
        checkResult(condition, "Find book by ID positive");
    }

    public void checkResult(boolean condition, String nameOfTest) {
        if (condition) {
            System.out.println(nameOfTest + " Test = OK!");
        } else {
            System.out.println(nameOfTest + " Test = Fail!");
        }
    }
}
