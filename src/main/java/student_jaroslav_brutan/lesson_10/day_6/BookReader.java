package student_jaroslav_brutan.lesson_10.day_6;

import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public interface BookReader {

    boolean addBook(Book book);

    boolean deleteBook(Book book);

    String[] allLibraryBooks();

    List<Book> findBookByAuthor(String Author);

    List<Book> findBookByTitle(String Tile);

    boolean isRead(Book book);

    boolean isNotRead(Book book);

    String[] allReadBooks();

    String[] allNotReadBooks();
}
