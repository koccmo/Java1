package student_volodya_danilin.lesson_11.level_6;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

class FindByTitleUIAction implements UIAction{

    private BookDatabase bookDatabase;

    public FindByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter book's title : ");
        String title = sc.nextLine();

        List<Book> books = bookDatabase.findByTitle(title);

        if (!books.isEmpty()) {
            for (Book value : books) {
                value.printBookInfo();
            }
        }
        else {
            System.out.println("Book not found!");
        }
    }
}
