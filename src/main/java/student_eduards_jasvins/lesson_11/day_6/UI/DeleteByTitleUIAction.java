package student_eduards_jasvins.lesson_11.day_6.UI;

import student_eduards_jasvins.lesson_11.day_6.BookDatabase;
import teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class DeleteByTitleUIAction implements UIAction {

    BookDatabase bookDatabase;

    public DeleteByTitleUIAction(BookDatabase bookDatabase) { this.bookDatabase = bookDatabase; }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book's title, to delete it: ");
        String title = scanner.nextLine();

       bookDatabase.deleteByTitle(title);
    }
}
