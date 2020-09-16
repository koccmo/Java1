package student_igors_bartkevics.lesson_11.homework.level_6_middle.task_38_approved;

import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_38_approved.UI.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class BookLibrary {

        private Map<Integer, UIAction> menuNumberToActionMap = new HashMap<>();

        public BookLibrary() {
                BookDatabase bookDatabase = new BookDatabaseImpl();

                menuNumberToActionMap.put(1, new SaveBookUIAction(bookDatabase));
                menuNumberToActionMap.put(2, new FindByIdUIAction(bookDatabase));
                menuNumberToActionMap.put(3, new FindByAuthorUIAction(bookDatabase));
                menuNumberToActionMap.put(4, new FindByTitleUIAction(bookDatabase));
                menuNumberToActionMap.put(5, new DeleteByIdUIAction(bookDatabase));
                menuNumberToActionMap.put(6, new DeleteByBookUIAction(bookDatabase));
                menuNumberToActionMap.put(7, new CountAllBooksUIAction(bookDatabase));
                menuNumberToActionMap.put(8, new DeleteByAuthorUIAction(bookDatabase));
                menuNumberToActionMap.put(9, new DeleteByTitleUIAction(bookDatabase));
                menuNumberToActionMap.put(10, new FindUniqueAuthorsUIAction(bookDatabase));
                menuNumberToActionMap.put(11, new FindUniqueTitlesUIAction(bookDatabase));
                menuNumberToActionMap.put(12, new FindUniqueBooksUIAction(bookDatabase));
                menuNumberToActionMap.put(13, new ContainsUIAction(bookDatabase));
                menuNumberToActionMap.put(14, new GetAuthorToBooksMapUIAction(bookDatabase));
                menuNumberToActionMap.put(15, new GetEachAuthorBookCountUIAction(bookDatabase));
        }

        public void run() {
                Scanner sc = new Scanner(System.in);

                while (true) {
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
