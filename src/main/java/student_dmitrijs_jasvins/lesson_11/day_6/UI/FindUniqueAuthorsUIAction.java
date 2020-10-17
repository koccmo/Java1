package student_dmitrijs_jasvins.lesson_11.day_6.UI;

import student_dmitrijs_jasvins.lesson_11.day_6.BookDatabase;


public class FindUniqueAuthorsUIAction implements UIAction {

    BookDatabase bookDatabase;

    public FindUniqueAuthorsUIAction(BookDatabase bookDatabase) { this.bookDatabase = bookDatabase; }

    @Override
    public void execute() {
        System.out.println("In database are following authors book: " + bookDatabase.findUniqueAuthors());
    }
}
