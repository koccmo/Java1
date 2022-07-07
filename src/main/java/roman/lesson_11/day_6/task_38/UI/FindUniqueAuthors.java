package roman.lesson_11.day_6.task_38.UI;

import roman.lesson_11.day_6.task_38.BookDatabase;
import roman.lesson_11.day_6.task_38.UIAction;


import java.util.Set;

public class FindUniqueAuthors implements UIAction {
    private BookDatabase bookDatabase;

    public FindUniqueAuthors(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Set<String> listOfUniqueAuthors = bookDatabase.findUniqueAuthors();
        if (listOfUniqueAuthors.isEmpty()) {
            System.out.println("Library is Empty!");
        } else { System.out.println("Unique Authors - " + listOfUniqueAuthors.toString()); }
    }
}
