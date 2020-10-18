package student_jaroslav_brutan.lesson_11.day2_6.UI_Actions;

import student_jaroslav_brutan.lesson_11.day2_6.Book;
import student_jaroslav_brutan.lesson_11.day2_6.BookDatabase;

import java.util.List;
import java.util.Scanner;

public class FindByAuthorUIAction implements UIAction{

    private student_jaroslav_brutan.lesson_11.day2_6.BookDatabase bookDatabase;

    public FindByAuthorUIAction(BookDatabase bookDatabase){
        this.bookDatabase = bookDatabase;
    }

    public void execute(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter author of the book: ");
        String author = scanner.nextLine();

        List<Book> authorBooks = bookDatabase.findByAuthor(author);
        if (authorBooks.size() > 0){
            System.out.println("Books of author " + author + " are : " + authorBooks);
        } else {
            System.out.println("There's no books by " + author + " author.");
        }
    }
}
