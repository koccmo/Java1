package student_jaroslav_brutan.lesson_11.day_1.task_5;

import java.util.ArrayList;
import java.util.List;

public class BookListContainsDemo {

    public static void main(String[] args) {

        Book book1 = new Book("Olga Kutuzova", "Finanses");
        Book book2 = new Book("Guntis Malders", "Revizija");
        Book book3 = new Book("N.V.Gogol", "Mertvie dushi");

        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        if (bookList.contains(book2)){
            System.out.println("Book list contains this book");
        } else {
            System.out.println("Book list does not contains this book");
        }
    }
}
