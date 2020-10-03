package student_aleksandra_maksimovic.lesson_11.level_2_6;

import java.util.Optional;
import java.util.Scanner;

class FindByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter id:");
        Long id = scanner.nextLong();

        Optional<Book> book = this.bookDatabase.findById(id);

        if (book.isEmpty()) {
            System.out.println("Nothing found...");
            return;
        }

        System.out.println("Found: " + book.get().toString());
    }
}
