package student_jaroslav_brutan.lesson_11.day2_6.UI_Actions_approved;

import student_jaroslav_brutan.lesson_11.day2_6.Book;
import student_jaroslav_brutan.lesson_11.day2_6.BookDatabase;

import java.util.List;
import java.util.Scanner;

public class FindByTitleUIAction implements UIAction{

    private student_jaroslav_brutan.lesson_11.day2_6.BookDatabase bookDatabase;

    public FindByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your book title: ");
        String title = scanner.nextLine();

        List<Book> titleBooks = bookDatabase.findByTitle(title);
        if (titleBooks.size() > 0){
            System.out.println("Books with title " + title + " are " + titleBooks);
        } else {
            System.out.println("There's no books with " + title + "title.");
        }
    }
}
