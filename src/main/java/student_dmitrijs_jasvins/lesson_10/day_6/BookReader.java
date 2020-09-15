package student_dmitrijs_jasvins.lesson_10.day_6;

import java.util.List;

public interface BookReader {

    boolean addBook(Book book);

    boolean removeBook(Book book);

    boolean MarkBookAsAlreadyRead(Book book);

    boolean MarkBookAsNotRead(Book book);

    String[] listOfAllBooks();

    String[] listOfAllReadBooks();

    String[] listOfAllNotReadBooks();

    List<Book> listByAuthorOrContainsPartOfAuthorName(String author);

    List<Book> listByTitleOrContainsPartOfTitle(String title);
}
