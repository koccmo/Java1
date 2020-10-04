package student_anvars_intezars.home_tasks.lesson_11.level_6_tasks;

import java.util.Scanner;

class SaveBookUIAction implements UIAction {

    private BookDataBase bookDataBase;

    public SaveBookUIAction(BookDataBase bookDatabase) {
        this.bookDataBase = bookDatabase;
    }


    @Override
    public void execute() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter all the information about the book:");
        System.out.println();

        System.out.println("Enter Author");
        String author = in.nextLine();
        System.out.println();

        System.out.println("Enter Title");
        String title = in.nextLine();
        System.out.println();

        System.out.println("Enter Year of Issue");
        String yearOfIssue = in.next();
        System.out.println();

        Book firstBook = new Book(author,title,yearOfIssue);
        bookDataBase.save(firstBook);

    }
}
