package student_eduards_jasvins.lesson_11.day_2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class BookDatabaseTest {
    public static void main(String[] args) {
        BookDatabaseTest test = new BookDatabaseTest();
        test.Save();
        test.DeleteById();
        test.Delete();

    }

    void checkResult (String name, boolean condition) {
        if (condition) {
            System.out.println(name + "= OK");
        } else {
            System.out.println(name + " = OK.");
        }
    }

    Book book1 = new Book("Eduards J.", "YAAAAAAY!");
    Book book2 = new Book("Eduards S.", "YAAAY!");
    Book book3 = new Book("Eduards Z.", "YAAAAAY!");

    void Save() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Long currentId = bookDatabase.save(book1);

        checkResult("Save Test", currentId.equals(1L));
    }

    void DeleteById() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);

        checkResult("Delete by ID Test", bookDatabase.delete(2L));
    }

    void Delete() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);

        checkResult("Delete Test ", bookDatabase.delete(book3));
    }
}
