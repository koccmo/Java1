package student_valerija_ionova.lesson_10.level_6.refactoring_methods_mot_more_than_3_strings;

import java.util.List;

interface BookReader {

    List<Book> getBookDatabase();

    boolean addBook (Book book);

    boolean deleteBook (Book book);

    String [] getArrayOfBooks ();

    List <Book> findBookByAuthor(String author);

    List <Book> findBookByTitle (String title);

    boolean markAsRead (Book book);

    boolean markAsNotRead (Book book);

    String [] getArrayOfReadBooks ();

    String [] getArrayOfNotReadBooks ();
}
