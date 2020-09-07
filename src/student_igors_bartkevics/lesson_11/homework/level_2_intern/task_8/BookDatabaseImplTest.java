package student_igors_bartkevics.lesson_11.homework.level_2_intern.task_8;

class BookDatabaseImplTest {

    public static void main(String[] args) {
        BookDatabaseImplTest test = new BookDatabaseImplTest();
        test.savePositiveTest();
        test.deleteByIdPositiveTest();
        test.deleteByIdNegativeTest();
        test.deleteBookPositiveTest();
        test.deleteBookNegativeTest();
    }

    Book book1 = new Book("Bates B., Sierra K.", "Head First Java");
    Book book2 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
    Book book3 = new Book("Hunt A., Thomas D.", "The Pragmatic Programmer. From Journeyman to Master");

    void savePositiveTest() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Long currentId = bookDatabase.save(new Book("Bates B., Sierra K.", "Head First Java"));
        boolean condition = currentId == 2;
        checkResult(condition, "Save book positive");
    }

    void deleteByIdPositiveTest() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        boolean condition = bookDatabase.delete(3L);
        checkResult(condition, "Delete book by ID positive");
    }

    void deleteByIdNegativeTest() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.delete(3L);
        boolean condition = !bookDatabase.delete(3L);
        checkResult(condition, "Delete book by ID negative");
    }

    void deleteBookPositiveTest() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        boolean condition = bookDatabase.delete(new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship"));
        checkResult(condition, "Delete book positive");
    }

    void deleteBookNegativeTest() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book3);
        boolean condition = !bookDatabase.delete(new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship"));
        checkResult(condition, "Delete book negative");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }

}
