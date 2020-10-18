package student_aleksandra_maksimovic.lesson_11.level_2_6;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class GetAuthorToBooksMapUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public GetAuthorToBooksMapUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Map<String, List<Book>> authorToBooks = this.bookDatabase.getAuthorToBooksMap();

        if (authorToBooks.size() == 0) {
            System.out.println("Nothing found...");
            return;
        }

        for (Map.Entry<String, List<Book>> entry : authorToBooks.entrySet()) {
            System.out.println(entry.getKey() + ":");
            for (Book book : entry.getValue()) {
                System.out.println(book.toString());
            }
        }
    }
}
