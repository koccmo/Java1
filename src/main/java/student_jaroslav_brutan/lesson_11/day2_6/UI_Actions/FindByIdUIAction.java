package student_jaroslav_brutan.lesson_11.day2_6.UI_Actions;

import student_jaroslav_brutan.lesson_11.day2_6.Book;
import student_jaroslav_brutan.lesson_11.day2_6.BookDatabase;

import java.util.Optional;
import java.util.Scanner;

public class FindByIdUIAction implements UIAction{

    private student_jaroslav_brutan.lesson_11.day2_6.BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase){
        this.bookDatabase = bookDatabase;
    }

    public void execute(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your books id number:");
        Long id = scanner.nextLong();

        Optional<student_jaroslav_brutan.lesson_11.day2_6.Book> bookOpt = bookDatabase.findById(id);
        if (bookOpt.isPresent()){
            Book yourFoundedBook = bookOpt.get();
            System.out.println("We found your book " + yourFoundedBook);
        } else {
            System.out.println("We can't find your book with this id " + id);
        }
    }
}
