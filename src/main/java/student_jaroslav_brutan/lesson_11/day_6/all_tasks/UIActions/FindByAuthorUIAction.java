package student_jaroslav_brutan.lesson_11.day_6.all_tasks.UIActions;

import student_jaroslav_brutan.lesson_11.day_5.all_tasks.Book;
import student_jaroslav_brutan.lesson_11.day_6.all_tasks.BookDatabase;

import java.util.List;
import java.util.Scanner;

public class FindByAuthorUIAction implements UIAction{

    private BookDatabase bookDatabase;

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
