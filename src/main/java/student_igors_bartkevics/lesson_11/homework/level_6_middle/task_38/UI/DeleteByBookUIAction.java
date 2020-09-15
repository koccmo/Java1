package student_igors_bartkevics.lesson_11.homework.level_6_middle.task_38.UI;

import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_38.Book;
import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_38.BookDatabase;
import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_38.UIAction;

import java.util.Scanner;

public class DeleteByBookUIAction implements UIAction {

    private final BookDatabase bookDatabase;

    public DeleteByBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which book you would like to delete?");
        System.out.println("Enter author of the book:");
        String author = scanner.nextLine();
        System.out.println("Enter title of the book:");
        String title = scanner.nextLine();
        if (bookDatabase.delete(new Book(author, title))) {
            System.out.println("Book: " + author + " -  " + title + " is deleted");
        }
        else {
            System.out.println("Book: " + author + " - " + title + " not found");
        }
    }

}