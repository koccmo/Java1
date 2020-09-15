package student_igors_bartkevics.lesson_11.homework.level_2_intern.task_8;

interface BookDatabase {

    Long save(Book book);

    boolean delete(Long bookId);

    boolean delete(Book book);
}
