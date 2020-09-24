package student_jaroslav_brutan.lesson_11.day_6.all_tasks.UIActions;

import student_jaroslav_brutan.lesson_11.day_6.all_tasks.BookDatabase;

import java.util.Scanner;

public class DeleteByIdUIAction implements UIAction{

    private BookDatabase bookDatabase;

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter books id you want to delete:");
        Long id = scanner.nextLong();

        if (bookDatabase.delete(id)){
            System.out.println("Your book, with id - " + id + "is successfully deleted!");
        } else {
            System.out.println("There's no book with this id!");
        }
    }
}
