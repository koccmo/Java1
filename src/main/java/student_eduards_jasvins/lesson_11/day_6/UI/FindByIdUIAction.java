package student_eduards_jasvins.lesson_11.day_6.UI;

import student_eduards_jasvins.lesson_11.day_6.Book;
import student_eduards_jasvins.lesson_11.day_6.BookDatabase;
import teacher.codereview.CodeReview;

import java.util.Optional;
import java.util.Scanner;

@CodeReview(approved = true)
public class FindByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book ID: ");
        Long id = scanner.nextLong();

        Optional<Book> bookOpt = bookDatabase.findById(id);
        if (bookOpt.isPresent()) {
            Book foundedBook = bookOpt.get();
            System.out.println("Book has been founded: " + foundedBook);
        } else {
            System.out.println("Library don't have book with this ID: " + id);
        }
    }
}
