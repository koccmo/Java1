package roman.lesson_10.day_6.task_24_25;

import java.util.ArrayList;
import java.util.List;

public class BookReaderImpl implements BookReader{

    private List<Book> library = new ArrayList<>();
    private BookValidator bookValidator = new BookValidator();

    public List<Book> getLibrary() {
        return library;
    }

    private boolean isBookInLibrary(Book bookToCheck) {
        boolean result = false;
        for (Book book : library) {
            if (book.getAuthor().equals(bookToCheck.getAuthor())
                    && book.getTitle().equals(bookToCheck.getTitle())) {
                result = true;
                break;
            }
        } return result;
    }

    private List<Book> doListAsReadOrNotBooks (boolean asReadBook) {
        List<Book> listOfBook = new ArrayList<>();
        library.forEach(book -> {
            if (book.isBookAsRead() == asReadBook) {
                listOfBook.add(book);
            }
        });
        return listOfBook;
    }

    private String[] listOfBooksToStringArray(List<Book> bookList) {
        String[] book = new String[bookList.size()];
        for (int i = 0; i < bookList.size(); i++) {
            book[i] = bookList.get(i).getTitle() + " [ "
                    + bookList.get(i).getAuthor() + " ]";
        }
        return book;
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

    @Override
    public String[] libraryBooksToStringList() {
        String[] listOfBookInLibrary = listOfBooksToStringArray(library);
        return listOfBookInLibrary;
    }

    @Override
    public List<Book> getListFromBookReaderWithSameAuthor(String bookAuthor) {
        List<Book> listOfBookWithSameAuthor = new ArrayList<>();
        library.forEach(book -> {
            if(book.getAuthor().equals(bookAuthor) || book.getAuthor().startsWith(bookAuthor)) {
                listOfBookWithSameAuthor.add(book);
            }
        });
        return listOfBookWithSameAuthor;
    }

    @Override
    public List<Book> getListFromBookReaderWithSameTitle(String bookTitle) {
        List<Book> bookListWithSameTitle = new ArrayList<>();
        library.forEach(book -> {
            if(book.getTitle().equals(bookTitle) || book.getTitle().startsWith(bookTitle)) {
                bookListWithSameTitle.add(book);
            }
        });
        return bookListWithSameTitle;
    }

    @Override
    public boolean markBookAsRead(Book book) {
        if (isBookInLibrary(book)) {
            book.setBookAsRead(true);
            return true;
        } else {return false;}
    }

    @Override
    public boolean markBooKAsNotRead(Book book) {
        if (isBookInLibrary(book)) {
            book.setBookAsRead(false);
            return true;
        } else { return false; }
    }

    @Override
    public String[] listOfBookBeenRead() {
        List<Book> listOfReadBook = doListAsReadOrNotBooks(true);
        String[] arrayOfAsReadBook = listOfBooksToStringArray(listOfReadBook);
        return arrayOfAsReadBook;
    }

    @Override
    public String[] listOfBookNotRead() {
        List<Book> listUnReadBook = doListAsReadOrNotBooks(false);
        String[] arrayUnReadBook = listOfBooksToStringArray(listUnReadBook);
        return arrayUnReadBook;
    }
}
