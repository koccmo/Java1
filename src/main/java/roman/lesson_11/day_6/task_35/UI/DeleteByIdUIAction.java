package roman.lesson_11.day_6.task_35.UI;

import roman.lesson_11.day_6.task_35.BookDatabase;
import roman.lesson_11.day_6.task_35.UIAction;

import java.util.Scanner;

public class DeleteByIdUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    private Long getIdNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book ID Number : ");
        return scanner.nextLong();
    }

    @Override
    public void execute() {
        if (bookDatabase.delete(getIdNumber())) {
            System.out.println("Book deleted!");
        } else {
            System.out.println("Book with this ID NOT FOUND!");
        }
    }
}
