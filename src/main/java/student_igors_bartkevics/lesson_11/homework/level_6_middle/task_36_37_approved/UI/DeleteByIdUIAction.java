package student_igors_bartkevics.lesson_11.homework.level_6_middle.task_36_37_approved.UI;

import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_36_37_approved.BookDatabase;
import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_36_37_approved.UIAction;
import teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class DeleteByIdUIAction implements UIAction {

    private final BookDatabase bookDatabase;

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id of book");
        Long id = scanner.nextLong();
        if (bookDatabase.delete(id)) {
            System.out.println("Book with id = " + id + " is deleted");
        }
        else {
            System.out.println("Book with id = " + id + " not found");
        }
    }

}