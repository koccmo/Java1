package student_eduards_jasvins.lesson_11.day_6.UI;

import student_eduards_jasvins.lesson_11.day_6.BookDatabase;



public class GetAuthorToBooksMapUIAction implements UIAction {

    BookDatabase bookDatabase;

    public GetAuthorToBooksMapUIAction(BookDatabase bookDatabase) { this.bookDatabase = bookDatabase; }

    @Override
    public void execute() {
        System.out.println("See books of each author: " + bookDatabase.getAuthorToBooksMap());
    }
}
