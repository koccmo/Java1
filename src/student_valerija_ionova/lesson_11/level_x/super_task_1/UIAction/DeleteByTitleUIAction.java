package student_valerija_ionova.lesson_11.level_x.super_task_1.UIAction;

import student_valerija_ionova.lesson_11.level_x.super_task_1.BookDatabase;

import java.util.Scanner;

public class DeleteByTitleUIAction implements  UIAction{

    BookDatabase bookDatabase;

    DeleteByTitleUIAction (BookDatabase bookDatabase){
        this.bookDatabase = bookDatabase;
    }


    @Override
    public void execute() {
        System.out.println("Please enter title to delete all books with this title");

        Scanner in = new Scanner(System.in);
        String title = in.nextLine();

        bookDatabase.deleteByTitle(title);
    }
}
