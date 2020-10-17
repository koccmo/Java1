package student_dmitrijs_jasvins.lesson_11.day_6.UI;

import student_dmitrijs_jasvins.lesson_11.day_6.BookDatabase;

import java.util.Scanner;


public class DeleteByAuthorUIAction implements UIAction {

    BookDatabase bookDatabase;

    public DeleteByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase; }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter author to delete book: ");
        String author = scanner.nextLine();
        bookDatabase.deleteByAuthor(author);

    }
}
