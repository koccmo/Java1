package student_dmitrijs_jasvins.lesson_11.day_3;

import java.util.ArrayList;
import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class BookDatabaseTest {
    public static void main(String[] args) {
        BookDatabaseTest test = new BookDatabaseTest();
        test.save();
        test.deleteById();
        test.deleteByObject();
        test.findById();
        test.findByAuthor();
        test.findByTitle();
        test.countAllBook();
        test.deleteByAuthor();
        test.deleteByTitle();
        test.findBook();

    }

    void checkResult (String name, boolean condition) {
        if (condition) {
            System.out.println(name + "= OK. ");
        } else {
            System.out.println(name + "= Fail. ");
        }
    }

    Book book1 = new Book("Eduards J.", "YAAAAAAY!");
    Book book2 = new Book("Eduards S.", "YAAAY!");
    Book book3 = new Book("Eduards Z.", "YAAAAAY!");
    Book book4 = new Book("Eduards Z.", "YAAAAAY1!");

    void save() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Long currentId = bookDatabase.save(book1);

        checkResult("Save Test ", currentId.equals(1L));
    }

    void deleteById() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);

        checkResult("Delete by ID Test ", bookDatabase.delete(2L));
    }

    void deleteByObject() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);

        checkResult("Delete Test ", bookDatabase.delete(book3));
    }

    void findById() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);

        Book foundBook = bookDatabase.findById(2L).get();
        boolean condition = foundBook.equals(book3);

        checkResult("Find by ID Test ", condition);

    }

    void findByAuthor() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        List <Book> books = new ArrayList<>();
        books.add(book4);
        books.add(book3);
        bookDatabase.save(book1);
        bookDatabase.save(book3);
        bookDatabase.save(book2);
        bookDatabase.save(book4);

        boolean condition = bookDatabase.findByAuthor("Eduards Z.").equals(books);
        checkResult("Find by Author Test ", condition);
    }

    void findByTitle() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        List <Book> books = new ArrayList<>();
        books.add(book4);
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);

        boolean condition = bookDatabase.findByTitle("YAAAAAY1!").equals(books);
        checkResult("Find by Title Test ", condition);
    }

    void countAllBook() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);

        boolean condition = bookDatabase.countAllBooks() == 3;
        checkResult("Count all book Test ", condition);
    }

    void deleteByAuthor() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        List <Book> bookAuthor = new ArrayList<>();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);

        bookDatabase.deleteByAuthor("Eduards J.");
        boolean condition = bookDatabase.findByAuthor("Eduards J.").equals(bookAuthor);
        checkResult("Delete By Author Test ", condition);
    }

    void deleteByTitle() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        List <Book> bookTitle = new ArrayList<>();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);


        bookDatabase.deleteByTitle("YAAAY!");
        boolean condition = bookDatabase.findByTitle("YAAAY!").equals(bookTitle);
        checkResult("Delete By Title Test ", condition);
    }

    void findBook() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        List <Book> find = new ArrayList<>();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        find.add(book3);

        SearchCriteria author = new AuthorSearchCriteria("Eduards Z.");
        SearchCriteria title = new TitleSearchCriteria("YAAAAAY!");
        SearchCriteria search = new AndSearchCriteria(author, title);

        boolean condition = bookDatabase.find(search).equals(find);
        checkResult("Find book Test ", condition);

    }
}
