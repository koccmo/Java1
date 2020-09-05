package student_valerija_ionova.lesson_11.level_6.task_30_38.UIAction;

import student_valerija_ionova.lesson_11.level_6.task_30_38.BookDatabase;

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
