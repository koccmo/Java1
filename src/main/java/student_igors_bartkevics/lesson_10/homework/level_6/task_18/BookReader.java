package student_igors_bartkevics.lesson_10.homework.level_6.task_18;

import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
interface BookReader {

    boolean addBook(Book book);

    boolean removeBook(Book book);

    String[] bookLibraryToStringList();

    List<Book> findBooksByAuthor(String author);

}
