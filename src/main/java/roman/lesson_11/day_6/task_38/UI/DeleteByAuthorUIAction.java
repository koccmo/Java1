package roman.lesson_11.day_6.task_38.UI;

import roman.lesson_11.day_6.task_38.BookDatabase;
import roman.lesson_11.day_6.task_38.UIAction;

import java.util.Scanner;

public class DeleteByAuthorUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public  DeleteByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    private String getAuthorFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Author");
        return scanner.nextLine();
    }

    @Override
    public void execute() {
        String author = getAuthorFromUser();
        if (bookDatabase.findByAuthor(author).isEmpty()) {
            System.out.println("Book with Author : " + author + " Not Found!");
        } else {
            bookDatabase.deleteByAuthor(author);
            System.out.println("All Book with Author : " + author + " , deleted!");
        }
    }
}
