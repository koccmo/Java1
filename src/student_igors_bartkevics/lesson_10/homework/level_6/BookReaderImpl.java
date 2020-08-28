package student_igors_bartkevics.lesson_10.homework.level_6;

import java.util.ArrayList;
import java.util.List;

class BookReaderImpl implements BookReader {

    private List<Book> library = new ArrayList<>();

    public List<Book> getLibrary() {
        return library;
    }

    @Override
    public boolean addBook(Book bookToAdd) {
        if (library.isEmpty() || !contains(bookToAdd)) {
            library.add(bookToAdd);
            return true;
        }
        else return false;
    }

    boolean contains(Book bookToCheck) {
        boolean result = false;
        for (Book book : library) {
            if (book.getAuthor().equals(bookToCheck.getAuthor()) &&
                    book.getTitle().equals(bookToCheck.getTitle())) {
                result = true;
                break;
            }
        }
        return result;
    }
}
