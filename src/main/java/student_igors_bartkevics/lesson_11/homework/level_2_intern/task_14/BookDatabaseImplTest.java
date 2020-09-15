package student_igors_bartkevics.lesson_11.homework.level_2_intern.task_14;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }

}
