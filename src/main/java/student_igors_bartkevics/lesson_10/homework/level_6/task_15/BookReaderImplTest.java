package student_igors_bartkevics.lesson_10.homework.level_6.task_15;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class
BookReaderImplTest {

    public static void main(String[] args) {
        BookReaderImplTest test = new BookReaderImplTest();
        test.addPositiveWhenLibraryIsEmptyTest();
        test.addPositiveWhenLibraryIsNotEmptyTest();
        test.addBookThatAlreadyIsInLibraryTest();
        test.addBookWithNoAuthorTest();
        test.addBookWithNoTitleTest();
        test.addBookWithNoTitleAndAuthorTest();
    }

    void addPositiveWhenLibraryIsEmptyTest() {
        Book book3 = new Book("Hunt A., Thomas D.", "The Pragmatic Programmer. From Journeyman to Master");
        BookReader bookReader = new BookReaderImpl();
        checkResult(bookReader.addBook(book3), "Add positive when library is empty");
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

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }
}
