package student_jaroslav_brutan.lesson_10.day_5.task_14;

public interface BookReader {

    boolean addBook(Book book);

    boolean deleteBook(Book book);

    void listOfAllBooks();

    Book findBookByTitle(String title);

    Book findBookByAuthor(String author);

    boolean isFinishedBook(Book finishedBook);


}
