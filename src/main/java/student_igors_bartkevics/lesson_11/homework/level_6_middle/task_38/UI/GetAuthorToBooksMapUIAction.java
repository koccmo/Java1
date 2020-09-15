package student_igors_bartkevics.lesson_11.homework.level_6_middle.task_38.UI;

import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_38.Book;
import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_38.BookDatabase;
import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_38.UIAction;

import java.util.List;
import java.util.Map;

public class GetAuthorToBooksMapUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public GetAuthorToBooksMapUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {

        Map<String, List<Book>> authorToBooksMap = bookDatabase.getAuthorToBooksMap();
        if (authorToBooksMap.size() == 0) {
            System.out.println("Library is empty");
        }
        else {
            System.out.println("Author to books map : ");
            for (Map.Entry<String, List<Book>> entry : authorToBooksMap.entrySet()) {
                System.out.println(entry.getKey() + ": ");
                for (Book book : entry.getValue()) {
                    System.out.println("                      " + book.getTitle());
                }
            }
        }
    }
}
