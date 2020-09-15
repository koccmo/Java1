package student_igors_bartkevics.lesson_11.homework.level_6_middle.task_38.UI;

import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_38.Book;
import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_38.BookDatabase;
import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_38.UIAction;

import java.util.Scanner;

public class ContainsUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public ContainsUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter author of the book");
        String author = scanner.nextLine();
        System.out.println("Enter title of the book");
        String title = scanner.nextLine();
        Book book = new Book(author, title);
        boolean contains = bookDatabase.contains(book);
        if (contains) {
            System.out.println("Book not found");
        }
        else {
            System.out.println("Books is in the library");
        }
    }
}
