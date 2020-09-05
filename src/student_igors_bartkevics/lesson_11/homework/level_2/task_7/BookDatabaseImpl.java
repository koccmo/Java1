package student_igors_bartkevics.lesson_11.homework.level_2.task_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class BookDatabaseImpl implements BookDatabase {

    List<Book> books = new ArrayList<>();
    Long currentId = 1L;

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
        }
        else return false;
    }
}
