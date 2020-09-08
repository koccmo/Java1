package student_igors_bartkevics.lesson_10.homework.level_6.task_15;

import java.util.ArrayList;
import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class BookReaderImpl implements BookReader {

    private List<Book> library = new ArrayList<>();
    private BookValidator validator = new BookValidator();

    List<Book> getLibrary() {
        return library;
    }


    @Override
    public boolean addBook(Book bookToAdd) {
        if (validator.isBookValidToAddInReaderLibrary(bookToAdd,this)) {
            library.add(bookToAdd);
            return true;
        }
        else return false;
    }
}
