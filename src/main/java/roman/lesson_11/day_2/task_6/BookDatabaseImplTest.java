package roman.lesson_11.day_2.task_6;

import java.util.List;

public class BookDatabaseImplTest {
    public static void main(String[] args) {
        BookDatabaseImplTest test = new BookDatabaseImplTest();
        test.checkIfFillUpId();
        test.positiveSafe();
    }

    public void checkIfFillUpId() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book garden = new Book("James", "Garden");
        bookDatabase.save(garden);
        List<Book> myListOfBook = bookDatabase.getBooks();
        checkResult(myListOfBook.get(0).getId() != null,
                "Check if fill up id when book is added");
    }

    public void positiveSafe() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book peace = new Book("James", "Peace");
        Book hope = new Book("John", "Hope");
        bookDatabase.save(peace);
        bookDatabase.save(hope);
        checkResult(bookDatabase.getCurrentId() == 3, "Positive safe");
    }

    public void checkResult(boolean condition, String nameOfTest) {
        if (condition) {
            System.out.println(nameOfTest + " Test = OK!");
        } else {
            System.out.println(nameOfTest + " Test = False!");
        }
    }
}
