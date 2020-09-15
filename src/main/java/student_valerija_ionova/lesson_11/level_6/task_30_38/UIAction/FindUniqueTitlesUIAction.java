package student_valerija_ionova.lesson_11.level_6.task_30_38.UIAction;

import student_valerija_ionova.lesson_11.level_6.task_30_38.BookDatabase;

public class FindUniqueTitlesUIAction implements UIAction {

    BookDatabase bookDatabase;

    FindUniqueTitlesUIAction(BookDatabase bookDatabase){
        this.bookDatabase = bookDatabase;
    }


    @Override
    public void execute() {
        System.out.println("We have books with following titles in database: \n" + bookDatabase.findUniqueTitles());
    }
}
