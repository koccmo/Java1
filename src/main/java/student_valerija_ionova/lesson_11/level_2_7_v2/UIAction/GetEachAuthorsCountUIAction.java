package student_valerija_ionova.lesson_11.level_2_7_v2.UIAction;

import student_valerija_ionova.lesson_11.level_7_senior.super_task_2.BookDatabase;

public class GetEachAuthorsCountUIAction implements UIAction {

    BookDatabase bookDatabase;

    GetEachAuthorsCountUIAction (BookDatabase bookDatabase){
        this.bookDatabase = bookDatabase;
    }


    @Override
    public void execute() {
        System.out.println("Please see each author books count in database:" + bookDatabase.getEachAuthorBookCount());

    }
}
