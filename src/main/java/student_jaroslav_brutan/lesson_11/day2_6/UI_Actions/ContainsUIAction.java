package student_jaroslav_brutan.lesson_11.day2_6.UI_Actions;

import java.util.Scanner;

public class ContainsUIAction implements UIAction{

    private student_jaroslav_brutan.lesson_11.day2_6.UI_Actions.BookDatabase bookDatabase;

    public ContainsUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the author of the book");
        String author = scanner.nextLine();
        System.out.println("Enter the title of the book");
        String title = scanner.nextLine();
        Book book = new Book(author, title);
        boolean contains = bookDatabase.contains(book);
    }
}
