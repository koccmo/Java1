package student_valerija_ionova.lesson_11.level_1.task_5;

import java.util.ArrayList;
import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class BookListContainsDemo {

    public static void main (String [] args) {

        List<Book> library = new ArrayList<>();

        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        Book book3 = new Book("Author3", "Title3");
        Book book4 = new Book("Author4", "Title4");
        Book book5 = new Book("Author5", "Title5");

        library.add(book1);
        library.add(book2);
        library.add(book3);
        library.add(book4);
        library.add(book5);

        Book bookToFind1 = new Book("Author5", "Title5");
        Book bookToFind2 = new Book("Author9", "Title9");

        System.out.println("If is bookToFind1 in library: " + library.contains(bookToFind1));
        System.out.println("If is bookToFind2 in library: " + library.contains(bookToFind2));

    }
}
