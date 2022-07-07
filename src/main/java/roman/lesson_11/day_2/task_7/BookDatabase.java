package roman.lesson_11.day_2.task_7;


public interface BookDatabase {
    Long save(Book book);
    boolean delete(Long bookId);
}
