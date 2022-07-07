package roman.lesson_11.day_2.task_6;

import java.util.ArrayList;
import java.util.List;

public class BookDatabaseImpl implements BookDatabase{
    private List<Book> books = new ArrayList<>();
    private Long currentId = 1L;

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
}
