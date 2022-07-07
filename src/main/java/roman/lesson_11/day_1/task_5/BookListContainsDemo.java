package roman.lesson_11.day_1.task_5;

import java.util.ArrayList;
import java.util.List;

public class BookListContainsDemo {
    public static void main(String[] args) {
        Book garden = new Book("James", "Garden");

        List<Book> listOfBook = new ArrayList<>();
        listOfBook.add(garden);

        Book newGarden = new Book("James", "Garden");
        System.out.println("If list of book contain this book = " + listOfBook.contains(newGarden));
    }
}
