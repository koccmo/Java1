package student_igors_bartkevics.lesson_11.homework.level_6_middle.task_38_approved.UI;

import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_38_approved.BookDatabase;
import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_38_approved.UIAction;

import java.util.Set;

public class FindUniqueAuthorsUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindUniqueAuthorsUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {

        Set<String> uniqueAuthors = bookDatabase.findUniqueAuthors();
        if (uniqueAuthors.size() == 0) {
            System.out.println("Library is empty");
        }
        else {
            System.out.println("Unique authors are : ");
            for (String author : uniqueAuthors) {
                System.out.println(author);
            }
        }
    }
}
