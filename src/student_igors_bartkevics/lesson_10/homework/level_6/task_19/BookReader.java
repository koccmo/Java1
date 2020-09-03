package student_igors_bartkevics.lesson_10.homework.level_6.task_19;

import java.util.List;

interface BookReader {

    boolean addBook(Book book);

    boolean removeBook(Book book);

    String[] bookLibraryToStringList();

    List<Book> findBooksByAuthor(String author);

    List<Book> findBooksWhichAuthorStartsWithString(String string);

}
