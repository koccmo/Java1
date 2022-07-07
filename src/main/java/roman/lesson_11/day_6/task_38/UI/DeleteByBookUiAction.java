package roman.lesson_11.day_6.task_38.UI;

import roman.lesson_11.day_6.task_38.Book;
import roman.lesson_11.day_6.task_38.BookDatabase;
import roman.lesson_11.day_6.task_38.UIAction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeleteByBookUiAction implements UIAction {
    private BookDatabase bookDatabase;

    public DeleteByBookUiAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    private List<String> getData() {
        List<String> dataFromUser = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Author :");
        dataFromUser.add(scanner.nextLine());
        System.out.println("Enter Title :");
        dataFromUser.add(scanner.nextLine());
        System.out.println("Enter Ear of issue :");
        dataFromUser.add(scanner.nextLine());
        return dataFromUser;
    }

    @Override
    public void execute() {
        List<String> userData = getData();
        Book bookToDelete = new Book(userData.get(0), userData.get(1), userData.get(2));
        if (bookDatabase.delete(bookToDelete)) {
            System.out.println("Book been deleted!");
        } else {
            System.out.println("Book not found!");
        }
    }
}
