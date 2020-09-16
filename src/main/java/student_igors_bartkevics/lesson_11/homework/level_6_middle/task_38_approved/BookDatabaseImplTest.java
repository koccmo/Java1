package student_igors_bartkevics.lesson_11.homework.level_6_middle.task_38_approved;

import java.util.*;

class BookDatabaseImplTest {

    public static void main(String[] args) {
        BookDatabaseImplTest test = new BookDatabaseImplTest();

        test.savePositiveTest();
        test.deleteByIdPositiveTest();
        test.deleteByIdNegativeTest();
        test.deleteBookPositiveTest();
        test.deleteBookNegativeTest();
        test.findByIdPositiveTest();
        test.findByIdNegativeTest();
        test.findBooksByAuthorSeveralBooksTest();
        test.findBooksByAuthorNegativeTest();
        test.findBooksByAuthorWhenLibraryIsEmptyTest();
        test.findByTitleSeveralBooksTest();
        test.findByTitleNegativeTest();
        test.findByTitleWhenLibraryIsEmptyTest();
        test.countAllBooksWhenItIsNoBooksTest();
        test.countAllBooksTest();
        test.deleteBooksByAuthorSeveralBooksTest();
        test.deleteBooksByAuthorNegativeTest();
        test.deleteBooksByTitleSeveralBooksTest();
        test.deleteBooksByTitleNegativeTest();
        test.findPositiveTest();
        test.findUniqueAuthorsTest();
        test.findUniqueTitlesTest();
        test.findUniqueBooksTest();
        test.containsPositiveTest();
        test.containsNegativeTest();
        test.getAuthorToBooksMapTest();
        test.getEachAuthorBookCountTest();
    }

    Book book1 = new Book("Bates B., Sierra K.", "Head First Java");
    Book book2 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
    Book book3 = new Book("Hunt A., Thomas D.", "The Pragmatic Programmer. From Journeyman to Master");

    void savePositiveTest() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Long currentId = bookDatabase.save(new Book("Bates B., Sierra K.", "Head First Java"));
        boolean condition = currentId == 2;
        checkResult(condition, "Save book positive");
    }

    void deleteByIdPositiveTest() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        boolean condition = bookDatabase.delete(3L);
        checkResult(condition, "Delete book by ID positive");
    }

    void deleteByIdNegativeTest() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.delete(3L);
        boolean condition = !bookDatabase.delete(3L);
        checkResult(condition, "Delete book by ID negative");
    }

    void deleteBookPositiveTest() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        boolean condition = bookDatabase.delete(new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship"));
        checkResult(condition, "Delete book positive");
    }

    void deleteBookNegativeTest() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book3);
        boolean condition = !bookDatabase.delete(new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship"));
        checkResult(condition, "Delete book negative");
    }

    void findByIdPositiveTest() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        Book foundBook = bookDatabase.findById(3L).get();
        boolean condition = foundBook.equals(book3);
        checkResult(condition, "Find book by ID positive");
    }

    void findByIdNegativeTest() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        Optional<Book> optionalBook = bookDatabase.findById(3L);
        boolean condition = optionalBook.isEmpty();
        checkResult(condition, "Find book by ID negative");
    }

    void findBooksByAuthorSeveralBooksTest() {
        Book book1 = new Book("Bates B., Sierra K.", "Head First Java");
        Book book2 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        Book book3 = new Book("Hunt A., Thomas D.", "The Pragmatic Programmer. From Journeyman to Master");
        Book book4 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship rev 2");
        Book book5 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship rev 3");
        BookDatabase bookDatabase = new BookDatabaseImpl();
        List<Book> booksByAuthor =new ArrayList<>();
        booksByAuthor.add(book2);
        booksByAuthor.add(book4);
        booksByAuthor.add(book5);
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        bookDatabase.save(book5);
        boolean condition = bookDatabase.findByAuthor("Martin R.").equals(booksByAuthor);
        checkResult(condition, "Find book by author several books");
    }

    void findBooksByAuthorNegativeTest() {
        Book book1 = new Book("Bates B., Sierra K.", "Head First Java");
        Book book2 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        Book book3 = new Book("Hunt A., Thomas D.", "The Pragmatic Programmer. From Journeyman to Master");
        Book book4 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship rev 2");
        Book book5 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship rev 3");
        BookDatabase bookDatabase = new BookDatabaseImpl();
        List<Book> booksByAuthor =new ArrayList<>();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        bookDatabase.save(book5);
        boolean condition = bookDatabase.findByAuthor("Dostoevsky").equals(booksByAuthor);
        checkResult(condition, "Find book by author negative");
    }

    void findBooksByAuthorWhenLibraryIsEmptyTest() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        List<Book> booksByAuthor = new ArrayList<>();
        boolean condition = bookDatabase.findByAuthor("Martin R.").equals(booksByAuthor);
        checkResult(condition, "Find book by author when library is empty");
    }

    void findByTitleSeveralBooksTest() {
        Book book1 = new Book("Bates B., Sierra K.", "Head First Java");
        Book book2 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        Book book3 = new Book("Hunt A., Thomas D.", "The Pragmatic Programmer. From Journeyman to Master");
        Book book4 = new Book("Marvel R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        Book book5 = new Book("Martin K.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        BookDatabase bookDatabase = new BookDatabaseImpl();
        List<Book> booksByAuthor =new ArrayList<>();
        booksByAuthor.add(book2);
        booksByAuthor.add(book4);
        booksByAuthor.add(book5);
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        bookDatabase.save(book5);
        boolean condition = bookDatabase.findByTitle("Clean Code - A Handbook of Agile Software Craftsmanship").equals(booksByAuthor);
        checkResult(condition, "Find books by title several books");
    }

    void findByTitleNegativeTest() {
        Book book1 = new Book("Bates B., Sierra K.", "Head First Java");
        Book book2 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        Book book3 = new Book("Hunt A., Thomas D.", "The Pragmatic Programmer. From Journeyman to Master");
        Book book4 = new Book("Marvel R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        Book book5 = new Book("Martin K.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        BookDatabase bookDatabase = new BookDatabaseImpl();
        List<Book> booksByAuthor =new ArrayList<>();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        bookDatabase.save(book5);
        boolean condition = bookDatabase.findByTitle("The Lord of the ring").equals(booksByAuthor);
        checkResult(condition, "Find books by author negative");
    }

    void findByTitleWhenLibraryIsEmptyTest() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        List<Book> booksByAuthor = new ArrayList<>();
        boolean condition = bookDatabase.findByTitle("Clean Code - A Handbook of Agile Software Craftsmanship").equals(booksByAuthor);
        checkResult(condition, "Find books by author when library is empty");
    }

    void countAllBooksWhenItIsNoBooksTest() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        boolean condition = bookDatabase.countAllBooks() == 0;
        checkResult(condition, "Count all books whet it is no books in book database");
    }

    void countAllBooksTest() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        boolean condition = bookDatabase.countAllBooks() == 3;
        checkResult(condition, "Count all books");
    }

    void deleteBooksByAuthorSeveralBooksTest() {
        Book book1 = new Book("Bates B., Sierra K.", "Head First Java");
        Book book2 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        Book book3 = new Book("Hunt A., Thomas D.", "The Pragmatic Programmer. From Journeyman to Master");
        Book book4 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship rev 2");
        Book book5 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship rev 3");

        BookDatabase bookDatabase = new BookDatabaseImpl();
        List<Book> booksByAuthor =new ArrayList<>();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        bookDatabase.save(book5);

        bookDatabase.deleteByAuthor("Martin R.");
        boolean condition = bookDatabase.findByAuthor("Martin R.").equals(booksByAuthor) && bookDatabase.countAllBooks() == 2;
        checkResult(condition, "Delete books by author several books");
    }

    void deleteBooksByAuthorNegativeTest() {
        Book book1 = new Book("Bates B., Sierra K.", "Head First Java");
        Book book2 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        Book book3 = new Book("Hunt A., Thomas D.", "The Pragmatic Programmer. From Journeyman to Master");
        Book book4 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship rev 2");
        Book book5 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship rev 3");
        BookDatabase bookDatabase = new BookDatabaseImpl();

        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        bookDatabase.save(book5);

        bookDatabase.deleteByAuthor("Dostoevsky");

        boolean condition = bookDatabase.countAllBooks() == 5;
        checkResult(condition, "Delete books by author negative");
    }

    void deleteBooksByTitleSeveralBooksTest() {
        Book book1 = new Book("Bates B., Sierra K.", "Head First Java");
        Book book2 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        Book book3 = new Book("Hunt A., Thomas D.", "The Pragmatic Programmer. From Journeyman to Master");
        Book book4 = new Book("Marvel R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        Book book5 = new Book("Martin K.", "Clean Code - A Handbook of Agile Software Craftsmanship");

        BookDatabase bookDatabase = new BookDatabaseImpl();
        List<Book> booksWithTitle = new ArrayList<>();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        bookDatabase.save(book5);

        bookDatabase.deleteByTitle("Clean Code - A Handbook of Agile Software Craftsmanship");
        boolean condition = bookDatabase.findByTitle("Clean Code - A Handbook of Agile Software Craftsmanship").equals(booksWithTitle) && bookDatabase.countAllBooks() == 2;
        checkResult(condition, "Delete books by title several books");
    }

    void deleteBooksByTitleNegativeTest() {
        Book book1 = new Book("Bates B., Sierra K.", "Head First Java");
        Book book2 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        Book book3 = new Book("Hunt A., Thomas D.", "The Pragmatic Programmer. From Journeyman to Master");
        Book book4 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship rev 2");
        Book book5 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship rev 3");
        BookDatabase bookDatabase = new BookDatabaseImpl();

        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        bookDatabase.save(book5);

        bookDatabase.deleteByTitle("The Lord Of The Ring");

        boolean condition = bookDatabase.countAllBooks() == 5;
        checkResult(condition, "Delete books by title negative");
    }

    void findPositiveTest() {
        Book book1 = new Book("Bates B., Sierra K.", "Head First Java");
        Book book2 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        Book book3 = new Book("Hunt A., Thomas D.", "The Pragmatic Programmer. From Journeyman to Master");
        Book book4 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship rev 2");
        Book book5 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship rev 3");
        BookDatabase bookDatabase = new BookDatabaseImpl();

        List<Book> list = new ArrayList<>();
        list.add(book3);

        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        bookDatabase.save(book5);

        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Hunt A., Thomas D.");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("The Pragmatic Programmer. From Journeyman to Master");
        SearchCriteria andSearchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);

        boolean condition = bookDatabase.find(andSearchCriteria).equals(list);
        checkResult(condition, "Find positive");
    }

    void findUniqueAuthorsTest() {
        Book book1 = new Book("Bates B., Sierra K.", "Head First Java");
        Book book2 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        Book book3 = new Book("Hunt A., Thomas D.", "The Pragmatic Programmer. From Journeyman to Master");
        Book book4 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship rev 2");
        Book book5 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship rev 3");
        BookDatabase bookDatabase = new BookDatabaseImpl();

        Set<String> authors = new HashSet<>();
        authors.add("Bates B., Sierra K.");
        authors.add("Martin R.");
        authors.add("Hunt A., Thomas D.");

        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        bookDatabase.save(book5);

        boolean condition = bookDatabase.findUniqueAuthors().equals(authors);
        checkResult(condition, "Find unique authors positive");
    }

    void findUniqueTitlesTest() {
        Book book1 = new Book("Bates B., Sierra K.", "Head First Java");
        Book book2 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        Book book3 = new Book("Hunt A., Thomas D.", "The Pragmatic Programmer. From Journeyman to Master");
        Book book4 = new Book("Martin K.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        Book book5 = new Book("Martin L.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        BookDatabase bookDatabase = new BookDatabaseImpl();

        Set<String> titles = new HashSet<>();
        titles.add("Head First Java");
        titles.add("Clean Code - A Handbook of Agile Software Craftsmanship");
        titles.add("The Pragmatic Programmer. From Journeyman to Master");

        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        bookDatabase.save(book5);

        boolean condition = bookDatabase.findUniqueTitles().equals(titles);
        checkResult(condition, "Find unique titles positive");
    }

    void findUniqueBooksTest() {
        Book book1 = new Book("Bates B., Sierra K.", "Head First Java");
        Book book2 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        Book book3 = new Book("Hunt A., Thomas D.", "The Pragmatic Programmer. From Journeyman to Master");
        Book book4 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        Book book5 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        BookDatabase bookDatabase = new BookDatabaseImpl();

        Set<Book> uniqueBooks = new HashSet<>();
        uniqueBooks.add(book1);
        uniqueBooks.add(book2);
        uniqueBooks.add(book3);

        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        bookDatabase.save(book5);

        boolean condition = bookDatabase.findUniqueBooks().equals(uniqueBooks);
        checkResult(condition, "Find unique books positive");
    }

    void containsPositiveTest() {
        Book book1 = new Book("Bates B., Sierra K.", "Head First Java");
        Book book2 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        Book book3 = new Book("Hunt A., Thomas D.", "The Pragmatic Programmer. From Journeyman to Master");
        Book book4 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        Book book5 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        BookDatabase bookDatabase = new BookDatabaseImpl();

        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        bookDatabase.save(book5);

        Book book = new Book("Bates B., Sierra K.", "Head First Java");

        boolean condition = bookDatabase.contains(book);
        checkResult(condition, "Contains positive");
    }

    void containsNegativeTest() {
        Book book1 = new Book("Bates B., Sierra K.", "Head First Java");
        Book book2 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        Book book3 = new Book("Hunt A., Thomas D.", "The Pragmatic Programmer. From Journeyman to Master");
        Book book4 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        Book book5 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        BookDatabase bookDatabase = new BookDatabaseImpl();

        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        bookDatabase.save(book5);

        Book book = new Book("Martin R.", "Head First Java");

        boolean condition = !bookDatabase.contains(book);
        checkResult(condition, "Contains negative");
    }

    void getAuthorToBooksMapTest() {
        Book book1 = new Book("Bates B., Sierra K.", "Head First Java");
        Book book2 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        Book book3 = new Book("Hunt A., Thomas D.", "The Pragmatic Programmer. From Journeyman to Master");
        Book book4 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship rev 2");
        Book book5 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship rev 3");

        List<Book> byBatesBSierraK = new ArrayList<>();
        byBatesBSierraK.add(book1);

        List<Book> byMartinR = new ArrayList<>();
        byMartinR.add(book2);
        byMartinR.add(book4);
        byMartinR.add(book5);

        List<Book> byHuntAThomasD = new ArrayList<>();
        byHuntAThomasD.add(book3);

        Map<String, List<Book>> authorToBooksMap = new HashMap<>();
        authorToBooksMap.put("Bates B., Sierra K.", byBatesBSierraK);
        authorToBooksMap.put("Martin R.", byMartinR);
        authorToBooksMap.put("Hunt A., Thomas D.", byHuntAThomasD);

        BookDatabase bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        bookDatabase.save(book5);

        boolean condition = bookDatabase.getAuthorToBooksMap().equals(authorToBooksMap);
        checkResult(condition, "Get author to books map");
    }

    void getEachAuthorBookCountTest() {
        Book book1 = new Book("Bates B., Sierra K.", "Head First Java");
        Book book2 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        Book book3 = new Book("Hunt A., Thomas D.", "The Pragmatic Programmer. From Journeyman to Master");
        Book book4 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship rev 2");
        Book book5 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship rev 3");
        /*
        List<Book> byBatesBSierraK = new ArrayList<>();
        byBatesBSierraK.add(book1);

        List<Book> byMartinR = new ArrayList<>();
        byMartinR.add(book2);
        byMartinR.add(book4);
        byMartinR.add(book5);

        List<Book> byHuntAThomasD = new ArrayList<>();
        byHuntAThomasD.add(book3);

         */

        Map<String, Integer> eachAuthorBookCount = new HashMap<>();
        eachAuthorBookCount.put("Bates B., Sierra K.", 1);
        eachAuthorBookCount.put("Martin R.", 3);
        eachAuthorBookCount.put("Hunt A., Thomas D.", 1);

        BookDatabase bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        bookDatabase.save(book5);

        boolean condition = bookDatabase.getEachAuthorBookCount().equals(eachAuthorBookCount);
        checkResult(condition, "Get each author unique book count");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }

}
