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
        menuNumberToActionMap.put(2, new FindByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(3, new FindByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(4, new FindByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(5, new DeleteByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(6, new DeleteByBookUIAction(bookDatabase));
        menuNumberToActionMap.put(7, new CountAllBooksUIAction(bookDatabase));
        menuNumberToActionMap.put(8, new DeleteByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(9, new DeleteByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(10, new FindUniqueAuthorsUIAction(bookDatabase));
        menuNumberToActionMap.put(11, new FindUniqueTitlesUIAction(bookDatabase));
        menuNumberToActionMap.put(12, new FindUniqueBooksUIAction(bookDatabase));
        menuNumberToActionMap.put(13, new ContainsUIAction(bookDatabase));
        menuNumberToActionMap.put(14, new GetAuthorToBooksMapUIAction(bookDatabase));
        menuNumberToActionMap.put(15, new GetEachAuthorsCountUIAction(bookDatabase));
    }

    public void run() {

        while (true) {

            System.out.println("\nMenu\n" +
                    "1   Save book\n" +
                    "2   Find book by id\n" +
                    "3   Find book by author\n" +
                    "4   Find book by title\n" +
                    "5   Delete book by title\n" +
                    "6   Delete book by book\n" +
                    "7   Number of books in library\n" +
                    "8   Delete by author\n" +
                    "9   Delete by title\n" +
                    "10  Find unique authors\n" +
                    "11  Find unique titles\n" +
                    "12  Find unique books\n" +
                    "13  Check if entered book is in library\n" +
                    "14  Get books of all authors\n" +
                    "15  Get each author book count\n"+
                    "0   Exit");

            Scanner sc = new Scanner(System.in);

            System.out.println("Please enter menu number: ");
            int userSelectedMenuNumber = Integer.parseInt(sc.nextLine());
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