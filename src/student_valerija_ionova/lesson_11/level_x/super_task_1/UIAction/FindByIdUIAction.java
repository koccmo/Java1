package student_valerija_ionova.lesson_11.level_x.super_task_1.UIAction;

//Task32 Создайте и реализуйте класс FindByIdUIAction:

import student_valerija_ionova.lesson_11.level_x.super_task_1.Book;
import student_valerija_ionova.lesson_11.level_x.super_task_1.BookDatabase;

import java.util.Optional;
import java.util.Scanner;

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
            System.out.println("Book has been finded: \n" + foundedBook);
        }else{
            System.out.println("No book with id: " + id);
        }
    }

}