package student_jaroslav_brutan.lesson_11.day_2.task_6;

public interface BookDatabase {

    Long save(Book book);

    boolean delete(Long bookId);

    boolean delete(Book book);
}
