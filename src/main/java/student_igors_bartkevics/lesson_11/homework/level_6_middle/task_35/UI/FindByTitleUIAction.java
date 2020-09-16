package student_igors_bartkevics.lesson_11.homework.level_6_middle.task_35.UI;

import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_35.Book;
import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_35.BookDatabase;
import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_35.UIAction;
import teacher.codereview.CodeReview;

import java.util.List;
import java.util.Scanner;

@CodeReview(approved = true)
class FindByTitleUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter title of the book");
        String title = scanner.nextLine();
        List<Book> booksWithTitle = bookDatabase.findByTitle(title);
        if (booksWithTitle.size() == 0) {
            System.out.println("Books with title: '" + title + "' not found");
        }
        else {
            System.out.println("Books with title '" + title + "' :");
            for (Book book : booksWithTitle) {
                System.out.println(book.getAuthor() + " - " + book.getTitle());
            }
        }
    }
}
