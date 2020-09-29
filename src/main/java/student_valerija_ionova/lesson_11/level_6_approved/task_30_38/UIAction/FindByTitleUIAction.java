package student_valerija_ionova.lesson_11.level_6_approved.task_30_38.UIAction;

//Task34

import student_valerija_ionova.lesson_11.level_6_approved.task_30_38.Book;
import student_valerija_ionova.lesson_11.level_6_approved.task_30_38.BookDatabase;

import java.util.List;
import java.util.Scanner;

class FindByTitleUIAction implements UIAction {

    BookDatabase bookDatabase;

    FindByTitleUIAction (BookDatabase bookDatabase){
        this.bookDatabase = bookDatabase;
    }


    @Override
    public void execute() {
        System.out.println("Please enter Title:");
        Scanner in = new Scanner(System.in);
        String title = in.nextLine();

        List<Book> listOfBooks = bookDatabase.findByTitle(title);

        if (listOfBooks.size() > 0){
            System.out.println("Books with title " + title + ":\n" + listOfBooks);
        }else{
            System.out.println("No books with title: " + title + " in database");
        }

    }
}
