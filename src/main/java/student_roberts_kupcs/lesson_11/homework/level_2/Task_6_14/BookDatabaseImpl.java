package student_roberts_kupcs.lesson_11.homework.level_2.Task_6_14;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class BookDatabaseImpl implements BookDatabase{
    private List<Book> books = new ArrayList<>();
    private long id = 1L;

    //task_6
    @Override
    public Long save(Book book) {
        books.add(book);
        Long bookId = id;
        book.setId(bookId);
        id++;
        return id;
    }

    //@Override
    public boolean delete(long bookId) {
        return false;
    }

    //@Override
    public boolean delete(Book book) {
        return false;
    }

    //@Override
    public Optional<Book> findById(Long bookId) {
        return Optional.empty();
    }

    //@Override
    public List<Book> findByAuthor(String author) {
        return null;
    }

    //@Override
    public List<Book> findByTitle(String title) {
        return null;
    }

    //@Override
    public int countAllBooks() {
        return 0;
    }

    //@Override
    public void deleteByAuthor(String author) {

    }

    //@Override
    public void deleteByTitle(String title) {

    }
}
