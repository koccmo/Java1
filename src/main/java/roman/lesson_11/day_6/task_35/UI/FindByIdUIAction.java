package roman.lesson_11.day_6.task_35.UI;




import roman.lesson_11.day_6.task_34.Book;
import roman.lesson_11.day_6.task_34.BookDatabase;
import roman.lesson_11.day_6.task_34.UIAction;

import java.util.Optional;
import java.util.Scanner;

public class FindByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    private Long getBookId() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book Id :");
        Long bookId = scanner.nextLong();
        return bookId;
    }


    @Override
    public void execute() {
        Long bookId = getBookId();
        Optional<Book> book = bookDatabase.findById(bookId);
        if (book.isPresent()) {
            System.out.println("Book with id = " + bookId + " : Book Author : " +
                    book.get().getAuthor() + " , Book Title : " + book.get().getTitle()
                     + " , Book issue year : " + book.get().getYearOfIssue());
        } else {
            System.out.println("Book with Id : " + bookId + " - Not found");
        }
    }
}
