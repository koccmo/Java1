package roman.lesson_10.day_6.task_22;

import java.util.List;

public interface BookReader {
    boolean addBook(Book bookToAdd);
    boolean removeBook(Book bokToRemove);
    String[] libraryBooksToStringList();
    List<Book> getListFromBookReaderWithSameAuthor(String bookAuthor);
    List<Book> getListFromBookReaderWithSameTitle(String bookTitle);
    boolean markBookBeenRead(Book book);
}
