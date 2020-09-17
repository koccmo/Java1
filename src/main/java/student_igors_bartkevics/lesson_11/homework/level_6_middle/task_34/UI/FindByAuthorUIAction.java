package student_igors_bartkevics.lesson_11.homework.level_6_middle.task_34.UI;

import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_34.Book;
import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_34.BookDatabase;
import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_34.UIAction;
import teacher.codereview.CodeReview;

import java.util.List;
import java.util.Scanner;

@CodeReview(approved = true)
class FindByAuthorUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter author");
        String author = scanner.nextLine();
        List<Book> booksByAuthor = bookDatabase.findByAuthor(author);
        if (booksByAuthor.size() == 0) {
            System.out.println("Books by author: '" + author + "' not found");
        }
        else {
            System.out.println("Books by " + author + " :");
            for (Book book : booksByAuthor) {
                System.out.println(book.getTitle());
            }
        }
    }
}
