package student_eduards_jasvins.lesson_11.day_6.UI;



import student_eduards_jasvins.lesson_11.day_6.Book;
import student_eduards_jasvins.lesson_11.day_6.BookDatabase;
import teacher.codereview.CodeReview;

import java.util.List;
import java.util.Scanner;

@CodeReview(approved = true)
public class FindByTitleUIAction implements  UIAction{

    BookDatabase bookDatabase;

    public FindByTitleUIAction(BookDatabase bookDatabase) { this.bookDatabase = bookDatabase; }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Title: ");
        String title = scanner.nextLine();

        List<Book> list = bookDatabase.findByTitle(title);
        if (list.size() > 0) {
            System.out.println("Books with this '"+ title +"' is: " + list);
        } else {
            System.out.println("Book with this '" + title + "' library don't have");
        }
    }
}
