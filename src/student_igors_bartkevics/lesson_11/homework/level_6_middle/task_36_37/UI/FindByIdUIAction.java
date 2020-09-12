package student_igors_bartkevics.lesson_11.homework.level_6_middle.task_36_37.UI;

import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_36_37.Book;
import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_36_37.BookDatabase;
import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_36_37.UIAction;

import java.util.Optional;
import java.util.Scanner;

public class FindByIdUIAction implements UIAction {

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