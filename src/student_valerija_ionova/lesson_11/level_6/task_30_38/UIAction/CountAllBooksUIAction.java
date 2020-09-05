package student_valerija_ionova.lesson_11.level_6.task_30_38.UIAction;

import student_valerija_ionova.lesson_11.level_6.task_30_38.BookDatabase;

public class CountAllBooksUIAction implements  UIAction{

    BookDatabase bookDatabase;

    CountAllBooksUIAction (BookDatabase bookDatabase){
        this.bookDatabase = bookDatabase;
    }


    @Override
    public void execute() {
        System.out.println("Number of books in library is: " + bookDatabase.countAllBooks());
    }
}
