package student_dmitrijs_jasvins.lesson_11.day_6_approved.UI;

import student_dmitrijs_jasvins.lesson_11.day_6_approved.Book;
import student_dmitrijs_jasvins.lesson_11.day_6_approved.BookDatabase;

import java.util.Optional;
import java.util.Scanner;

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
