package student_valerija_ionova.lesson_11.level_2_7_v2.UIAction;

//Task32 Создайте и реализуйте класс FindByIdUIAction:

import student_valerija_ionova.lesson_11.level_7_senior_approved.super_task_2.Book;
import student_valerija_ionova.lesson_11.level_7_senior_approved.super_task_2.BookDatabase;
import teacher.codereview.CodeReview;

import java.util.Optional;
import java.util.Scanner;

@CodeReview(approved = true)
class FindByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        System.out.println("Please enter book's id to find book: ");
        Scanner in = new Scanner(System.in);
        Long id = in.nextLong();

        Optional<Book> bookOpt = bookDatabase.findById(id);

        if (bookOpt.isPresent()){
            Book foundedBook = bookOpt.get();
            System.out.println("Book has been founded: \n" + foundedBook);
        }else{
            System.out.println("No book with id: " + id);
        }
    }

}