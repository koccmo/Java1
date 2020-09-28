package student_volodya_danilin.lesson_11.level_6;

import java.util.Optional;
import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DeleteByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter book's ID : ");
        Long bookId = sc.nextLong();

        Optional<Book> bookOpt = bookDatabase.findById(bookId);

        if (bookOpt.isPresent()) {
            bookDatabase.delete(bookId);
        }
        else {
            System.out.println("Book not found!");
        }
    }

}
