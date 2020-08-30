package student_igors_bartkevics.lesson_10.homework.level_6.task_14;

import java.util.ArrayList;
import java.util.List;

class BookReaderImpl implements BookReader {

    private List<Book> library = new ArrayList<>();

    @Override
    public boolean addBook(Book bookToAdd) {
        if (isBookValidToAdd(bookToAdd)) {
            library.add(bookToAdd);
            return true;
        }
        else return false;
    }


    boolean isBookValidToAdd(Book bookToAdd) {
        return (library.isEmpty() || !contains(bookToAdd)) && bookFieldsAreFilled(bookToAdd);
    }


    boolean bookFieldsAreFilled(Book book) {
        return !book.getTitle().equals("") && !book.getAuthor().equals("");
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
