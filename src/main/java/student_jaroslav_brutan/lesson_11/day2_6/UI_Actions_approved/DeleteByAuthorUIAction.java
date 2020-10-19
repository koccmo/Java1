package student_jaroslav_brutan.lesson_11.day2_6.UI_Actions_approved;

import java.util.Scanner;

public class DeleteByAuthorUIAction implements UIAction{

    private BookDatabase bookDatabase;

    public DeleteByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which author books you want to remove from library?");
        String author = scanner.nextLine();
        if (bookDatabase.findByAuthor(author).size() == 0){
            System.out.println("Books with " + author + " is not found in the library!");
        } else {
            bookDatabase.deleteByAuthor(author);
            System.out.println("Books with " + author + " author were deleted from library!");
        }
    }
}

