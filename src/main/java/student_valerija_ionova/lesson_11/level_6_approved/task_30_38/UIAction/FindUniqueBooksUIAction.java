package student_valerija_ionova.lesson_11.level_6_approved.task_30_38.UIAction;

import student_valerija_ionova.lesson_11.level_6_approved.task_30_38.BookDatabase;

public class FindUniqueBooksUIAction implements UIAction {

    BookDatabase bookDatabase;

    FindUniqueBooksUIAction (BookDatabase bookDatabase){
        this.bookDatabase = bookDatabase;
    }


    @Override
    public void execute() {
        System.out.println("Unique books in library: \n" + bookDatabase.findUniqueBooks());
    }
}
