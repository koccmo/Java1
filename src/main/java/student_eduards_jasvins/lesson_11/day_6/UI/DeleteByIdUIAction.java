package student_eduards_jasvins.lesson_11.day_6.UI;

import student_eduards_jasvins.lesson_11.day_6.BookDatabase;
import teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class DeleteByIdUIAction implements UIAction {

    BookDatabase bookDatabase;

    public DeleteByIdUIAction(BookDatabase bookDatabase) { this.bookDatabase = bookDatabase; }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book's ID, to delete it: ");
        Long id = scanner.nextLong();

        if (bookDatabase.delete(id)) {
            System.out.println("Book have been deleted!");
        } else {
            System.out.println("We can't delete this book!");
        }
    }
}
