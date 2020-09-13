package student_volodya_danilin.lesson_11.level_2.Task_6;

import student_volodya_danilin.lesson_10.level_3.Task_10.DatabaseImpl;

import java.util.List;
import java.util.Optional;

class DemoTest {

    public static void main(String[] args) {

        BookDatabaseImpl database = new BookDatabaseImpl();

        Book book1 = new Book("Другой автор", "Книга про книгу");
        Book book2 = new Book("Другой автор", "Книга про книгу");
        Book book3 = new Book("Другой автор", "Книга про книгу");
        Book book4 = new Book("тестов для", "Книга про книгу");
        Book book5 = new Book("Автор для тестов", "книга 5");
        Book book6 = new Book("Автор для тестов", "книга 6");
        Book book7 = new Book("Автор для тестов", "книга 7");

        System.out.println("\nTest 1 \nLong save(Book book)");
        if (database.save(book1).equals(1L)
        && database.save(book2).equals(2L)
        && database.save(book3).equals(3L)) {
            System.out.println("Test OK, saved 3 books!");
        }
        else {
            System.out.println("########## TEST FAIL ##########");
        }

        database.printBookList();
        System.out.println("\nTest 2 \nboolean delete(Long bookId)");
        if (database.delete(2L)
        && !database.delete(4L)) {
            System.out.println("Test OK, deleted book2 by bookId2 from database!");
            System.out.println("Test OK, could not delete bookId4!");
        }
        else {
            System.out.println("########## TEST FAIL ##########");
        }

        database.printBookList();
        System.out.println("\nTest 3 \nboolean delete(Book book)");
        if (database.delete(book1)
        && !database.delete(book4)) {
            System.out.println("Test OK, deleted book1 from database!");
            System.out.println("Test OK, could not delete book4!");
        }
        else {
            System.out.println("########## TEST FAIL ##########");
        }

        database.printBookList();
        System.out.println("\nTest 4 \nOptional<Book> findById(Long bookId)");
        Optional<Book> foundBookOpt = database.findById(3L); //Looking for book3
        if (foundBookOpt.isPresent()) {
            Book foundBook = foundBookOpt.get();
            if (foundBook.getAuthor().equals(book3.getAuthor())
            && foundBook.getTitle().equals(book3.getTitle())) {
                System.out.println("Test OK, got correct book!");
            }
            else {
                System.out.println("Returned Optional is incorrect book!");
                System.out.println("########## TEST FAIL ##########");
            }
        }
        else {
            System.out.println("Returned Optional is empty!");
            System.out.println("########## TEST FAIL ##########");
        }

        database = prepareDatabase(database);

        System.out.println("\nTest 5 \nList<Book> findByAuthor(String author)");
        List<Book> foundList = database.findByAuthor("Автор");
        System.out.println("Searching for author 'Автор' got : ");
        for (Book value : foundList) {
            value.printBookInfo();
        }

        System.out.print("\nTest 6");
        System.out.println(" List<Book> findByTitle(String title);");
        foundList = database.findByTitle("Книга");
        System.out.println("Searching for title 'Книга' got : ");
        for (Book value : foundList) {
            value.printBookInfo();
        }

        System.out.print("\nTest 7");
        System.out.println(" int countAllBooks()");
        database.printBookList();
        System.out.print("Number of books in database : ");
        System.out.println(database.countAllBooks());
        if (database.countAllBooks() == 7) {
            System.out.println("Test OK");
        }

        System.out.print("\nTest 8");
        System.out.println(" void deleteByAuthor(String author)");
        System.out.println("Deleting all books by 'Другой' ... ");
        database.deleteByAuthor("Другой");
        database.printBookList();
        if (database.findByAuthor("Другой").isEmpty()) {
            System.out.println("Test OK");
        }

        prepareDatabase(database);

        System.out.println("\nTest 9");
        System.out.println("void deleteByTitle(String title)");
        System.out.println("Deleting all books titled 'книгу'... ");
        database.deleteByTitle("книгу");
        database.printBookList();
        if (database.findByTitle("книгу").isEmpty()) {
            System.out.println("Test OK");
        }

    }

    static BookDatabaseImpl prepareDatabase(BookDatabaseImpl database) {
        System.out.println("preparing database for tests ...");
        database.clearStorage();
        Book book1 = new Book("Другой автор", "Книга про книгу");
        Book book2 = new Book("Другой автор", "Книга про книгу");
        Book book3 = new Book("Другой автор", "Книга про книгу");
        Book book4 = new Book("Просто автор", "Книга про книгу");
        Book book5 = new Book("Автор для тестов", "книга 5");
        Book book6 = new Book("Автор для тестов", "книга 6");
        Book book7 = new Book("Автор для тестов", "книга 7");
        database.save(book1);
        database.save(book2);
        database.save(book3);
        database.save(book4);
        database.save(book5);
        database.save(book6);
        database.save(book7);
        database.printBookList();
        return database;
    }

}
