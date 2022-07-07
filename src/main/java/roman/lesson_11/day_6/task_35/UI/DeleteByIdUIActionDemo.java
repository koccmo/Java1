package roman.lesson_11.day_6.task_35.UI;

import roman.lesson_11.day_6.task_35.Book;
import roman.lesson_11.day_6.task_35.BookDatabase;
import roman.lesson_11.day_6.task_35.BookDatabaseImpl;

public class DeleteByIdUIActionDemo {
    public static void main(String[] args) {
        Book garden = new Book("James", "Garden","2000");
        Book hope = new Book("John", "Hope", "1999");

        BookDatabase bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(garden);
        bookDatabase.save(hope);

        DeleteByIdUIAction delete = new DeleteByIdUIAction(bookDatabase);
        delete.execute();
    }
}
