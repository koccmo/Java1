package student_jaroslav_brutan.lesson_11.day2_6.UI_Actions;
import java.util.Scanner;

public class DeleteByBookUIAction implements UIAction{

    private BookDatabase bookDatabase;

    public DeleteByBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("If you sure you want to delete book from library - ");
        System.out.println("Enter book author");
        String author = scanner.nextLine();
        System.out.println("Enter book title");
        String title = scanner.nextLine();
        if (bookDatabase.delete(new Book(author, title))){
            System.out.println("Your book was deleted from library!");
        } else {
            System.out.println("Your book was not found in the library!");
        }
    }
}
