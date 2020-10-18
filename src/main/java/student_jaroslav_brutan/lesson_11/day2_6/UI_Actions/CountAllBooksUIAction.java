package student_jaroslav_brutan.lesson_11.day2_6.UI_Actions;

public class CountAllBooksUIAction implements UIAction{

    private BookDatabase bookDatabase;

    public CountAllBooksUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute(){
        System.out.println("There are " + bookDatabase.countAllBooks() + " books in the library!");
    }
}
