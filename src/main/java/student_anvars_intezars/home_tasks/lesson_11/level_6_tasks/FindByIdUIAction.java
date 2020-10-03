package student_anvars_intezars.home_tasks.lesson_11.level_6_tasks;

import java.util.Optional;
import java.util.Scanner;

class FindByIdUIAction implements UIAction{

    private BookDataBase bookDatabase;

    public FindByIdUIAction(BookDataBase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }


    @Override
    public void execute() {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter ID of the book: ");
        Long id = in.nextLong();
        System.out.println();

        Optional<Book> bookOpt = bookDatabase.findById(id);
        if (bookOpt.isPresent()) {
            System.out.println(bookOpt);
        }
    }
}
