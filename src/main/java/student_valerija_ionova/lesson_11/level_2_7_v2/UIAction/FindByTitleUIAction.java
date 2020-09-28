package student_valerija_ionova.lesson_11.level_2_7_v2.UIAction;

//Task34

import student_valerija_ionova.lesson_11.level_7_senior.super_task_2.Book;
import student_valerija_ionova.lesson_11.level_7_senior.super_task_2.BookDatabase;
import teacher.codereview.CodeReview;

import java.util.List;
import java.util.Scanner;

@CodeReview(approved = true)
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
