package roman.lesson_11.day_2.task_8;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class BookDatabaseImpl implements BookDatabase{
    private List<Book> books = new ArrayList<>();
    private Long currentId = 1L;

    private Optional<Book> getBookById(Long bookId) {
        Optional<Book> result = Optional.empty();
        for (Book book : books) {
            if (bookId.equals(book.getId())) {
                result = Optional.of(book);
                break;
            }
        }
        return result;
    }

    private Optional<Book> getBokFromList(Book bookToGet) {
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
        boolean result = false;
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                //int index = book.getId().intValue();
                books.remove(book.getId().intValue() - 1);
                result = true;
                break;
            }
        }
        return result;
    }

    @Override
    public boolean delete(Book book) {
        Optional<Book> bookOptional = getBokFromList(book);
        if (bookOptional.isPresent()) {
            books.remove(bookOptional.get());
            return true;
        } else return false;
        //        boolean result = false;
        //        for (Book bookInList : books) {
        //            if(bookInList.equals(book)) {
        //                books.remove(book);
        //                result = true;
        //                break;
        //            }
        //        }
        //        return result;
    }


}
