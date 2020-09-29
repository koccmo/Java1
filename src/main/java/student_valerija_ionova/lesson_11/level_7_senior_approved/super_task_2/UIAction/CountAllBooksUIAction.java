package student_valerija_ionova.lesson_11.level_7_senior_approved.super_task_2.UIAction;

import student_valerija_ionova.lesson_11.level_7_senior_approved.super_task_2.BookDatabase;

public class CountAllBooksUIAction implements UIAction {

    BookDatabase bookDatabase;

    CountAllBooksUIAction (BookDatabase bookDatabase){
        this.bookDatabase = bookDatabase;
    }


    @Override
    public void execute() {
        System.out.println("Number of books in library is: " + bookDatabase.countAllBooks());
    }
}
