package student_eduards_jasvins.lesson_10.day_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
interface BookReader {

    boolean addBook(Book book, BookLibrary library);

    boolean deleteBook(Book book, BookLibrary library);
}
