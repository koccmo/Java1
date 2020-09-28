package student_eduards_jasvins.lesson_11.day_6.UI;

import student_eduards_jasvins.lesson_11.day_6.BookDatabase;
import teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class DeleteByAuthorUIAction implements UIAction {

    BookDatabase bookDatabase;

    public DeleteByAuthorUIAction(BookDatabase bookDatabase) { this.bookDatabase = bookDatabase; }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter author to delete book: ");
        String author = scanner.nextLine();
        bookDatabase.deleteByAuthor(author);

    }
}
