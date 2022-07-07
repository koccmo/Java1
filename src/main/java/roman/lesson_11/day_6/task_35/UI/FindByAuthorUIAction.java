package roman.lesson_11.day_6.task_35.UI;




import roman.lesson_11.day_6.task_35.AuthorSearchCriteria;
import roman.lesson_11.day_6.task_35.Book;
import roman.lesson_11.day_6.task_35.BookDatabase;
import roman.lesson_11.day_6.task_35.UIAction;

import java.util.List;
import java.util.Scanner;

public class FindByAuthorUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    private String getAuthorFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Author of books : ");
        String author = scanner.nextLine();
        return author;
    }

    @Override
    public void execute() {
        String author = getAuthorFromUser();
        List<Book> listOfBookWithSameAuthor = bookDatabase.find(new AuthorSearchCriteria(author));
        if (listOfBookWithSameAuthor.size() == 0) {
            System.out.println("With this author - " + author + " Book not found!");
        } else {
            System.out.println("Books by " + author + " :");
            for (Book book : listOfBookWithSameAuthor) {
                System.out.println(book.getTitle());
            }
        }
    }
}
