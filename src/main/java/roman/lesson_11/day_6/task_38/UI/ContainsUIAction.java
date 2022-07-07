package roman.lesson_11.day_6.task_38.UI;

import roman.lesson_11.day_6.task_38.Book;
import roman.lesson_11.day_6.task_38.BookDatabase;
import roman.lesson_11.day_6.task_38.UIAction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContainsUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public ContainsUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    private List<String> getDataFromUser() {
        Scanner scanner = new Scanner(System.in);
        List<String> dataFromUser = new ArrayList<>();
        System.out.println("Enter Author :");
        dataFromUser.add(scanner.nextLine());
        System.out.println("Enter Title : ");
        dataFromUser.add(scanner.nextLine());
        System.out.println("Enter Year of Issue : ");
        dataFromUser.add(scanner.nextLine());
        return dataFromUser;
    }

    private Book creatingBookFromUserData() {
        List<String> dataFromUser = getDataFromUser();
        Book userBook = new Book(dataFromUser.get(0), dataFromUser.get(1), dataFromUser.get(2));
        return userBook;
    }

    @Override
    public void execute() {
        if (bookDatabase.contains(creatingBookFromUserData())) {
            System.out.println("Library contain this Book!");
        } else {
            System.out.println("Library not contain this Book!");
        }
    }
}
