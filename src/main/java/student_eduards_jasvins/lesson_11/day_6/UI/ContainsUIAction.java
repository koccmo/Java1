package student_eduards_jasvins.lesson_11.day_6.UI;

import student_eduards_jasvins.lesson_11.day_6.Book;
import student_eduards_jasvins.lesson_11.day_6.BookDatabase;

import java.util.Scanner;

public class ContainsUIAction implements UIAction {

    BookDatabase bookDatabase;

    public ContainsUIAction(BookDatabase bookDatabase) { this.bookDatabase = bookDatabase; }


    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book to check if contains database: \n" + "Author:");
        String author = scanner.nextLine();

        System.out.println("Enter title!");
        String title = scanner.nextLine();

        System.out.println("Enter year!");
        String year = scanner.nextLine();

        Book bookFind = new Book(author, title, year);

        if (bookDatabase.contains(bookFind)) {
            System.out.println("Database contains this book!");
        } else  {
            System.out.println("Database doesn't contains this book!");
        }
    }
}
