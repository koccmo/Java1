package student_valerija_ionova.lesson_11.level_7_senior.UIAction;

import student_valerija_ionova.lesson_11.level_7_senior.BookDatabase;

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
