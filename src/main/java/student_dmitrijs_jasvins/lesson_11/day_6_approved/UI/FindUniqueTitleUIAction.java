package student_dmitrijs_jasvins.lesson_11.day_6_approved.UI;

import student_dmitrijs_jasvins.lesson_11.day_6_approved.BookDatabase;


public class FindUniqueTitleUIAction implements UIAction {

    BookDatabase bookDatabase;

    public FindUniqueTitleUIAction(BookDatabase bookDatabase) { this.bookDatabase = bookDatabase; }

    @Override
    public void execute() {
        System.out.println("Unique titles in library: " + bookDatabase.findUniqueTitles());

    }
}
