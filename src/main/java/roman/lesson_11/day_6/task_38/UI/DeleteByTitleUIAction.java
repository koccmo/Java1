package roman.lesson_11.day_6.task_38.UI;


import roman.lesson_11.day_6.task_38.BookDatabase;
import roman.lesson_11.day_6.task_38.UIAction;


import java.util.Scanner;

public class DeleteByTitleUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public DeleteByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    private String getTitleFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Title -");
        return scanner.nextLine();
    }

    @Override
    public void execute() {
        String bookTitle = getTitleFromUser();
        if (bookDatabase.findByTitle(bookTitle).isEmpty()) {
            System.out.println("With title - '" + bookTitle + " ' books NOT FOUND!");
        } else {
            bookDatabase.deleteByTitle(bookTitle);
            System.out.println("Book with Title - '" + bookTitle + "' Deleted!");
        }
    }
}
