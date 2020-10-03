package student_aleksandra_maksimovic.lesson_11.level_2_6;

public class CountAllBooksUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public CountAllBooksUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        System.out.println("Library contains " + this.bookDatabase.countAllBooks() + " books");
    }
}