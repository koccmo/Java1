package student_anvars_intezars.home_tasks.lesson_11.level_2.task_6;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

class BookDataBaseImpl implements BookDataBase {

    List<Book> books = new ArrayList<>();
    private static final AtomicLong count = new AtomicLong();

    @Override
    public Long save(Book book) {
        book.setId(atomicID());
        books.add(book);

        return book.getId();
    }
    @Override
    public Long atomicID() {
        Long bookID = count.incrementAndGet();
        return bookID;
    }
}
