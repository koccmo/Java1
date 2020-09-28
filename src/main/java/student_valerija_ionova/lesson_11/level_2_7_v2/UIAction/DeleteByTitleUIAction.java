package student_valerija_ionova.lesson_11.level_2_7_v2.UIAction;

import student_valerija_ionova.lesson_11.level_7_senior.super_task_2.BookDatabase;
import teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class DeleteByTitleUIAction implements UIAction {

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
