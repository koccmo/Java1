package student_roberts_kupcs.lesson_11.homework.level_1_intern.Task_5;

import java.util.ArrayList;

class BookListContainsDemo {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Jack", "Java"));
        books.add(new Book("James", "Guru"));
        books.add(new Book("Jon", "JavaGuru"));

        System.out.println(books.contains("Java"));

    }
}
