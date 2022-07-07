package roman.lesson_10.day_6.task_23;

import java.util.List;

public interface BookReader {
    boolean addBook(Book bookToAdd);
    boolean removeBook(Book bookToRemove);
    String[] libraryBooksToStringList();
    List<Book> getListFromBookReaderWithSameAuthor(String bookAuthor);
    List<Book> getListFromBookReaderWithSameTitle(String bookTitle);
    boolean markBookAsRead(Book book);
    boolean markBooKAsNotRead(Book book);
}
