package student_dmitrijs_jasvins.lesson_10.day_6;

import java.util.ArrayList;
import java.util.List;

public class BookReaderImpl implements BookReader {
    List <Book> library = new ArrayList<>();

    @Override
    public boolean addBook(Book book) {
        if (bookAlreadyInELibrary(book) || bookTitleIsBlank(book) || bookAuthorIsBlank(book))
            return false;
        else {
            library.add(book);
            return true;
        }
    }
    @Override
    public boolean removeBook(Book book) {
        if (bookAlreadyInELibrary(book)) {
            library.remove(book);
            return true;
        }
        return false;
    }

    @Override
    public boolean MarkBookAsAlreadyRead(Book book) {
        if (bookAlreadyInELibrary(book)) {
            library.get(0).setReadied(true);
            return true;
        }
        return false;
    }

    @Override
    public boolean MarkBookAsNotRead(Book book) {
        if (bookAlreadyInELibrary(book)) {
            library.get(0).setReadied(false);
            return true;
        }
        return false;
    }

    @Override
    public String[] listOfAllBooks() {
        String[] allBooks = new String[library.size()];
        for (int i = 0; i < library.size(); i++) {
            allBooks[i] = library.get(i).getTitle() + " [" + library.get(i).getAuthor() + "]";
        }
        return allBooks;
    }

    @Override
    public String[] listOfAllReadBooks() {
        String[] allReadBooks = new String[library.size()];
        for (int i = 0; i < library.size(); i++) {
            if (library.get(i).isReadied()) {
                allReadBooks[i] = library.get(i).getTitle() + " [" + library.get(i).getAuthor() + "]";
            }
        }
        return allReadBooks;
    }

    @Override
    public String[] listOfAllNotReadBooks() {
        String[] allNotReadBooks = new String[library.size()];
        for (int i = 0; i < library.size(); i++) {
            if (!library.get(i).isReadied()) {
                allNotReadBooks[i] = library.get(i).getTitle() + " [" + library.get(i).getAuthor() + "]";
            }
        }
        return allNotReadBooks;
    }

    @Override
    public List<Book> listByAuthorOrContainsPartOfAuthorName(String author) {
        List<Book> byAuthorBooks = new ArrayList<>();
        for (Book books : library) {
            if ((books.getAuthor().equals(author)) || (books.getAuthor().contains(author))) {
                byAuthorBooks.add(books);
            }
        }
        return byAuthorBooks;
    }

    @Override
    public List<Book> listByTitleOrContainsPartOfTitle(String title) {
        List<Book> byTitleBooks = new ArrayList<>();
        for (Book books : library) {
            if ((books.getTitle().equals(title)) || (books.getTitle().contains(title))) {
                byTitleBooks.add(books);
            }
        }
        return byTitleBooks;
    }

    private boolean bookAlreadyInELibrary(Book book) {
        for (Book books : library) {
            if (books.getTitle().equals(book.getTitle()) &&
                    books.getAuthor().equals(book.getAuthor()))
                return true;
        }
        return false;
    }

    private boolean bookTitleIsBlank(Book book) {
        return (book.getTitle().isBlank());
    }

    private boolean bookAuthorIsBlank(Book book) {
        return (book.getAuthor().isBlank());
    }

}
