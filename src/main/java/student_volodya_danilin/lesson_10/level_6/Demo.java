package student_volodya_danilin.lesson_10.level_6;

import java.util.ArrayList;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Demo {

    public static void main(String[] args) {

        System.out.println("\nStarting new tests ... ");


        BookReaderImpl bReader = new BookReaderImpl();
        ArrayList<Book> listForTests;

        System.out.println("\nTest 1, testing .addBook \n.isDuplicate method");
        System.out.println("Creating book1 and book2, \nbook1 == book2 ... ");
        Book book1 = new Book("TestAuthor", "TestTitle");
        Book book2 = new Book("TestAuthor", "TestTitle");

        System.out.println("Adding book1 to database ... ");
        if (bReader.addBook(book1)) {
            System.out.println("Book added!");
        }
        else {
            System.out.println("Failed to add book1!");
        }

        System.out.println("Trying to add book2 to database ... ");
        if (!bReader.addBook(book2)) {
            System.out.println("Test OK");
        }
        else {
            System.out.println("Test 1 FAIL");
        }

        System.out.println("\nTest 2, testing .isEmptyBookInfo");
        System.out.println("Creating book 3 and book4");
        System.out.println("book3.author is empty, book4.title is blank");
        Book book3 = new Book ("", "title");
        Book book4 = new Book ("author", "    ");

        System.out.println("Trying to add book3 and book4 ... ");
        if (!bReader.addBook(book3) && !bReader.addBook(book4)) {
            System.out.println("Test 2 OK");
        }

        System.out.println("\nTest 3, testing .removeBook");
        System.out.println("Deleting book1 ... ");
        System.out.println("Book deleted : " + bReader.removeBook(book1));

        System.out.println("Trying to delete book1 again ... ");
        if (!bReader.removeBook(book1)) {
            System.out.println("Book deleted : " + bReader.removeBook(book1));
            System.out.println("Test OK");
        }

        System.out.println("\nTest 4, testing .printBookList");
        System.out.println("Adding more books to database ... ");
        Book book5 = new Book("Жюль Верн", "Таинственный остров");
        Book book6 = new Book("Жюль Жюль", "Таинственный Жюль");
        Book book7 = new Book("Жюль Верн", "Вокруг света за 80 дней");
        Book book8 = new Book("Коля Верн", "Java штучки");
        Book book9 = new Book("Jo", "Таинственный остров");
        bReader.addBook(book5, book6, book7, book8, book9);
        bReader.printBookList();

        System.out.println("\nTest 5, testing .authorSearchExact");
        System.out.print("Searching for author 'Жюль Верн' ... ");
        listForTests = bReader.authorSearchExact("Жюль Верн");
        if (!listForTests.isEmpty()) {
            System.out.println("Test OK");
        }
        for (Book value : listForTests) {
            value.printBookInfo();
        }
        System.out.println("\nSearching for non-existent author ... ");
        ArrayList<Book> impossible = bReader.authorSearchExact("Non existent author");
        if (impossible.isEmpty()) {
            System.out.println("Test OK");
        }

        System.out.println("\nTest 6, testing .authorSearchStartsWith");
        System.out.println("Searching for author 'Жюль' ... ");
        listForTests = bReader.authorSearchStartsWith("Жюль");
        for (Book value : listForTests) {
            value.printBookInfo();
        }

        System.out.println("\nTest 7, testing .titleSearchExact");
        System.out.println("Searching for title 'Таинственный остров' ... ");
        listForTests = bReader.titleSearchExact("Таинственный остров");
        for (Book value : listForTests) {
            value.printBookInfo();
        }

        System.out.println("\nTest 8, testing .titleSearchStartsWith");
        System.out.println("Searching for title 'Таинственный' ... ");
        listForTests = bReader.titleSearchStartsWith("Таинственный");
        for (Book value : listForTests) {
            value.printBookInfo();
        }

        System.out.println("\nTest 9, testing .setIsReadTrue");
        book5.printPersonalBookInfo();
        System.out.println("Reading book ... ");
        if (bReader.setIsReadTrue(book5)) {
            book5.printPersonalBookInfo();
            System.out.println("Test OK");
        }
        else {
            System.out.println("Test FAIL");
        }

        System.out.println("Trying to read non existent book ... ");
        if (!bReader.setIsReadTrue(book1)) {
            System.out.println("Test OK");
        }
        else {
            System.out.println("Test FAIL");
        }

        System.out.println("\nTest 10, testing .setIsReadFalse");
        book5.printPersonalBookInfo();
        if (bReader.setIsReadFalse(book5)) {
            System.out.println("Unreading the book ... ");
            book5.printPersonalBookInfo();
            System.out.println("Test OK");
        }
        else {
            System.out.println("Test FAIL");
        }
        System.out.println("Trying to unread non-existent book ... ");
        if (!bReader.setIsReadFalse(book1)) {
            System.out.println("Test OK");
        }
        else {
            System.out.println("Test FAIL");
        }

        System.out.println("\nTest 11, testing .printReadBooks");
        System.out.println("Reading book6, book7, book8 ... ");
        bReader.setIsReadTrue(book6, book7, book8);
        bReader.printReadBooks();

        System.out.println("\nTest 12, testing .printUnreadBooks");
        bReader.printUnreadBooks();
    }


}
