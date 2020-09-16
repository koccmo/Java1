package student_igors_bartkevics.lesson_11.homework.level_6_middle.task_38_approved.UI;

import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_38_approved.BookDatabase;
import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_38_approved.UIAction;


public class CountAllBooksUIAction implements UIAction {

    private final BookDatabase bookDatabase;

    public CountAllBooksUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        System.out.println("There are " + bookDatabase.countAllBooks() + " book/s in the library");
    }

}