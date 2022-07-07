package roman.lesson_10.day_6.task_16;

import java.util.ArrayList;
import java.util.List;

public class BookReaderImpl implements BookReader{
    private List<Book> library = new ArrayList<>();
    private BookValidator bookValidator = new BookValidator();

    public List<Book> getLibrary() {
        return library;
    }

    @Override
    public boolean addBook(Book bookToAdd) {
        if(bookValidator.bookValidAdded(this, bookToAdd)) {
            library.add(bookToAdd);
            return true;
        } else { return false; }
    }

    @Override
    public boolean removeBook(Book bookToRemove) {
        if(bookValidator.bookValidRemove(this, bookToRemove)) {
            library.remove(bookToRemove);
            return true;
        } else { return false; }
    }
}
