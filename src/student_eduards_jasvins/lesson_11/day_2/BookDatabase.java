package student_eduards_jasvins.lesson_11.day_2;

interface BookDatabase {

    Long save(Book book);
    boolean delete(Long bookId);
    boolean delete(Book book);
}
