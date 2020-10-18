package student_valerija_ionova.lesson_11.level_7_senior_approved.super_task_1.UIAction;

import student_valerija_ionova.lesson_11.level_7_senior_approved.super_task_1.BookDatabase;

import java.util.Scanner;

public class DeleteByAuthorUIAction implements UIAction {

    BookDatabase bookDatabase;

    DeleteByAuthorUIAction (BookDatabase bookDatabase){
        this.bookDatabase = bookDatabase;
    }


    @Override
    public void execute() {
        System.out.println("Please enter author to delete his books:");
        Scanner in = new Scanner(System.in);
        String author = in.nextLine();

        bookDatabase.deleteByAuthor(author);

    }
}
