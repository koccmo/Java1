package student_volodya_danilin.lesson_11.level_2.Task_6;

import java.util.Optional;

class DemoTest {

    public static void main(String[] args) {

        BookDatabaseImpl database = new BookDatabaseImpl();
        Book book1 = new Book("автор1", "книга1");
        Book book2 = new Book("автор2", "книга2");
        Book book3 = new Book("автор3", "книга3");
        Book book4 = new Book("автор4", "книга4");

        System.out.println("\nTest 1 \nLong save(Book book)");
        if (database.save(book1).equals(1L)
        && database.save(book2).equals(2L)
        && database.save(book3).equals(3L)) {
            System.out.println("Test OK, saved 3 books!");
        }
        else {
            System.out.println("########## TEST FAIL ##########");
        }

        System.out.println("\nTest 2 \nboolean delete(Long bookId)");
        if (database.delete(2L)
        && !database.delete(4L)) {
            System.out.println("Test OK, deleted book2 by bookId2 from database!");
            System.out.println("Test OK, could not delete bookId4!");
        }
        else {
            System.out.println("########## TEST FAIL ##########");
        }

        System.out.println("\nTest 3 \nboolean delete(Book book)");
        if (database.delete(book1)
        && !database.delete(book4)) {
            System.out.println("Test OK, deleted book1 from database!");
            System.out.println("Test OK, could not delete book4!");
        }
        else {
            System.out.println("########## TEST FAIL ##########");
        }

        System.out.println("\nTest 4 \nOptional<Book> findById(Long bookId)");
        Optional<Book> foundBookOpt = database.findById(3L);
        if (foundBookOpt.isPresent()) {
            Book foundBook = foundBookOpt.get();
            if (foundBook.getAuthor().equals(book3.getAuthor())
            && foundBook.getTitle().equals(book3.getTitle())) {
                System.out.println("Test OK, got correct book!");
            }
            else {
                System.out.println("Returned Optional is incorrect!");
                System.out.println("########## TEST FAIL ##########");
            }
        }
        else {
            System.out.println("Returned Optional is empty!");
            System.out.println("########## TEST FAIL ##########");
        }




    }

}
