package student_eduards_jasvins.lesson_11.day_2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
interface BookDatabase {

    Long save(Book book);
    boolean delete(Long bookId);
    boolean delete(Book book);
}
