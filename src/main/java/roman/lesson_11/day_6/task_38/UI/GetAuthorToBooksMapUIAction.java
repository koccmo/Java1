package roman.lesson_11.day_6.task_38.UI;

import roman.lesson_11.day_6.task_38.Book;
import roman.lesson_11.day_6.task_38.BookDatabase;
import roman.lesson_11.day_6.task_38.UIAction;

import java.util.List;
import java.util.Map;

public class GetAuthorToBooksMapUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public GetAuthorToBooksMapUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Map<String, List<Book>> authorBookMap = bookDatabase.getAuthorToBooksMap();
        if (authorBookMap.isEmpty()) {
            System.out.println("Library is Empty");
        } else {
            System.out.println("Author to Book Map : ");
            for (Map.Entry<String, List<Book>> entry : authorBookMap.entrySet()) {
                System.out.println(entry.getKey() + " : ");
                for (Book book : entry.getValue()) {
                    System.out.println("        " + book.getTitle());}
            }
        }
    }
}
