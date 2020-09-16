package student_aleksandra_maksimovic.lesson_11.level_1.task_5;

import java.util.ArrayList;
import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class BookListContainsDemo {
    public static void main(String[] args) {

        Book book1 = new Book("Эмили Бронте", "Грозовой Перевал");
        Book book2 = new Book("Габриэль Гарсиа Маркес","Сто лет одиночества");
        Book book3 = new Book("Корней Чуковский", "Тараканище");

        List<Book> bookList = new ArrayList<>();

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        boolean result = bookList.contains(new Book("Габриэль Гарсиа Маркес","Сто лет одиночества"));
        System.out.println(result);
    }
}
