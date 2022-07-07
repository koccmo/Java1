package roman.lesson_10.day_6.task_17;

public interface BookReader {
    boolean addBook(Book bookToAdd);
    boolean removeBook(Book bookToRemove);
    String[] libraryBooksToStringList();
}
