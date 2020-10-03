package student_aleksandra_maksimovic.lesson_11.level_2.task_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class BookDatabaseImpl implements BookDatabase {


    private List<Book> books = new ArrayList<>();
    private Long id = 1L;
    BookProof bookProof = new BookProof();

    private Optional<Book> getBookFromList(Book bookToGet) {

        Optional<Book> result = Optional.empty();
        for (Book book : books) {
            if (book.equals(bookToGet)) {
                result = Optional.of(book);
            }
        }
        return result;
    }

    @Override
    public Long save(Book book) {

        books.add(book);
        Long bookId = id;
        book.setId(bookId);
        id++;
        return id;
    }

    @Override
    public boolean delete(Long bookId) {

        Optional<Book> bookOptional = findById(bookId);
        if (bookOptional.isPresent()) {
            books.remove(bookOptional.get());
            return true;
        }
        else return false;
    }

    @Override
    public boolean delete(Book book) {

        Optional<Book> bookOptional = getBookFromList(book);
        if (bookOptional.isPresent()) {
            books.remove(bookOptional.get());
            return true;
        }
        else return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {

        Optional<Book> result = Optional.empty();
        for (Book book : books){
            if(book.getId().equals(bookId)) {
                result = Optional.of(book);
                break;
            }
        }
        return result;
    }

    @Override
    public List<Book> findByAuthor(String author) {

        List<Book> booksByAuthor = new ArrayList<>();
        for (Book book : books) {
            if (bookProof.isBookByAuthor(book, author)) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }

    @Override
    public List<Book> findByTitle(String title) {

        List <Book> booksByTitle = new ArrayList<>();
        for (Book book : books) {
            if (bookProof.isBookWithTitle(book, title)) {
                booksByTitle.add(book);
            }
        }
        return booksByTitle;
    }

    @Override
    public int countAllBooks() {

        return books.size();
    }

    @Override
    public void deleteByAuthor(String author) {

        List<Book> booksByAuthor = findByAuthor(author);
        for (Book book : booksByAuthor) {
            delete(book);
        }
    }

    @Override
    public void deleteByTitle(String title) {

        List<Book> booksByTitle = findByTitle(title);
        for (Book book : booksByTitle) {
            delete(book);
        }
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria)
    {
        List<Book> booksByCriteria = new ArrayList<>();
        for (Book book : books) {
            if (searchCriteria.match(book))
            {
                booksByCriteria.add(book);
            }
        }
        return booksByCriteria;
    }

}
