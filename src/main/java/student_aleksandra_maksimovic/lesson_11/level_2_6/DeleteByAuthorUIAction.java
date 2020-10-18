package student_aleksandra_maksimovic.lesson_11.level_2_6;

import java.util.List;
import java.util.Scanner;

public class DeleteByAuthorUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter author:");
        String author = scanner.nextLine();

        int deleted = this.bookDatabase.deleteByAuthor(author);

        System.out.println(deleted + " books deleted");
    }
}
