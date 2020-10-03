package student_aleksandra_maksimovic.lesson_11.level_2_6;

import java.util.List;
import java.util.Scanner;

public class FindByTitleUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter title:");
        String title = scanner.nextLine();

        List<Book> books = this.bookDatabase.findByTitle(title);

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
