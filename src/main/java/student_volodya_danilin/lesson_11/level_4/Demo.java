package student_volodya_danilin.lesson_11.level_4;

import java.util.Set;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Demo {

    public static void main(String[] args) {

        Set<String> setForTests;
        Set<Book> bookSetForTests;

        Book book1 = new Book("Alex", "TestTitle");
        Book book2 = new Book("Alex", "OtherTestTitle");
        Book book3 = new Book("Bob", "TestTitle");
        Book book4 = new Book("Bob", "OtherTestTitle");
        Book book5 = new Book("Russell", "TestTitle");

        BookDatabaseImpl database = new BookDatabaseImpl();
        database.save(book1);
        database.save(book2);
        database.save(book3);
        database.save(book4);
        database.save(book5);

        System.out.println("\nTest 1 (Task_23)");
        setForTests = database.findUniqueAuthors();
        for (String value : setForTests) {
            System.out.println(value);
        }
        if (setForTests.size() == 3) {
            System.out.println("Test 1 OK");
        }

        System.out.println("\nTest 2 (Task_24)");
        setForTests = database.findUniqueTitles();
        for (String value : setForTests) {
            System.out.println(value);
        }
        if (setForTests.size() == 2) {
            System.out.println("Test 2 OK");
        }

        System.out.println("\nTest 3 (Task_25)");
        database.save(book1);
        database.save(book1);
        database.save(book1);

        bookSetForTests = database.findUniqueBooks();
        for (Book value : bookSetForTests) {
            value.printBookInfo();
        }
        if (bookSetForTests.size() == 5) {
            System.out.println("Test 3 OK");
        }


        System.out.println("\nTest 4 (Task_26)");
        Book book1000 = new Book("not in database", "not in database");
        if (database.contains(book1)) {
            if (!database.contains(book1000)) {
                System.out.println("Test 4 OK");
            }
        }
    }
}
