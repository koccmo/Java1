package student_anvars_intezars.home_tasks.lesson_11.level_6_tasks;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

import java.util.*;

@CodeReview(approved = true)
class BookDataBaseImpl implements BookDataBase {

    @CodeReviewComment(teacher = "Must be private!")
    //added
    private List<Book> books = new ArrayList<>();
    private Long id = 0L;

    @Override
    public Long save(Book book) {
        id++;
        book.setId(id);
        books.add(book);

        return id;
    }


    @Override
    public boolean delete(Long bookID) {
        return books.removeIf(book -> book.getId().equals(bookID));
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (int i = 0; i < books.size(); i++) {
            Book listOfBooks = books.get(i);
            if (listOfBooks.getId().equals(bookId)) {
                return Optional.of(listOfBooks);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> booksOfOneAuthor = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            String authorOfBooks = books.get(i).getAuthor();
            if (authorOfBooks.contains(author)) {
                Book authorBooks = books.get(i);
                booksOfOneAuthor.add(authorBooks);
            }
        }
        return booksOfOneAuthor;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> booksWithSameTitle = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            String titleOfBooks = books.get(i).getTitle();
            if (titleOfBooks.contains(title)) {
                Book oneTitleBooks = books.get(i);
                booksWithSameTitle.add(oneTitleBooks);
            }
        }
        return booksWithSameTitle;
    }

    @Override
    public int countAllBooks() {
        int count = 0;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i) != null) {
                count = count + 1;
            }
        }
        return count;
    }

    @Override
    public void deleteByAuthor(String author) {
        String authorOfBooks = "";
        for (int i = 0; i < books.size(); i++) {
            authorOfBooks = books.get(i).getAuthor();
            if (authorOfBooks.contains(author)) {
                Book bookToDelete = books.get(i);
                books.remove(bookToDelete);
            }
        }
    }

    @Override
    public void deleteByTitle(String title) {
        String titleOfBooks = "";
        for (int i = 0; i < books.size(); i++) {
            titleOfBooks = books.get(i).getTitle();
            if (titleOfBooks.contains(title)) {
                Book bookToDelete = books.get(i);
                books.remove(bookToDelete);
            }
        }
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> booksOfSearchCriteria = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            Book bookFromLibrary = books.get(i);
            if (searchCriteria.match(bookFromLibrary)) {
                booksOfSearchCriteria.add(bookFromLibrary);
            }
        }
        return booksOfSearchCriteria;

    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> allUniqueAuthors = new HashSet<>();
        for (int i = 0; i < books.size(); i++) {
            String authors = books.get(i).getAuthor();
            allUniqueAuthors.add(authors);
        }
        return allUniqueAuthors;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> allUniqueTitles = new HashSet<>();
        for (int i = 0; i < books.size(); i++) {
            String titles = books.get(i).getTitle();
            allUniqueTitles.add(titles);
        }
        return allUniqueTitles;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        Set<Book> allUniqueBooks = new HashSet<>();
        for (int i = 0; i < books.size(); i++) {
            Book allBooks = books.get(i);
            allUniqueBooks.add(allBooks);
        }
        return allUniqueBooks;
    }

    @Override
    public boolean contains(Book book) {
        return books.contains(book);
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        Map<String, List<Book>> mapKeyIsAuthor = new HashMap<>();
        Set<String> authors = findUniqueAuthors();
        for (String author : authors) {
            mapKeyIsAuthor.put(author,findByAuthor(author));
        }
        return mapKeyIsAuthor;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        Map<String, Integer> mapKeyIsAuthor = new HashMap<>();
        Set<String> authors = findUniqueAuthors();
        for (String author : authors) {
            mapKeyIsAuthor.put(author,countAllBooks());
        }
        return mapKeyIsAuthor;
    }
}

