package student_pavel_sharkel.lesson_11.level_2.task_6;

public interface BookDatabase {

    Long save (Book book);

    boolean delete(Long bookId);
}
