package student_valerija_ionova.lesson_11.level_7_senior;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Paging {

    private int booksOnOnePage;
    private int pageNumber;
    private boolean pagingIndicated;

    public boolean getPagingIndicated(){
        return pagingIndicated;
    }

    List<Book> getCorrectPage(List <Book> books){
        List <Book> booksOnCorrectPage = new ArrayList<>();

        if (Math.ceil(books.size() / (double)booksOnOnePage) < pageNumber){
            return booksOnCorrectPage;
        }

        if (Math.floor((books.size() / (double)booksOnOnePage)) < pageNumber){
            booksOnCorrectPage = books;
            for (int i = (books.size()-2); i >=0; i--){
                booksOnCorrectPage.remove(i);
            }
            return booksOnCorrectPage;
        }

        booksOnCorrectPage = books.subList((pageNumber-1) * booksOnOnePage,
                ((pageNumber-1) * booksOnOnePage) + booksOnOnePage);
            return booksOnCorrectPage;
    }

    public void createPagingCriteria (){
        System.out.println("Please enter number of books on one page");
        this.booksOnOnePage = enterNumber();

        System.out.println("Please enter pages number to show");
        this.pageNumber = enterNumber();
        pagingIndicated = true;
    }

    private int enterNumber() {
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
            if (userSelectedNumber <0){
                System.out.println("It's not valid number");
                System.out.println("Please enter valid number:\n");
            }
        }while(userSelectedNumber <0);
        return userSelectedNumber;
    }

}
