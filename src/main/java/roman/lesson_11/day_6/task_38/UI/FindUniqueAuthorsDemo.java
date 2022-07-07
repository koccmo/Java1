package roman.lesson_11.day_6.task_38.UI;

import roman.lesson_11.day_6.task_38.Book;
import roman.lesson_11.day_6.task_38.BookDatabase;
import roman.lesson_11.day_6.task_38.BookDatabaseImpl;

public class FindUniqueAuthorsDemo {
    public static void main(String[] args) {
        Book garden = new Book("James", "Garden", "2000");
        Book porch = new Book("James", "Garden", "2001");
        Book hope = new Book("John", "Hope", "2002");

        BookDatabase bookDatabase = new BookDatabaseImpl();

        bookDatabase.save(garden);
        bookDatabase.save(porch);
        bookDatabase.save(hope);

        FindUniqueAuthors findUniqueAuthors = new FindUniqueAuthors(bookDatabase);
        findUniqueAuthors.execute();

    }
}
