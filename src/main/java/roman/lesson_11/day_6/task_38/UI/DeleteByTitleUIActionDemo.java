package roman.lesson_11.day_6.task_38.UI;

import roman.lesson_11.day_6.task_38.Book;
import roman.lesson_11.day_6.task_38.BookDatabase;
import roman.lesson_11.day_6.task_38.BookDatabaseImpl;

public class DeleteByTitleUIActionDemo {
    public static void main(String[] args) {
        Book garden = new Book("James", "Garden", "2000");
        Book porch = new Book("John", "Garden", "1999");

        BookDatabase bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(garden);
        bookDatabase.save(porch);

        System.out.println("Books in Library = " + bookDatabase.countAllBooks() + " !");

        DeleteByTitleUIAction deleteByTitleUIAction = new DeleteByTitleUIAction(bookDatabase);
        deleteByTitleUIAction.execute();

        System.out.println("Books in Library = " + bookDatabase.countAllBooks() + " !");
    }
}
