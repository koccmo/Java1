package student_valerija_ionova.lesson_11.level_7_senior.super_task_2.UIAction;

import student_valerija_ionova.lesson_11.level_7_senior.super_task_2.BookDatabase;

public class FindUniqueAuthorsUIAction implements UIAction {

    BookDatabase bookDatabase;

    FindUniqueAuthorsUIAction (BookDatabase bookDatabase){
        this.bookDatabase = bookDatabase;
    }


    @Override
    public void execute() {
        System.out.println("In database are following author's books: \n" + bookDatabase.findUniqueAuthors());
    }
}
