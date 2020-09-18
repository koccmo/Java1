package student_volodya_danilin.lesson_11.level_6;

import java.util.Scanner;

class SaveBookUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter book's author : ");
        String author = sc.nextLine();

        System.out.print("Enter book's title : ");
        String title = sc.nextLine();

        System.out.println("Enter year of issue : ");
        String year = sc.nextLine();

        Book book = new Book(author, title, year);
        bookDatabase.save(book);
    }

}
