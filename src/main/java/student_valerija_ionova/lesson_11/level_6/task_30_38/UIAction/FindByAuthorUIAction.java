package student_valerija_ionova.lesson_11.level_6.task_30_38.UIAction;

import student_valerija_ionova.lesson_11.level_6.task_30_38.Book;
import student_valerija_ionova.lesson_11.level_6.task_30_38.BookDatabase;

import java.util.List;
import java.util.Scanner;

class FindByAuthorUIAction implements UIAction {

    BookDatabase bookDatabase;

    public FindByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }


    @Override
    public void execute() {
        System.out.println("Please enter author:");
        Scanner in = new Scanner(System.in);
        String author = in.nextLine();

        List<Book> listOfBooks = bookDatabase.findByAuthor(author);

        if (listOfBooks.size() > 0){
            System.out.println("Books of author " + author + ":\n" + listOfBooks);
        }else{
            System.out.println("No books by author: " + author + " in database");
        }

    }
}
