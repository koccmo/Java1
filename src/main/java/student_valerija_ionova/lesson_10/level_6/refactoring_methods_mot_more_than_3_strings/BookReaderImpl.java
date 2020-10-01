package student_valerija_ionova.lesson_10.level_6.refactoring_methods_mot_more_than_3_strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BookReaderImpl implements BookReader{

    private List<Book> bookDatabase;

    BookReaderImpl (Book...books){
        this.bookDatabase = new ArrayList<>(Arrays.asList(books));
    }

    public List <Book> getBookDatabase (){
        return bookDatabase;
    }

    public boolean addBook (Book book){
        if (!bookDatabase.contains(book) && isValidBook(book)){
            bookDatabase.add(book);
            return true;
        }
        return false;
    }

    public boolean deleteBook (Book book){
        if (bookDatabase.contains(book)){
            bookDatabase.remove(book);
            return true;
        }
        return false;
    }

    @Override
    public String[] getArrayOfBooks() {
        return bookDatabase.stream()
                .map(book -> addBookToArray(book))
                .toArray(String [] :: new);
    }

    private String addBookToArray (Book book){
        return book.getTitle() + " [" + book.getAuthor() + "]";
    }

    @Override
    public List<Book> findBookByAuthor(String author) {
        return bookDatabase.stream()
                .filter (book -> matchAuthor(book, author))
                .collect(Collectors.toList());
    }

    @Override
    public List<Book> findBookByTitle(String title) {
        return bookDatabase.stream()
                .filter (book -> matchTitle(book, title))
                .collect(Collectors.toList());
    }

    @Override
    public boolean markAsRead(Book book) {
        if (bookDatabase.contains(book)){
            bookDatabase.get(bookDatabase.indexOf(book)).setRead(true);
        }
        return bookDatabase.contains(book);
    }

    @Override
    public boolean markAsNotRead(Book book) {
        if (bookDatabase.contains(book)){
            bookDatabase.get(bookDatabase.indexOf(book)).setRead(false);
        }
        return bookDatabase.contains(book);
    }

    @Override
    public String[] getArrayOfReadBooks() {
        return bookDatabase.stream()
                .filter(book -> book.getIsRead())
                .map(book -> addBookToArray(book))
                .toArray(String[]::new);
    }

    @Override
    public String[] getArrayOfNotReadBooks() {
        return bookDatabase.stream()
                .filter(book -> !book.getIsRead())
                .map(book -> addBookToArray(book))
                .toArray(String[]::new);
    }

    private boolean matchAuthor (Book book, String author){
        return book.getAuthor().startsWith(author);
    }

    private boolean matchTitle (Book book, String title){
        return book.getTitle().startsWith(title);
    }

    private boolean isValidBook (Book book){
        return (book.getTitle() != null) && (book.getAuthor() != null) &&
                (book.getTitle().length() > 0) && (book.getAuthor().length() > 0);
    }

}
