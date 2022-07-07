package roman.lesson_11.day_2.task_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookDatabaseImpl implements BookDatabase{
    private Long currentId = 1L;
    private List<Book> books = new ArrayList<>();

    private Optional<Book> getBookById(Long bookId) {
        Optional<Book> result = Optional.empty();
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                result = Optional.of(book);
                break;
            }
        }
        return result;
    }

    private Optional<Book> getBookByBook(Book bookToGet) {
        Optional<Book> result = Optional.empty();
        for (Book book : books) {
            if (book.equals(bookToGet)) {
                result = Optional.of(book);
                break;
            }
        }
        return result;
    }

    public Long getCurrentId() {
        return currentId;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public Long save(Book book) {
        books.add(book);
        Long bookId = currentId;
        book.setId(bookId);
        currentId++;
        return currentId;
    }

    @Override
    public boolean delete(Long bookId) {
        Optional<Book> bookOptional = getBookById(bookId);
        if (bookOptional.isPresent()) {
            books.remove(bookOptional.get());
            return true;
        } else return false;
    }

    @Override
    public boolean delete(Book book) {
        Optional<Book> bookOptional = getBookByBook(book);
        if (bookOptional.isPresent()) {
            books.remove(bookOptional.get());
            return true;
        } else return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        return getBookById(bookId);
    }
}
