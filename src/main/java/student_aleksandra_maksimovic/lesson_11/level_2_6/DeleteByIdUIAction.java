package student_aleksandra_maksimovic.lesson_11.level_2_6;


import java.util.Scanner;

public class DeleteByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter id:");
        Long id = scanner.nextLong();

        boolean deleted = bookDatabase.delete(id);
        if (deleted) {
            System.out.println("Success!");
        } else {
            System.out.println("Failed!");
        }
    }
}


