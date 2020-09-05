package student_igors_bartkevics.lesson_11.homework.level_2.task_6;

import java.util.ArrayList;
import java.util.List;

class BookDatabaseImpl implements BookDatabase{

    List<Book> books = new ArrayList<>();
    Long currentId = 1L;

    public Long getCurrentId() {
        return currentId;
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
