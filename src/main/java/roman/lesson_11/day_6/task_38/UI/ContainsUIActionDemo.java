package roman.lesson_11.day_6.task_38.UI;

import roman.lesson_11.day_6.task_38.Book;
import roman.lesson_11.day_6.task_38.BookDatabase;
import roman.lesson_11.day_6.task_38.BookDatabaseImpl;

public class ContainsUIActionDemo {
    public static void main(String[] args) {
        Book garden = new Book("James", "Garden", "2000");

        BookDatabase bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(garden);

        ContainsUIAction containsUIAction = new ContainsUIAction(bookDatabase);
        containsUIAction.execute();

    }
}
