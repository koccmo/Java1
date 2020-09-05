package student_igors_bartkevics.lesson_11.homework.level_2.task_7;

public interface BookDatabase {

    Long save(Book book);

    boolean delete(Long bookId);
}
