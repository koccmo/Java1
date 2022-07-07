package roman.lesson_11.day_6.task_38.UI;

import roman.lesson_11.day_6.task_38.Book;
import roman.lesson_11.day_6.task_38.BookDatabase;
import roman.lesson_11.day_6.task_38.BookDatabaseImpl;
import roman.lesson_11.day_6.task_38.UI.GetAuthorToBooksMapUIAction;

public class GetAuthorToBooksMapUIActionDemo {
    public static void main(String[] args) {
        Book garden = new Book("James", "Garden", "2000");
        Book porch = new Book("James", "Porch", "2001");
        Book hope = new Book("John", "Hope", "2002");

        BookDatabase bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(garden);
        bookDatabase.save(porch);
        bookDatabase.save(hope);

        GetAuthorToBooksMapUIAction getAuthorToBooksMapUIAction = new GetAuthorToBooksMapUIAction(bookDatabase);
        getAuthorToBooksMapUIAction.execute();

    }
}
