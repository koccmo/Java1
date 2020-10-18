package student_aleksandra_maksimovic.lesson_11.level_2_6;

import java.util.Scanner;
import java.util.Set;

public class FindUniqueAuthorsUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindUniqueAuthorsUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Set<String> authors = this.bookDatabase.findUniqueAuthors();

        if (authors.size() == 0) {
            System.out.println("Nothing found...");
            return;
        }

        System.out.println("Found " + authors.size() + " authors:");
        for (String author : authors) {
            System.out.println(author);
        }
    }
}
