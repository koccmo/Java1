package student_anvars_intezars.home_tasks.lesson_11.level_6_tasks;

import java.util.List;
import java.util.Scanner;

class DeleteByIdUIAction implements UIAction {

    private BookDataBase bookDataBase;

    public DeleteByIdUIAction(BookDataBase bookDataBase) {
        this.bookDataBase = bookDataBase;
    }

    @Override
    public void execute() {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter ID of the book, which you want to delete: ");
        Long id = in.nextLong();
        System.out.println();

        boolean bookToDelete = bookDataBase.delete(id);
        if (bookToDelete) {
            System.out.println("Book is deleted");
        }
    }
}
