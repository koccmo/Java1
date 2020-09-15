package student_igors_bartkevics.lesson_11.homework.level_6_middle.task_38.UI;

import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_38.BookDatabase;
import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_38.UIAction;
import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_38.Book;

import java.util.Set;

public class FindUniqueBooksUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindUniqueBooksUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {

        Set<Book> uniqueBooks = bookDatabase.findUniqueBooks();
        if (uniqueBooks.size() == 0) {
            System.out.println("Library is empty");
        }
        else {
            System.out.println("Unique books are : ");
            for (Book book : uniqueBooks) {
                System.out.println(book.getAuthor() + " - " + book.getTitle());
            }
        }
    }
}
