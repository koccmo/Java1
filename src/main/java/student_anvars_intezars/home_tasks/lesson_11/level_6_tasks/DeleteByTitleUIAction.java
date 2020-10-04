package student_anvars_intezars.home_tasks.lesson_11.level_6_tasks;

import java.util.Scanner;

class DeleteByTitleUIAction implements UIAction{

    private BookDataBase bookDataBase;

    public DeleteByTitleUIAction (BookDataBase bookDataBase) {
        this. bookDataBase = bookDataBase;
    }
    @Override
    public void execute() {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter Author of the book, which you want to delete: ");
        String title = in.next();
        System.out.println();

        bookDataBase.deleteByAuthor(title);
        System.out.println("Book is deleted");
    }
}
