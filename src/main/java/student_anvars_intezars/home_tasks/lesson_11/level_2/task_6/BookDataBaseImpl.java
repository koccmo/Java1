package student_anvars_intezars.home_tasks.lesson_11.level_2.task_6;

import java.util.ArrayList;
import java.util.List;


class BookDataBaseImpl implements BookDataBase {

    List<Book> books = new ArrayList<>();
    private Long id = 0L;

    @Override
    public Long save(Book book) {
        id++;
        book.setId(id);
        books.add(book);

        return id;
    }


    @Override
    public boolean delete(Long bookID) {
        if (books.removeIf(book -> book.getId().equals(bookID))) {
            return true;
        }
            return false;
    }
}
