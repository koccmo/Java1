package student_igors_bartkevics.lesson_11.homework.level_6_middle.task_38_approved.UI;

import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_38_approved.BookDatabase;
import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_38_approved.UIAction;

import java.util.Set;

public class FindUniqueTitlesUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindUniqueTitlesUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {

        Set<String> uniqueTitles = bookDatabase.findUniqueTitles();
        if (uniqueTitles.size() == 0) {
            System.out.println("Library is empty");
        }
        else {
            System.out.println("Unique titles are : ");
            for (String title : uniqueTitles) {
                System.out.println(title);
            }
        }
    }
}
