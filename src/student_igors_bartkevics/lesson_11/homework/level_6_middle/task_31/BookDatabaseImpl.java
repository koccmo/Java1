package student_igors_bartkevics.lesson_11.homework.level_6_middle.task_31;

import java.util.*;

class BookDatabaseImpl implements BookDatabase {

    List<Book> books = new ArrayList<>();
    Long currentId = 1L;
    BookValidator validator = new BookValidator();

    private Optional<Book> getBookFromList(Book bookToGet) {
        Optional<Book> result = Optional.empty();
        for (Book book : books) {
            if (book.equals(bookToGet)) {
                result = Optional.of(book);
                break;
            }
        }
        return result;
    }

    @Override
    public Long save(Book book) {
        books.add(book);
        Long bookId = currentId;
        book.setId(bookId);
        currentId++;
        return currentId;
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
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
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
            if (validator.isBookByAuthor(book, author)) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> booksByTitle = new ArrayList<>();
        for (Book book : books) {
            if (validator.isBookWithTitle(book, title)) {
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
        List<Book> booksWithTitle = findByTitle(title);
        for (Book book : booksWithTitle) {
            delete(book);
        }
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> listOfBooks  = new ArrayList<>();
        for (Book book : books) {
            if (searchCriteria.match(book)) {
                listOfBooks.add(book);
            }
        }
        return listOfBooks;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> authors = new HashSet<>();
        for (Book book : books) {
            authors.add(book.getAuthor());
        }
        return authors;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> titles = new HashSet<>();
        for (Book book : books) {
            titles.add(book.getTitle());
        }
        return titles;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        return new HashSet<>(books);
    }

    @Override
    public boolean contains(Book book) {
        return books.contains(book);
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {

        Map<String, List<Book>> authorToBooksMap = new HashMap<>();
        for (String author : findUniqueAuthors()) {
            //authorToBooksMap.put(author, find(new AuthorSearchCriteria(author)));
            authorToBooksMap.put(author, findByAuthor(author));
        }
        return authorToBooksMap;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        Map<String, Integer> eachAuthorBookCount = new HashMap<>();
        for (String author : findUniqueAuthors()) {
            List<Book> booksByAuthor = findByAuthor(author);
            Set<Book> uniqueBooks = new HashSet<>(booksByAuthor);
            eachAuthorBookCount.put(author, uniqueBooks.size());
        }
        return eachAuthorBookCount;
    }
}
