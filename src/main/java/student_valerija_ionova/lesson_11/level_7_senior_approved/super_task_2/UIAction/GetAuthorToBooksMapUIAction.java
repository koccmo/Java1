package student_valerija_ionova.lesson_11.level_7_senior_approved.super_task_2.UIAction;

import student_valerija_ionova.lesson_11.level_7_senior_approved.super_task_2.BookDatabase;

public class GetAuthorToBooksMapUIAction implements UIAction {

    BookDatabase bookDatabase;

    GetAuthorToBooksMapUIAction (BookDatabase bookDatabase){
        this.bookDatabase = bookDatabase;
    }


    @Override
    public void execute() {
        System.out.println("Please see books of each author:" + bookDatabase.getAuthorToBooksMap());

    }
}
