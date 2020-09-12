package student_volodya_danilin.lesson_11.level_2.Task_6;

import java.util.ArrayList;
import java.util.Optional;

class BookDatabaseImpl implements BookDatabase{

    Book book;

    private ArrayList<Book> bookStorage = new ArrayList<>();
    private Long bookIdCounter = (long)1;

    @Override
    public Long save(Book book) {
        book.setId(bookIdCounter);
        bookStorage.add(book);
        bookIdCounter++;
        return bookIdCounter - 1;
    }

    @Override
    public boolean delete(Long bookId) {
        boolean result = false;
        for (Book value : bookStorage) {
            if (value.getId().equals(bookId)) {
                bookStorage.remove(value);
                result = true;
                break;
            }
        }
        return result;
    }

    @Override
    public boolean delete(Book book) {
        boolean result = false;
        for (Book value : bookStorage) {
            if (value.getAuthor().equals(book.getAuthor())
            && value.getTitle().equals(book.getTitle())) {
                bookStorage.remove(value);
                result = true;
                break;
            }
        }
        return result;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        Optional<Book> result = Optional.empty();
            for (Book value : bookStorage) {
                if (value.getId().equals(bookId)) {
                    value.setId(0L);
                    result = Optional.of(value);
                    break;
                }
            }
        return result;
    }

}
