package student_igors_bartkevics.lesson_11.homework.level_1_intern.task_5;

import java.util.ArrayList;
import java.util.List;

class BookListContainsDemo {

    public static void main(String[] args) {
        Book book2 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        Book book3 = new Book("", "The Pragmatic Programmer. From Journeyman to Master");

        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Bates B., Sierra K.", "Head First Java"));
        bookList.add(new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship"));

        isBookInTheList(book2, bookList);

        isBookInTheList(book3, bookList);
    }

    static void isBookInTheList(Book book, List<Book> list) {
        if (list.contains(book)) {
            System.out.println("List contains book");
        }
        else {
            System.out.println("List does not contain book");
        }
    }

}
