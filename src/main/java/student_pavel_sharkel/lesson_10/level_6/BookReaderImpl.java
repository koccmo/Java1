package student_pavel_sharkel.lesson_10.level_6;

import java.util.ArrayList;
import java.util.List;

public class BookReaderImpl implements BookReader{

    List<Book> bookList = new ArrayList<>();

    @Override
    public boolean addBook(Book book) {
        if (checkBook(book)) {
            bookList.add(book);
            return true;
        } else return false;

    }

    boolean checkBook(Book book) {
        boolean result = true;
        for (Book list : bookList) {
            if (list.getAuthor().equals(book.getAuthor()) || list.getTitle().equals(book.getTitle())) {
                result = false;
            }
        }
        return result;
    }
}
