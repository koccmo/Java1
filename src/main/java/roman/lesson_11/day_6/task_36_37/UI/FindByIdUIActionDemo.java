package roman.lesson_11.day_6.task_36_37.UI;


import roman.lesson_11.day_6.task_36_37.Book;
import roman.lesson_11.day_6.task_36_37.BookDatabase;
import roman.lesson_11.day_6.task_36_37.BookDatabaseImpl;

public class FindByIdUIActionDemo {
    public static void main(String[] args) {
        Book garden = new Book("James", "Garden", "2000");
        Book porch = new Book("John", "Porch", "1999");

        BookDatabase bookDatabase = new BookDatabaseImpl();
        FindByIdUIAction findByIdUIAction = new FindByIdUIAction(bookDatabase);

        bookDatabase.save(garden);
        bookDatabase.save(porch);

        findByIdUIAction.execute();
    }
}
