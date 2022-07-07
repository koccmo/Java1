package roman.lesson_11.day_6.task_38.UI;

import roman.lesson_11.day_6.task_38.Book;
import roman.lesson_11.day_6.task_38.BookDatabase;
import roman.lesson_11.day_6.task_38.UIAction;

import java.util.Set;

public class FindUniqueBooks implements UIAction {
    private BookDatabase bookDatabase;

    public FindUniqueBooks(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Set<Book> uniqueBooks = bookDatabase.findUniqueBooks();
        if (uniqueBooks.isEmpty()) {
            System.out.println("Library is Empty!");
        } else {
            System.out.println("Unique Book - " + uniqueBooks.toString());
        }
    }
}
