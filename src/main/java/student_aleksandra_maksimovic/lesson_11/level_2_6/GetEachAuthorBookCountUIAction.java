package student_aleksandra_maksimovic.lesson_11.level_2_6;

import java.util.List;
import java.util.Map;

public class GetEachAuthorBookCountUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public GetEachAuthorBookCountUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Map<String, Integer> authorBookCount = this.bookDatabase.getEachAuthorBookCount();

        if (authorBookCount.size() == 0) {
            System.out.println("Nothing found...");
            return;
        }

        for (Map.Entry<String, Integer> entry : authorBookCount.entrySet()) {
            System.out.println(entry.getKey() + " has " + entry.getValue() + " books");
        }
    }
}
