package student_aleksandra_maksimovic.lesson_11.level_2_6;

import java.util.Set;

public class FindUniqueBooksUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindUniqueBooksUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Set<Book> books = this.bookDatabase.findUniqueBooks();

        if (books.size() == 0) {
            System.out.println("Nothing found...");
            return;
        }

        System.out.println("Found " + books.size() + " books:");
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }
}
