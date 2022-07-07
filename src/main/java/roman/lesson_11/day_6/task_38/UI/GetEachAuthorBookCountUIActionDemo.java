package roman.lesson_11.day_6.task_38.UI;

import roman.lesson_11.day_6.task_38.Book;
import roman.lesson_11.day_6.task_38.BookDatabase;
import roman.lesson_11.day_6.task_38.BookDatabaseImpl;

public class GetEachAuthorBookCountUIActionDemo {
    public static void main(String[] args) {
        Book garden = new Book("James", "Garden", "2000");
        Book porch = new Book("James", "Porch", "1999");
        Book hope = new Book("John", "Hope", "2002");
        Book peace = new Book("James", "Peace", "2003");

        BookDatabase bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(garden);
        bookDatabase.save(porch);
        bookDatabase.save(hope);
        bookDatabase.save(peace);

        GetEachAuthorBookCountUIAction getEachAuthorBookCountUIAction = new GetEachAuthorBookCountUIAction(bookDatabase);
        getEachAuthorBookCountUIAction.execute();
    }
}
