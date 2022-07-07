package roman.lesson_11.day_6.task_38.UI;


import roman.lesson_11.day_6.task_38.Book;
import roman.lesson_11.day_6.task_38.BookDatabase;
import roman.lesson_11.day_6.task_38.BookDatabaseImpl;

public class FindUniqueTitleDemo {
    public static void main(String[] args) {
        Book garden = new Book("James", "Garden", "2000");
        Book porch = new Book("John", "Garden", "2001");
        Book hope = new Book("James", "Hope", "2000");

        BookDatabase bookDatabase = new BookDatabaseImpl();

        bookDatabase.save(garden);
        bookDatabase.save(porch);
        bookDatabase.save(hope);

        FindUniqueTitle findUniqueTitle = new FindUniqueTitle(bookDatabase);
        findUniqueTitle.execute();
    }
}
