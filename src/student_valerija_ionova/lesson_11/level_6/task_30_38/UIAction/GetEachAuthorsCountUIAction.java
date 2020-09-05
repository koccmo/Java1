package student_valerija_ionova.lesson_11.level_6.task_30_38.UIAction;

import student_valerija_ionova.lesson_11.level_6.task_30_38.BookDatabase;

public class GetEachAuthorsCountUIAction implements  UIAction{

    BookDatabase bookDatabase;

    GetEachAuthorsCountUIAction (BookDatabase bookDatabase){
        this.bookDatabase = bookDatabase;
    }


    @Override
    public void execute() {
        System.out.println("Please see each author books count in database:" + bookDatabase.getEachAuthorBookCount());

    }
}
