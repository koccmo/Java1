package student_valerija_ionova.lesson_11.level_7_senior.super_task_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SortingAlgoritm {

    private SortCriteria sortCriteria = SortCriteria.ASCENDING;
    private String sortField = "title";

    public void createSortCriteria(){
        System.out.println("Please choose sorting order\n" +
                "1  Ascending\n" +
                "2  Descending\n");
        int order = enterNumber(1,2);

        if (order == 1){
            sortCriteria = SortCriteria.ASCENDING;
        }else{
            sortCriteria = SortCriteria.DESCENDING;
        }

        System.out.println("Please choose field to sort by\n" +
                "1  Author\n" +
                "2  Title\n" +
                "3  Year\n");

        int field = enterNumber(1, 3);

        if (field == 1){
            sortField = "author";
        }else if (field == 2){
            sortField = "title";
        }else{
            sortField = "year";
        }
    }

    public List <Book> sortList (List<Book> bookToSort){
        List <Book> sortedBooks = new ArrayList<>();

        switch (sortField){
            case "title" : {bookToSort.sort(Comparator.comparing(Book::getTitle)); break;}
            case "author" : {bookToSort.sort(Comparator.comparing(Book::getAuthor)); break;}
            case "year" : {bookToSort.sort(Comparator.comparing(Book::getYearOfIssue)); break;}
        }

        if (sortCriteria == SortCriteria.ASCENDING){
            return bookToSort;
        }

        if (sortCriteria == SortCriteria.DESCENDING){
            for (int i = bookToSort.size()-1; i >=0 ; i--){
                sortedBooks.add(bookToSort.get(i));
            }
        }
        return sortedBooks;
    }

    private int enterNumber(int start, int stop) {
        Scanner sc = new Scanner(System.in);
        int userSelectedNumber;
        do{
            while (true) {
                try {
                    userSelectedNumber = Integer.parseInt(sc.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("It's not number!");
                    System.out.println("Please enter number:\n");
                }
            }
            if ((userSelectedNumber < start) || (userSelectedNumber > stop)){
                System.out.println("It's not valid number");
                System.out.println("Please enter valid number:\n");
            }
        }while((userSelectedNumber < start) || (userSelectedNumber > stop));
        return userSelectedNumber;
    }

}
