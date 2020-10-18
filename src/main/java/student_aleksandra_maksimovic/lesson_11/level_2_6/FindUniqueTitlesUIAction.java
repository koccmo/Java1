package student_aleksandra_maksimovic.lesson_11.level_2_6;

import java.util.Set;

public class FindUniqueTitlesUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindUniqueTitlesUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Set<String> titles = this.bookDatabase.findUniqueTitles();

        if (titles.size() == 0) {
            System.out.println("Nothing found...");
            return;
        }

        System.out.println("Found " + titles.size() + " titles:");
        for (String title : titles) {
            System.out.println(title);
        }
    }
}
