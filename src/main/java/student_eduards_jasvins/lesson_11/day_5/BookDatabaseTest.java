package student_eduards_jasvins.lesson_11.day_5;

import java.util.*;

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
        test.findUniqeAuthors();
        test.findUniqueTitles();
        test.findUniqueBooks();
        test.containsTest();
        test.authorToBookMap();
        test.eachAuthorBookCount();

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

    void findUniqeAuthors() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Set<String> authors = new HashSet<>();

        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);

        authors.add("Eduards J.");
        authors.add("Eduards Z.");
        authors.add("Eduards S.");

        boolean condition = bookDatabase.findUniqueAuthors().equals(authors);
        checkResult("Unique Authors Test ", condition);
    }

    void findUniqueTitles() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Set <String> titles = new HashSet<>();

        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);

        titles.add("YAAAAAAY!");
        titles.add("YAAAY!");
        titles.add("YAAAAAY!");
        titles.add("YAAAAAY1");

        boolean condition = bookDatabase.findUniqueTitles().equals(titles);
        checkResult("Unique Titles Test ", condition);
    }

    void findUniqueBooks() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Set <Book> books = new HashSet<>();

        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);

        books.add(book1);
        books.add(book2);
        books.add(book3);

        boolean condition = bookDatabase.findUniqueBooks().equals(books);
        checkResult("Unique Books Test ", condition);
    }

    void containsTest() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);

        Book book = new Book("Eduards J.", "YAAAAAAY!" );

        boolean condition = bookDatabase.contains(book);
        checkResult("Contains Test ", condition);
    }

    void authorToBookMap() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);

        List <Book> booksEduardsJ = new ArrayList<>();
        booksEduardsJ.add(book1);

        List <Book> booksEduardsS = new ArrayList<>();
        booksEduardsS.add(book2);

        List <Book> booksEduardsZ = new ArrayList<>();
        booksEduardsZ.add(book3);
        booksEduardsZ.add(book4);

        Map<String, List<Book>>authorToBookMaps = new HashMap<>();
        authorToBookMaps.put("Eduards J.", booksEduardsJ);
        authorToBookMaps.put("Eduards S.", booksEduardsS);
        authorToBookMaps.put("Eduards Z.", booksEduardsZ);

        boolean condition = bookDatabase.getAuthorToBooksMap().equals(authorToBookMaps);
        checkResult("Author to book map Test ", condition);
    }

    void eachAuthorBookCount() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);

        Map<String, Integer> eachAuthorBook = new HashMap<>();
        eachAuthorBook.put("Eduards J.", 1);
        eachAuthorBook.put("Eduards S.", 1);
        eachAuthorBook.put("Eduards Z.", 2);

        boolean condition = bookDatabase.getEachAuthorBookCount().equals(eachAuthorBook);
        checkResult("Each author book count ", condition);
    }
}
