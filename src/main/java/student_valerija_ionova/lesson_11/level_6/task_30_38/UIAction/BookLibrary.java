package student_valerija_ionova.lesson_11.level_6.task_30_38.UIAction;

//Task36

import student_valerija_ionova.lesson_11.level_6.task_30_38.BookDatabase;
import student_valerija_ionova.lesson_11.level_6.task_30_38.BookDatabaseImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class BookLibrary {

    private Map<Integer, UIAction> menuNumberToActionMap;

    public BookLibrary() {
        BookDatabase bookDatabase = new BookDatabaseImpl();

        menuNumberToActionMap = new HashMap();
        menuNumberToActionMap.put(1, new SaveBookUIAction(bookDatabase));
        menuNumberToActionMap.put(2, new FindUIAction(bookDatabase));
        menuNumberToActionMap.put(3, new DeleteByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(4, new DeleteByBookUIAction(bookDatabase));
        menuNumberToActionMap.put(5, new CountAllBooksUIAction(bookDatabase));
        menuNumberToActionMap.put(6, new DeleteByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(7, new DeleteByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(8, new FindUniqueAuthorsUIAction(bookDatabase));
        menuNumberToActionMap.put(9, new FindUniqueTitlesUIAction(bookDatabase));
        menuNumberToActionMap.put(10, new FindUniqueBooksUIAction(bookDatabase));
        menuNumberToActionMap.put(11, new ContainsUIAction(bookDatabase));
        menuNumberToActionMap.put(12, new GetAuthorToBooksMapUIAction(bookDatabase));
        menuNumberToActionMap.put(13, new GetEachAuthorsCountUIAction(bookDatabase));
        menuNumberToActionMap.put(14, new FindByIdUIAction(bookDatabase));
    }

    public void run() {

        while (true) {

            System.out.println("\nMenu\n" +
                    "1   Save book\n" +
                    "2   Find with search criteria\n" +
                    "3   Delete book by title\n" +
                    "4   Delete book by book\n" +
                    "5   Number of books in library\n" +
                    "6   Delete by author\n" +
                    "7   Delete by title\n" +
                    "8   Find unique authors\n" +
                    "9   Find unique titles\n" +
                    "10  Find unique books\n" +
                    "11  Check if entered book is in library\n" +
                    "12  Get books of all authors\n" +
                    "13  Get each author book count\n" +
                    "14  Find by ID\n" +
                    "0   Exit");

            Scanner sc = new Scanner(System.in);
            int userSelectedMenuNumber;

            while (true) {
                try {
                    System.out.println("Please enter menu number: ");
                    userSelectedMenuNumber = Integer.parseInt(sc.nextLine());
                    break;
                }catch (NumberFormatException e){
                    System.out.println("It's not valid number!");
                }
            }

            if (userSelectedMenuNumber == 0) {
                System.out.println("Thank you! Good by!");
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