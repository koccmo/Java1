package student_valerija_ionova.lesson_11.level_6.task_30_38.UIAction;

import student_valerija_ionova.lesson_11.level_6.task_30_38.Book;
import student_valerija_ionova.lesson_11.level_6.task_30_38.BookDatabase;

import java.util.Scanner;

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
