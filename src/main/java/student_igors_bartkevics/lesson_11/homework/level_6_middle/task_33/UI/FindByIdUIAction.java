package student_igors_bartkevics.lesson_11.homework.level_6_middle.task_33.UI;

import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_33.Book;
import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_33.BookDatabase;
import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_33.UIAction;
import teacher.codereview.CodeReview;

import java.util.Optional;
import java.util.Scanner;

@CodeReview(approved = true)
class FindByIdUIAction implements UIAction {

    private final BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id of book");
        Long id = scanner.nextLong();
        Optional<Book> bookOpt = bookDatabase.findById(id);
        if (bookOpt.isPresent()) {
            System.out.println("Book with id = " + id + " is: " +
                                bookOpt.get().getAuthor() + " - " + bookOpt.get().getTitle());
        }
        else {
            System.out.println("Book with id = " + id + " not found");
        }
    }

}