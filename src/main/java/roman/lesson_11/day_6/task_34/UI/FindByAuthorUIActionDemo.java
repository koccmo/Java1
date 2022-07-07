package roman.lesson_11.day_6.task_34.UI;


import roman.lesson_11.day_6.task_34.Book;
import roman.lesson_11.day_6.task_34.BookDatabase;
import roman.lesson_11.day_6.task_34.BookDatabaseImpl;

public class FindByAuthorUIActionDemo {
    public static void main(String[] args) {
        BookDatabase bookDatabase = new BookDatabaseImpl();

        Book garden = new Book("James", "Garden", "2000");
        Book porch = new Book("James", "Porch", "1990");
        Book hope = new Book("John", "Hope", "2001");

        bookDatabase.save(garden);
        bookDatabase.save(porch);
        bookDatabase.save(hope);

        FindByAuthorUIAction findByAuthorUIAction = new FindByAuthorUIAction(bookDatabase);
        findByAuthorUIAction.execute();
    }
}
