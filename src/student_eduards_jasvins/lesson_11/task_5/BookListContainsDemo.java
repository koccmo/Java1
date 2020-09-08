package student_eduards_jasvins.lesson_11.task_5;

import java.util.ArrayList;
import java.util.List;

class BookListContainsDemo {

    public static void main(String[] args) {
        Book book1 = new Book("J. K. Rowling", "Harry Potter and the Philosopher's Stone");
        Book book2 = new Book("J. K. Rowling", "Harry Potter and the Chamber of Secrets");
        Book book3 = new Book("J. K. Rowling", "Harry Potter and the Prisoner of Azkaban");

        List <Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        boolean result = books.contains(new Book("J. K. Rowling" , "Harry Potter and the Philosopher's Stone"));
        System.out.println(result);
    }
}
