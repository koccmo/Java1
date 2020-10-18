package student_anvars_intezars.home_tasks.lesson_11.level_6_tasks;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

class FindByAuthorUIAction implements UIAction {

    private BookDataBase bookDataBase;

    public FindByAuthorUIAction(BookDataBase bookDatabase) {
        this.bookDataBase = bookDatabase;
    }


    @Override
    public void execute() {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter Author of the book: ");
        String author = in.next();
        System.out.println();

        List<Book> bookByAuthor = bookDataBase.findByAuthor(author);
        if (!bookByAuthor.isEmpty()) {
            System.out.println(bookByAuthor.toString());
        }
    }
}
