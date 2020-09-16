package student_igors_bartkevics.lesson_11.homework.level_6_middle.task_38_approved.UI;

import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_38_approved.BookDatabase;
import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_38_approved.UIAction;

import java.util.Map;

public class GetEachAuthorBookCountUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public GetEachAuthorBookCountUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {

        Map<String, Integer> eachAuthorBookCount = bookDatabase.getEachAuthorBookCount();
        if (eachAuthorBookCount.isEmpty()) {
            System.out.println("Library is empty");
        }
        else {
            System.out.println("Author to books map : ");
            for (Map.Entry<String, Integer> entry : eachAuthorBookCount.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
