package student_volodya_danilin.lesson_10.level_6;

import student_eduards_jasvins.lesson_6.day_4.For;

import java.util.ArrayList;

class Demo {

    public static void main(String[] args) {

        System.out.println("\nStarting new tests ... ");


        BookReaderImpl bReader = new BookReaderImpl();
        ArrayList<Book> listForTests;

        System.out.println("\nTest 1, testing .isDuplicateBook");
        System.out.println("Creating book1 and book2, \nbook1 == book2 ... ");
        Book book1 = new Book("TestAuthor", "TestTitle");
        Book book2 = new Book("TestAuthor", "TestTitle");

        System.out.println("Adding book1 to database ... ");
        bReader.addBook(book1);

        System.out.println("Trying to add book2 to database ... ");
        if (!bReader.canAddBook(book2)) {
            System.out.println("Test 1 OK");
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
        if (!bReader.canAddBook(book3) && !bReader.canAddBook(book4)) {
            System.out.println("Test 2 OK");
        }

        System.out.println("\nTest 3, testing .canRemoveBook");
        System.out.println("Deleting book1 ... ");
        bReader.removeBook(book1);

        System.out.println("Trying to delete book1 again ... ");
        if (!bReader.canRemoveBook(book1)) {
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
    }


}
