package student_igors_bartkevics.lesson_10.homework.level_6.task_20;

import java.util.ArrayList;
import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class BookReaderImplTest {

    public static void main(String[] args) {
        BookReaderImplTest test = new BookReaderImplTest();
        test.addPositiveWhenLibraryIsEmptyTest();
        test.addPositiveWhenLibraryIsNotEmptyTest();
        test.addBookThatAlreadyIsInLibraryTest();
        test.addBookWithNoAuthorTest();
        test.addBookWithNoTitleTest();
        test.addBookWithNoTitleAndAuthorTest();
        test.removeBookFromEmptyLibraryTest();
        test.removeBookPositiveWhenLibraryIsNotEmptyTest();
        test.removeBookNegativeWhenLibraryIsNotEmptyTest();
        test.bookLibraryToStringTest();
        test.bookLibraryToStringWhenLibraryIsEmptyTest();
        test.findBooksByAuthorOneBookTest();
        test.findBooksByAuthorSeveralBooksTest();
        test.findBooksByAuthorNegativeTest();
        test.findBooksByAuthorWhenLibraryIsEmptyTest();
        test.findBooksWhichAuthorStartsWithStringPositiveTest();
        test.findBooksWhichAuthorStartsWithStringNegativeTest();
        test.findBooksWhichAuthorStartsWithStringNoLettersTest();
        test.findBooksByTitleOneBookTest();
        test.findBooksByTitleSeveralBooksTest();
        test.findBooksByTitleNegativeTest();
        test.findBooksByTitleWhenLibraryIsEmptyTest();
    }

    void addPositiveWhenLibraryIsEmptyTest() {
        Book book3 = new Book("Hunt A., Thomas D.", "The Pragmatic Programmer. From Journeyman to Master");
        BookReader bookReader = new BookReaderImpl();
        boolean condition = bookReader.addBook(book3);
        checkResult(condition, "Add positive when library is empty");
    }

    void addPositiveWhenLibraryIsNotEmptyTest() {
        Book book1 = new Book("Bates B., Sierra K.", "Head First Java");
        Book book2 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        Book book3 = new Book("Hunt A., Thomas D.", "The Pragmatic Programmer. From Journeyman to Master");
        BookReader bookReader = new BookReaderImpl();
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        checkResult(bookReader.addBook(book3), "Add positive when library is not empty");
    }

    void addBookThatAlreadyIsInLibraryTest() {
        Book book1 = new Book("Bates B., Sierra K.", "Head First Java");
        Book book2 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        BookReader bookReader = new BookReaderImpl();
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        checkResult(!bookReader.addBook(book2), "Add book that already is in library");
    }

    void addBookWithNoAuthorTest() {
        Book book1 = new Book("Bates B., Sierra K.", "Head First Java");
        Book book2 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        Book book3 = new Book("", "The Pragmatic Programmer. From Journeyman to Master");
        BookReader bookReader = new BookReaderImpl();
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        checkResult(!bookReader.addBook(book3), "Add book with no author");
    }

    void addBookWithNoTitleTest() {
        Book book1 = new Book("Bates B., Sierra K.", "Head First Java");
        Book book2 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        Book book3 = new Book("", "The Pragmatic Programmer. From Journeyman to Master");
        BookReader bookReader = new BookReaderImpl();
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        checkResult(!bookReader.addBook(book3), "Add book with no title");
    }

    void addBookWithNoTitleAndAuthorTest() {
        Book book1 = new Book("Bates B., Sierra K.", "Head First Java");
        Book book2 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        Book book3 = new Book("", "");
        BookReader bookReader = new BookReaderImpl();
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        checkResult(!bookReader.addBook(book3), "Add book with no title and author");
    }

    void removeBookFromEmptyLibraryTest() {
        Book book1 = new Book("Bates B., Sierra K.", "Head First Java");
        BookReader bookReader = new BookReaderImpl();
        checkResult(!bookReader.removeBook(book1), "Remove book from empty library");
    }

    void removeBookPositiveWhenLibraryIsNotEmptyTest() {
        Book book1 = new Book("Bates B., Sierra K.", "Head First Java");
        Book book2 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        Book book3 = new Book("Hunt A., Thomas D.", "The Pragmatic Programmer. From Journeyman to Master");
        BookReader bookReader = new BookReaderImpl();
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        bookReader.addBook(book3);
        checkResult(bookReader.removeBook(book2), "Remove book positive when library is not empty");
    }

    void removeBookNegativeWhenLibraryIsNotEmptyTest() {
        Book book1 = new Book("Bates B., Sierra K.", "Head First Java");
        Book book2 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        Book book3 = new Book("Hunt A., Thomas D.", "The Pragmatic Programmer. From Journeyman to Master");
        BookReader bookReader = new BookReaderImpl();
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        checkResult(!bookReader.removeBook(book3), "Remove book negative when library is not empty");
    }

    void bookLibraryToStringTest() {
        Book book1 = new Book("Bates B., Sierra K.", "Head First Java");
        Book book2 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        Book book3 = new Book("Hunt A., Thomas D.", "The Pragmatic Programmer. From Journeyman to Master");
        BookReader bookReader = new BookReaderImpl();
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        bookReader.addBook(book3);
        boolean condition = bookReader.bookLibraryToStringList()[0].equals("Head First Java [Bates B., Sierra K.]") &&
                bookReader.bookLibraryToStringList()[1].equals("Clean Code - A Handbook of Agile Software Craftsmanship [Martin R.]") &&
                bookReader.bookLibraryToStringList()[2].equals("The Pragmatic Programmer. From Journeyman to Master [Hunt A., Thomas D.]") &&
                (bookReader.bookLibraryToStringList().length == 3);
        checkResult(condition, "Book library to string list");
    }

    void bookLibraryToStringWhenLibraryIsEmptyTest() {
        BookReader bookReader = new BookReaderImpl();
        boolean condition = (bookReader.bookLibraryToStringList().length == 0);
        checkResult(condition, "Book library to string list when library is empty");
    }

    void findBooksByAuthorOneBookTest() {
        Book book1 = new Book("Bates B., Sierra K.", "Head First Java");
        Book book2 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        Book book3 = new Book("Hunt A., Thomas D.", "The Pragmatic Programmer. From Journeyman to Master");
        BookReader bookReader = new BookReaderImpl();
        List<Book> booksByAuthor =new ArrayList<>();
        booksByAuthor.add(book2);
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        bookReader.addBook(book3);
        boolean condition = bookReader.findBooksByAuthor("Martin R.").equals(booksByAuthor);
        checkResult(condition, "Find book by author one book");
    }

    void findBooksByAuthorSeveralBooksTest() {
        Book book1 = new Book("Bates B., Sierra K.", "Head First Java");
        Book book2 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        Book book3 = new Book("Hunt A., Thomas D.", "The Pragmatic Programmer. From Journeyman to Master");
        Book book4 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship rev 2");
        Book book5 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship rev 3");
        BookReader bookReader = new BookReaderImpl();
        List<Book> booksByAuthor =new ArrayList<>();
        booksByAuthor.add(book2);
        booksByAuthor.add(book4);
        booksByAuthor.add(book5);
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        bookReader.addBook(book3);
        bookReader.addBook(book4);
        bookReader.addBook(book5);
        boolean condition = bookReader.findBooksByAuthor("Martin R.").equals(booksByAuthor);
        checkResult(condition, "Find book by author several books");
    }

    void findBooksByAuthorNegativeTest() {
        Book book1 = new Book("Bates B., Sierra K.", "Head First Java");
        Book book2 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        Book book3 = new Book("Hunt A., Thomas D.", "The Pragmatic Programmer. From Journeyman to Master");
        Book book4 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship rev 2");
        Book book5 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship rev 3");
        BookReader bookReader = new BookReaderImpl();
        List<Book> booksByAuthor =new ArrayList<>();
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        bookReader.addBook(book3);
        bookReader.addBook(book4);
        bookReader.addBook(book5);
        boolean condition = bookReader.findBooksByAuthor("Dostoevsky").equals(booksByAuthor);
        checkResult(condition, "Find book by author negative");
    }

    void findBooksByAuthorWhenLibraryIsEmptyTest() {
        BookReader bookReader = new BookReaderImpl();
        List<Book> booksByAuthor =new ArrayList<>();
        boolean condition = bookReader.findBooksByAuthor("Martin R.").equals(booksByAuthor);
        checkResult(condition, "Find book by author when library is empty");
    }

    void findBooksWhichAuthorStartsWithStringPositiveTest() {
        Book book1 = new Book("Bates B., Sierra K.", "Head First Java");
        Book book2 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        Book book3 = new Book("Hunt A., Thomas D.", "The Pragmatic Programmer. From Journeyman to Master");
        Book book4 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship rev 2");
        Book book5 = new Book("Marvel T.", "Clean Code - A Handbook of Agile Software Craftsmanship rev 3");
        BookReader bookReader = new BookReaderImpl();
        List<Book> booksByAuthor =new ArrayList<>();
        booksByAuthor.add(book2);
        booksByAuthor.add(book4);
        booksByAuthor.add(book5);
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        bookReader.addBook(book3);
        bookReader.addBook(book4);
        bookReader.addBook(book5);
        boolean condition = bookReader.findBooksWhichAuthorStartsWithString("Mar").equals(booksByAuthor);
        checkResult(condition, "Find books which author starts with string several books positive");
    }

    void findBooksWhichAuthorStartsWithStringNegativeTest() {
        Book book1 = new Book("Bates B., Sierra K.", "Head First Java");
        Book book2 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        Book book3 = new Book("Hunt A., Thomas D.", "The Pragmatic Programmer. From Journeyman to Master");
        Book book4 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship rev 2");
        Book book5 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship rev 3");
        BookReader bookReader = new BookReaderImpl();
        List<Book> booksByAuthor =new ArrayList<>();
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        bookReader.addBook(book3);
        bookReader.addBook(book4);
        bookReader.addBook(book5);
        boolean condition = bookReader.findBooksWhichAuthorStartsWithString("Po").equals(booksByAuthor);
        checkResult(condition, "Find books which author starts with string negative");
    }

    void findBooksWhichAuthorStartsWithStringNoLettersTest() {
        Book book1 = new Book("Bates B., Sierra K.", "Head First Java");
        Book book2 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        Book book3 = new Book("Hunt A., Thomas D.", "The Pragmatic Programmer. From Journeyman to Master");
        Book book4 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship rev 2");
        Book book5 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship rev 3");
        BookReader bookReader = new BookReaderImpl();
        List<Book> booksByAuthor =new ArrayList<>();
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        bookReader.addBook(book3);
        bookReader.addBook(book4);
        bookReader.addBook(book5);
        boolean condition = bookReader.findBooksWhichAuthorStartsWithString("").equals(booksByAuthor);
        checkResult(condition, "Find books which author starts with string No letters");
    }

    void findBooksByTitleOneBookTest() {
        Book book1 = new Book("Bates B., Sierra K.", "Head First Java");
        Book book2 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        Book book3 = new Book("Hunt A., Thomas D.", "The Pragmatic Programmer. From Journeyman to Master");
        BookReader bookReader = new BookReaderImpl();
        List<Book> booksByAuthor =new ArrayList<>();
        booksByAuthor.add(book1);
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        bookReader.addBook(book3);
        boolean condition = bookReader.findBooksByTitle("Head First Java").equals(booksByAuthor);
        checkResult(condition, "Find book by title one book");
    }

    void findBooksByTitleSeveralBooksTest() {
        Book book1 = new Book("Bates B., Sierra K.", "Head First Java");
        Book book2 = new Book("Linc K.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        Book book3 = new Book("Hunt A., Thomas D.", "The Pragmatic Programmer. From Journeyman to Master");
        Book book4 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        Book book5 = new Book("Marvel O.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        BookReader bookReader = new BookReaderImpl();
        List<Book> booksByAuthor =new ArrayList<>();
        booksByAuthor.add(book2);
        booksByAuthor.add(book4);
        booksByAuthor.add(book5);
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        bookReader.addBook(book3);
        bookReader.addBook(book4);
        bookReader.addBook(book5);
        boolean condition = bookReader.findBooksByTitle("Clean Code - A Handbook of Agile Software Craftsmanship").equals(booksByAuthor);
        checkResult(condition, "Find book by title several books");
    }

    void findBooksByTitleNegativeTest() {
        Book book1 = new Book("Bates B., Sierra K.", "Head First Java");
        Book book2 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        Book book3 = new Book("Hunt A., Thomas D.", "The Pragmatic Programmer. From Journeyman to Master");
        Book book4 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship rev 2");
        Book book5 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship rev 3");
        BookReader bookReader = new BookReaderImpl();
        List<Book> booksByAuthor =new ArrayList<>();
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        bookReader.addBook(book3);
        bookReader.addBook(book4);
        bookReader.addBook(book5);
        boolean condition = bookReader.findBooksByTitle("The Lord of the ring").equals(booksByAuthor);
        checkResult(condition, "Find book by title negative");
    }

    void findBooksByTitleWhenLibraryIsEmptyTest() {
        BookReader bookReader = new BookReaderImpl();
        List<Book> booksByAuthor =new ArrayList<>();
        boolean condition = bookReader.findBooksByTitle("Clean Code - A Handbook of Agile Software Craftsmanship").equals(booksByAuthor);
        checkResult(condition, "Find book by title when library is empty");
    }



    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }
}
