package roman.lesson_11.day_4.task_26;



import java.util.*;

public class BookDatabaseImpl implements BookDatabase {
    private List<Book> books = new ArrayList<>();
    private Long currentId = 1L;

    private Optional<Book> getById(Long bookId) {
        Optional<Book> result = Optional.empty();
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                result = Optional.of(book);
                break;
            }
        }
        return result;
    }

    private Optional<Book> getByBook(Book bookToGet) {
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
        Optional<Book> bookOptional = getById(bookId);
        if (bookOptional.isPresent()) {
            books.remove(bookOptional.get());
            return true;
        } else return false;
    }

    @Override
    public boolean delete(Book book) {
        Optional<Book> bookOptional = getByBook(book);
        if (bookOptional.isPresent()) {
            books.remove(bookOptional.get());
            return true;
        } else return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) { return getById(bookId); }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> listOfBookByAuthor = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                listOfBookByAuthor.add(book);
            }
        }
        return listOfBookByAuthor;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> bookListWithSameAuthor = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                bookListWithSameAuthor.add(book);
            }
        }
        return bookListWithSameAuthor;
    }

    @Override
    public int countAllBooks() {
        return books.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        books.removeAll(findByAuthor(author));
    }

    @Override
    public void deleteByTitle(String title) {
        books.removeAll(findByTitle(title));
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> bookListWithEnteredCriteria = new ArrayList<>();
        for (Book book : books) {
            if (searchCriteria.match(book)) {
                bookListWithEnteredCriteria.add(book);
            }
        }
        return bookListWithEnteredCriteria;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> allAuthors = new HashSet<>();
        for (Book book : books) {
            allAuthors.add(book.getAuthor());
        }
        return allAuthors;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> allBookWithUniqueTitle = new HashSet<>();
        for (Book book : books) {
            allBookWithUniqueTitle.add(book.getTitle());
        }
        return allBookWithUniqueTitle;
    }

    @Override
    public Set<Book> findUniqueBooks() {
       return new HashSet<>(books);
    }

    @Override
    public boolean contains(Book book) {
        return books.contains(book);
    }
}
