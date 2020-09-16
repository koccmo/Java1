package student_jaroslav_brutan.lesson_10.day_6;

import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public interface BookReader {

    boolean addBook(Book book);

    boolean deleteBook(Book book);

    String[] allLibraryBooks ();

    List<Book> findBookByAuthor(String Author);

}
