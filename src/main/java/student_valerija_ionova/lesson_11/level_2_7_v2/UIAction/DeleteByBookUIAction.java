package student_valerija_ionova.lesson_11.level_2_7_v2.UIAction;

import student_valerija_ionova.lesson_11.level_7_senior_approved.super_task_2.Book;
import student_valerija_ionova.lesson_11.level_7_senior_approved.super_task_2.BookDatabase;
import teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class DeleteByBookUIAction implements UIAction {

    BookDatabase bookDatabase;

    DeleteByBookUIAction (BookDatabase bookDatabase){
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println("Please enter information about book which you want to delete:\n" +
                "Title:");
        Scanner in = new Scanner(System.in);
        String title = in.nextLine();

        System.out.println("Please enter author:");
        String author = in.nextLine();

        System.out.println("Please enter yearOfIssue");
        String year = in.nextLine();

        Book bookToDelete = new Book(author, title, year);

        if (bookDatabase.delete(bookToDelete)){
            System.out.println("Book was deleted");
        }else{
            System.out.println("We don't have this book in database");
        }
        bookDatabase.delete(bookToDelete);
    }
}
