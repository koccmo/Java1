package student_eduards_jasvins.lesson_11.day_6.UI;

import student_eduards_jasvins.lesson_11.day_6.Book;
import student_eduards_jasvins.lesson_11.day_6.BookDatabase;
import teacher.codereview.CodeReview;

import java.util.List;
import java.util.Scanner;

@CodeReview(approved = true)
public class FindByAuthorUIAction implements UIAction {

    BookDatabase bookDatabase;

    public FindByAuthorUIAction(BookDatabase bookDatabase) { this.bookDatabase = bookDatabase; }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book's author: ");
        String author = scanner.nextLine();

        List<Book> list = bookDatabase.findByAuthor(author);

        if (list.size() > 0) {
            System.out.println("Books with this '" + author + "' is: " + list);
        } else {
            System.out.println("We don't have books with this " + author);
        }

    }
}
