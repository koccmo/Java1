package student_aleksandra_maksimovic.lesson_11.level_2_6;

import java.util.Scanner;

class SaveBookUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter author:");
        String author = scanner.nextLine();

        System.out.println("Please enter title:");
        String title = scanner.nextLine();

        Book book = new Book(author, title);

        this.bookDatabase.save(book);
    }

}
