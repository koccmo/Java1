package student_dmitrijs_jasvins.lesson_11.day_6_approved.UI;

import student_dmitrijs_jasvins.lesson_11.day_6_approved.BookDatabase;
import student_dmitrijs_jasvins.lesson_11.day_6_approved.BookDatabaseImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class BookLibrary {

    private Map<Integer, UIAction> menuNumberToActionMap;

    public BookLibrary() {
        BookDatabase bookDatabase = new BookDatabaseImpl();

        menuNumberToActionMap = new HashMap<>();
        menuNumberToActionMap.put(1, new SaveBookUIAction(bookDatabase));
        menuNumberToActionMap.put(2, new FindByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(3, new FindByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(4, new FindByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(5, new FindUniqueAuthorsUIAction(bookDatabase));
        menuNumberToActionMap.put(6, new FindUniqueBooksUIAction(bookDatabase));
        menuNumberToActionMap.put(7, new FindUniqueTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(8, new DeleteByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(9, new DeleteByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(10, new DeleteByBookUIAction(bookDatabase));
        menuNumberToActionMap.put(11, new DeleteByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(12, new ContainsUIAction(bookDatabase));
        menuNumberToActionMap.put(13, new GetAuthorToBooksMapUIAction(bookDatabase));
        menuNumberToActionMap.put(14, new GetEachAuthorsCountUIAction(bookDatabase));
    }

    public void run() {

        while (true) {
            System.out.println("Hi! Welcome to library! Check options what can you use and select number:\n" +
            "1. Save book.\n" +
            "2. Find book by ID.\n" +
            "3. Find book by Author.\n" +
            "4. Find book by Title.\n" +
            "5. Find book by unique Authors.\n" +
            "6. Find book by unique Books.\n" +
            "7. Find book by unique Titles.\n" +
            "8. Delete book by Title.\n" +
            "9. Delete book by Author.\n" +
            "10. Delete book by Book.\n" +
            "11. Delete book by ID.\n" +
            "12. Check this book in library.\n" +
            "13. Get all books by this Author.\n" +
            "14. Get each author book count.\n" +
            "0. Exit.\n");

            Scanner sc = new Scanner(System.in);
            int userSelectedMenuNumber;

            while (true) {
                try {
                    System.out.println("Enter number please: ");
                    userSelectedMenuNumber = Integer.parseInt(sc.nextLine());
                    break;
                } catch (NumberFormatException exception) {
                    System.out.println("It's not valid number!");
                }
            }

            if (userSelectedMenuNumber == 0) {
                System.out.println("Thank you! Good bye!");
                break;
            } else {
                executeUIAction(userSelectedMenuNumber);
            }
        }
    }

    private void executeUIAction(int userSelectedMenuNumber) {
        UIAction uiAction = menuNumberToActionMap.get(userSelectedMenuNumber);
        if (uiAction != null) {
            uiAction.execute();
        } else {
            System.out.println("Menu item not exist: " + userSelectedMenuNumber);
        }
    }
}
