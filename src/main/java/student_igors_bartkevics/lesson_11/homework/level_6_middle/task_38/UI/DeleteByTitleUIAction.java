package student_igors_bartkevics.lesson_11.homework.level_6_middle.task_38.UI;

import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_38.BookDatabase;
import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_38.UIAction;

import java.util.Scanner;

public class DeleteByTitleUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter title of the  book you would like to delete");
        String title = scanner.nextLine();
        if (bookDatabase.findByTitle(title).size() == 0) {
            System.out.println("Books with title: '" + title + "' not found");
        } else {
            bookDatabase.deleteByTitle(title);
            System.out.println("All books with title: '" + title + "' are deleted");
        }


    }
}
