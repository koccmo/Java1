package student_igors_bartkevics.lesson_10.homework.level_6.task_16;

import java.util.ArrayList;
import java.util.List;

class BookReaderImpl implements BookReader {

    private List<Book> library = new ArrayList<>();
    private BookValidator validator = new BookValidator();

    List<Book> getLibrary() {
        return library;
    }


    @Override
    public boolean addBook(Book book) {
        if (validator.isBookValidToAddInReaderLibrary(book,this)) {
            library.add(book);
            return true;
        }
        else return false;
    }

    @Override
    public boolean removeBook(Book book) {
        if (validator.isBookValidToRemoveItFromReaderLibrary(book, this)) {
            library.remove(book);
            return true;
        }
        else return false;
    }

}
