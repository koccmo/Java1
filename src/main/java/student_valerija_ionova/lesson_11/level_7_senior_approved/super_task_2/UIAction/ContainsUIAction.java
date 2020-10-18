package student_valerija_ionova.lesson_11.level_7_senior_approved.super_task_2.UIAction;

import student_valerija_ionova.lesson_11.level_7_senior_approved.super_task_2.Book;
import student_valerija_ionova.lesson_11.level_7_senior_approved.super_task_2.BookDatabase;

import java.util.Scanner;

public class ContainsUIAction implements UIAction {

    BookDatabase bookDatabase;

    ContainsUIAction (BookDatabase bookDatabase){
        this.bookDatabase = bookDatabase;
    }


    @Override
    public void execute() {
        System.out.println("Please enter book to check if database contains it\n" +
                "Author:");
        Scanner in = new Scanner(System.in);
        String author = in.nextLine();

        System.out.println("Please enter title:");
        String title = in.nextLine();

        System.out.println("Please enter year of issue:");
        String year = in.nextLine();

        Book bookToFind = new Book(author, title, year);

        if (bookDatabase.contains(bookToFind)){
            System.out.println("Database contains this book");
        }else{
            System.out.println("Database doesn't contain this book");
        }
    }
}
