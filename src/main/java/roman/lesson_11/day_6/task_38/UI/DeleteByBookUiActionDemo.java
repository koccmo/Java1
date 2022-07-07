package roman.lesson_11.day_6.task_38.UI;

import roman.lesson_11.day_6.task_38.Book;
import roman.lesson_11.day_6.task_38.BookDatabase;
import roman.lesson_11.day_6.task_38.BookDatabaseImpl;

public class DeleteByBookUiActionDemo {
    public static void main(String[] args) {
        Book garden = new Book("James", "Garden", "2000");
        Book hope = new Book("John", "Hope", "2022");

        BookDatabase bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(garden);
        bookDatabase.save(hope);
        System.out.println("Contain Data Base Book - 'Garden' :  " + bookDatabase.contains(garden));

        DeleteByBookUiAction deleteByBookUiAction = new DeleteByBookUiAction(bookDatabase);
        deleteByBookUiAction.execute();
        System.out.println("Contain Data Base Book - 'Garden' :  " + bookDatabase.contains(garden));
    }
}
