package roman.lesson_11.day_6.task_38.UI;

import roman.lesson_11.day_6.task_38.BookDatabase;
import roman.lesson_11.day_6.task_38.UIAction;

import java.util.Set;

public class FindUniqueTitle implements UIAction {
    private BookDatabase bookDatabase;

    public FindUniqueTitle(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Set<String> uniqueTitle = bookDatabase.findUniqueTitles();
        if (uniqueTitle.isEmpty()) {
            System.out.println("Library is Empty!");
        } else {
            System.out.println("Unique Titles - " + uniqueTitle.toString());
        }
    }
}
