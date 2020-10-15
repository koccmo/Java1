package student_pavel_sharkel.lesson_11.level_2.task_6;

import java.util.ArrayList;
import java.util.List;

public class BookDatabaseImpl implements BookDatabase{

    Long id = 0L;
    List<Book> bookList = new ArrayList<>();

  //      Book book1 = new Book("Author1", "Title1");


    @Override
    public Long save(Book book) {
        id++;
        bookList.add(book);
        book.setId(id);
        return id;
    }

    @Override
    public boolean delete(Long bookId) {
        boolean result = false;
        if (bookId <= id) {
            bookList.remove(bookId);
            result = true;
        }
        return result;
    }

    @Override
    public boolean delete(Book book) {
        boolean result = false;
        for (Book value : bookList) {
            if (value.equals(book)) {
                bookList.remove(book);
                result = true;
            }
        }
        return result;
    }
}
