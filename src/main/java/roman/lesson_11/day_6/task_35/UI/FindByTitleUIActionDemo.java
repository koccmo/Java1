package roman.lesson_11.day_6.task_35.UI;


import roman.lesson_11.day_6.task_35.Book;
import roman.lesson_11.day_6.task_35.BookDatabase;
import roman.lesson_11.day_6.task_35.BookDatabaseImpl;

public class FindByTitleUIActionDemo {
    public static void main(String[] args) {

        Book garden = new Book("James", "Garden", "2000");
        Book hope = new Book("James", "Hope", "1990");
        Book porch = new Book("John", "Garden", "1987");

        BookDatabase bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(garden);
        bookDatabase.save(hope);
        bookDatabase.save(porch);

        FindByTitleUIAction findByTitleUIAction = new FindByTitleUIAction(bookDatabase);
        findByTitleUIAction.execute();
    }
}
