package student_volodya_danilin.lesson_11.level_6;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FindByAuthorUIAction implements UIAction{

    private BookDatabase bookDatabase;

    public FindByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter book's author : ");
        String author = sc.nextLine();

        List<Book> books = bookDatabase.findByAuthor(author);

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
