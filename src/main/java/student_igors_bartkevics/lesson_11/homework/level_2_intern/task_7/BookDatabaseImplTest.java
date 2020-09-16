package student_igors_bartkevics.lesson_11.homework.level_2_intern.task_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class BookDatabaseImplTest {

    public static void main(String[] args) {
        BookDatabaseImplTest test = new BookDatabaseImplTest();
        test.savePositiveTest();
        test.deletePositiveTest();
        test.deleteNegativeTest();
    }

    Book book1 = new Book("Bates B., Sierra K.", "Head First Java");
    Book book2 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
    Book book3 = new Book("Hunt A., Thomas D.", "The Pragmatic Programmer. From Journeyman to Master");

    void savePositiveTest() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Long currentId = bookDatabase.save(new Book("Bates B., Sierra K.", "Head First Java"));
        boolean condition = currentId == 2;
        checkResult(condition, "Save positive");
    }

    void deletePositiveTest() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        boolean condition = bookDatabase.delete(3L);
        checkResult(condition, "Delete positive");
    }

    void deleteNegativeTest() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.delete(3L);
        boolean condition = !bookDatabase.delete(3L);
        checkResult(condition, "Delete negative");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }

}
