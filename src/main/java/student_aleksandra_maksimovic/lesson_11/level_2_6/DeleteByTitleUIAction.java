package student_aleksandra_maksimovic.lesson_11.level_2_6;

import java.util.Scanner;

public class DeleteByTitleUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter title:");
        String title = scanner.nextLine();

        int deleted = this.bookDatabase.deleteByTitle(title);

        System.out.println(deleted + " books deleted");
    }
}
