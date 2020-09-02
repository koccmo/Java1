package student_igors_bartkevics.lesson_10.homework.level_6.task_25;

import java.util.ArrayList;
import java.util.List;

class BookReaderImpl implements BookReader {

    private List<Book> library = new ArrayList<>();
    private BookValidator validator = new BookValidator();

    boolean isLibraryEmpty() {
        return library.isEmpty();
    }

    public boolean isBookInReaderLibrary(Book bookToCheck) {
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

    private String[] listOfBooksToStringArray(List<Book> list) {
        int bookListLength = list.size();
        String[] bookList = new String[bookListLength];
        if (!isLibraryEmpty()) {
            for (int i = 0; i < bookListLength; i++) {
                bookList[i] = list.get(i).getTitle() + " [" + list.get(i).getAuthor() + "]";
            }
        }
        return bookList;
    }

    private String[] getListOfBooksWithIsReadState(boolean state) {
        List<Book> books = new ArrayList<>();
        for (Book book : library) {
            if(book.getIsReadState() == state) {
                books.add(book);
            }
        }
        return listOfBooksToStringArray(books);
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

    @Override
    public String[] bookLibraryToStringList() {
        return listOfBooksToStringArray(library);
    }

    @Override
    public List<Book> findBooksByAuthor(String author) {
        List<Book> booksByAuthor = new ArrayList<>();
        for (Book book : library) {
            if (validator.isBookByAuthor(book, author)) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }

    @Override
    public List<Book> findBooksWhichAuthorStartsWithString(String string) {
        List<Book> books = new ArrayList<>();
        for (Book book : library) {
            if (validator.areLettersMatchingBookFieldValue(string, book.getAuthor())) {
                books.add(book);
            }
        }
        return books;
    }

    @Override
    public List<Book> findBooksByTitle(String title) {
        List<Book> booksByTitle = new ArrayList<>();
        for (Book book : library) {
            if (validator.isBookWithTitle(book, title)) {
                booksByTitle.add(book);
            }
        }
        return booksByTitle;
    }

    @Override
    public List<Book> findBooksWhichTitleStartsWithString(String string) {
        List<Book> books = new ArrayList<>();
        for (Book book : library) {
            if (validator.areLettersMatchingBookFieldValue(string, book.getTitle())) {
                books.add(book);
            }
        }
        return books;
    }

    @Override
    public boolean markBookAsRead(Book book) {
        if (isBookInReaderLibrary(book)) {
            book.setIsReadState(true);
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public boolean markBookAsUnread(Book book) {
        if (isBookInReaderLibrary(book)) {
            book.setIsReadState(false);
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String[] getListOfReadBooks() {
        return getListOfBooksWithIsReadState(true);
    }

    @Override
    public String[] getListOfUnreadBooks() {
        return getListOfBooksWithIsReadState(false);
    }
}
