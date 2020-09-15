package student_igors_bartkevics.lesson_11.homework.level_6_middle.task_38.UI;

import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_38.BookDatabase;
import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_38.UIAction;

import java.util.Scanner;

public class DeleteByAuthorUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter author who's books you would like to delete");
        String author = scanner.nextLine();
        if (bookDatabase.findByAuthor(author).size() ==0) {
            System.out.println("Books by author: '" + author + "' not found");
        } else {
            bookDatabase.deleteByAuthor(author);
            System.out.println("All books by author: '" + author + "' are deleted");
        }


    }
}
