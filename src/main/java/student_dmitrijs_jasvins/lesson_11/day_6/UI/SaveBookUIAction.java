package student_dmitrijs_jasvins.lesson_11.day_6.UI;

import student_dmitrijs_jasvins.lesson_11.day_6.Book;
import student_dmitrijs_jasvins.lesson_11.day_6.BookDatabase;

import java.util.Scanner;


public class SaveBookUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Author:");
        String author = scanner.nextLine();
        System.out.println("Enter Title!");
        String title = scanner.nextLine();

        Book book = new Book(author, title);
        bookDatabase.save(book);
    }
}
