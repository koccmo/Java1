package roman.lesson_10.day_6.task_15;

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
        if(bookValidator.bookValidToBeAdded(bookToAdd, this)) {
            library.add(bookToAdd);
            return true;
        } else return false;
    }
}
