package student_dmitrijs_jasvins.lesson_11.day_6_approved.UI;

import student_dmitrijs_jasvins.lesson_11.day_6_approved.BookDatabase;


public class CountAllBookUIAction implements UIAction {

    BookDatabase bookDatabase;


    @Override
    public void execute() {
        System.out.println("Books in library is:  " + bookDatabase.countAllBooks());
    }
}
