package student_jaroslav_brutan.lesson_11.day2_6.UI_Actions_approved;

import java.util.Scanner;

public class DeleteByTitleUIAction implements UIAction{

    private BookDatabase bookDatabase;

    public DeleteByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter title of the book you want to remove from library");
        String title = scanner.nextLine();
        if (bookDatabase.findByTitle(title).size() == 0){
            System.out.println("Your book is not in the library!");
        } else {
            System.out.println("Your book was deleted from library!");
        }
    }
}
