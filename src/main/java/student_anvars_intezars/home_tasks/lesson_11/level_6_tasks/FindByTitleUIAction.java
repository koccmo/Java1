package student_anvars_intezars.home_tasks.lesson_11.level_6_tasks;

import java.util.List;
import java.util.Scanner;

class FindByTitleUIAction implements UIAction {

    private BookDataBase bookDataBase;

    public FindByTitleUIAction(BookDataBase bookDatabase) {
        this.bookDataBase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter Title of the book: ");
        String title = in.next();
        System.out.println();

        List<Book> bookByTitle = bookDataBase.findByTitle(title);
        System.out.println(bookByTitle);
    }
}
