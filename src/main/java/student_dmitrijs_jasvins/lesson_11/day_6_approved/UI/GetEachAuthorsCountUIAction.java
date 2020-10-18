package student_dmitrijs_jasvins.lesson_11.day_6_approved.UI;

import student_dmitrijs_jasvins.lesson_11.day_6_approved.BookDatabase;


public class GetEachAuthorsCountUIAction implements UIAction {

    BookDatabase bookDatabase;

    public GetEachAuthorsCountUIAction(BookDatabase bookDatabase) { this.bookDatabase = bookDatabase; }

    @Override
    public void execute() {
        System.out.println("See each author book count: " + bookDatabase.getEachAuthorBookCount());
    }
}
