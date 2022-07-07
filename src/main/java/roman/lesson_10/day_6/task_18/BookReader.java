package roman.lesson_10.day_6.task_18;


import java.util.List;

public interface BookReader {
    boolean addBook(Book bookToAdd);
    boolean removeBook(Book bookToRemove);
    String[] libraryBooksToStringList();
    List<Book> findBookBuyAuthor(String bookAuthor);
}
