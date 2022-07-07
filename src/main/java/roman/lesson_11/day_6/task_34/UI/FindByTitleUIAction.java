package roman.lesson_11.day_6.task_34.UI;

import roman.lesson_10.day_4.FahrenheitConverter;
import roman.lesson_11.day_6.task_34.Book;
import roman.lesson_11.day_6.task_34.BookDatabase;
import roman.lesson_11.day_6.task_34.BookDatabaseImpl;
import roman.lesson_11.day_6.task_34.UIAction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindByTitleUIAction implements UIAction {
    private BookDatabase bookDatabase;


    public FindByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    private String getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Title : ");
        return scanner.nextLine();
    }


    @Override
    public void execute() {
        List<Book> allBookWithSameTitle = bookDatabase.findByTitle(getData());
        if (allBookWithSameTitle.size() == 0) {
            System.out.println("Books with this Title not found!");
        } else {
            for (Book book : allBookWithSameTitle) {
                System.out.println("Book Author - " + book.getAuthor() + " : Book Title - " + book.getTitle());
            }
        }
    }
}
