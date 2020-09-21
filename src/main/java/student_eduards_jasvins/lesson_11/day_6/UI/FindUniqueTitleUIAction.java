package student_eduards_jasvins.lesson_11.day_6.UI;

import student_eduards_jasvins.lesson_11.day_6.BookDatabase;

public class FindUniqueTitleUIAction implements UIAction {

    BookDatabase bookDatabase;

    public FindUniqueTitleUIAction(BookDatabase bookDatabase) { this.bookDatabase = bookDatabase; }

    @Override
    public void execute() {
        System.out.println("Unique titles in library: " + bookDatabase.findUniqueTitles());

    }
}
