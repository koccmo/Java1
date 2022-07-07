package roman.lesson_10.day_6.task_14;

import java.util.ArrayList;
import java.util.List;

public class BookReaderImpl implements BookReader{
    private List<Book> bookList = new ArrayList<>();

    public List<Book> getBookList() {
        return bookList;
    }

    @Override
    public boolean addBook(Book bookToAdd) {
        if(rightToAdd(bookToAdd)) {
            bookList.add(bookToAdd);
            return true;
        } else return false;
    }

    boolean rightToAdd(Book bookToAdd) {
        return (bookList.isEmpty() || (filledAuthorTitle(bookToAdd) && !listContainBook(bookToAdd)));
    }

    boolean filledAuthorTitle(Book bookToAdd) {
        return !bookToAdd.getTitle().equals("") && !bookToAdd.getAuthor().equals("");
    }

    boolean listContainBook(Book bookToAdd) {
        boolean result = false;
        for(Book book : bookList) {
            if(book.getAuthor().equals(bookToAdd.getAuthor()) &&
                    book.getTitle().equals(bookToAdd.getTitle())) {
                result = true;
                break;
            }
        }
        return result;
    }
}
