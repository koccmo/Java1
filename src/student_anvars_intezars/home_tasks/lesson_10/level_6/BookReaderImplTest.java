package student_anvars_intezars.home_tasks.lesson_10.level_6;

class BookReaderImplTest {

    public static void main(String[] args) {

        BookReaderImplTest bookReaderImplTest = new BookReaderImplTest();
        bookReaderImplTest.toAddNewBookTest1();
        bookReaderImplTest.toAddNewBookTest2NegativeResult();
        bookReaderImplTest.toAddNewBookTest3();
        bookReaderImplTest.newBookWithoutTitleTest();
        bookReaderImplTest.newBookWithoutAuthorTest();
        bookReaderImplTest.deletingBookTest();
        bookReaderImplTest.printListOfBooksInLibraryTest();
    }

    void toAddNewBookTest1() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book firstBook = new Book("Lord of the Rings","Tolkien");
        bookReader.save(firstBook);
        Book secondBook = new Book("Harry Potter","Rowling");
        boolean result = bookReader.isAddedBook(secondBook);
        if (result) {
            System.out.println("Test for adding new book to library = OK");
        } else {
            System.out.println("Test for adding new book library = FAIL");
        }
    }

    void toAddNewBookTest2NegativeResult() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book firstBook = new Book("Lord of the Rings","Tolkien");
        bookReader.save(firstBook);
        Book secondBook = new Book("Lord of the Rings","Tolkien");
        boolean result = bookReader.isAddedBook(secondBook);
        if (result) {
            System.out.println("Test2 for adding new book to library = OK");
        } else {
            System.out.println("Test2 for adding new book library = FAIL");
        }
    }

    void toAddNewBookTest3() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book firstBook = new Book("Lord of the Rings","Tolkien");
        bookReader.save(firstBook);
        Book secondBook = new Book("Lord of the Rings","Anvar");
        boolean result = bookReader.isAddedBook(secondBook);
        if (result) {
            System.out.println("Tes3 for adding new book to library = OK");
        } else {
            System.out.println("Test3 for adding new book library = FAIL");
        }
    }

    void newBookWithoutTitleTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book firstBook = new Book("Lord of the Rings","Tolkien");
        bookReader.save(firstBook);
        Book secondBook = new Book("","Anvar");
        boolean result = bookReader.isAddedBook(secondBook);
        if (result) {
            System.out.println("Tes4 for adding new book to library = OK");
        } else {
            System.out.println("Test4 for adding new book library = FAIL(missing title)");
        }
    }

    void newBookWithoutAuthorTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book firstBook = new Book("Lord of the Rings","Tolkien");
        bookReader.save(firstBook);
        Book secondBook = new Book("Lord of the Rings","");
        boolean result = bookReader.isAddedBook(secondBook);
        if (result) {
            System.out.println("Test5 for adding new book to library = OK");
        } else {
            System.out.println("Test5 for adding new book library = FAIL(missing author)");
        }
    }

    void deletingBookTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book firstBook = new Book("Lord of the Rings","Tolkien");
        bookReader.save(firstBook);
        Book secondBook = new Book("Harry Potter","Rowling");
        bookReader.save(secondBook);
        boolean result = bookReader.delete(firstBook);
        if (result) {
            System.out.println("Test6 for deleting book in library = OK");
        } else {
            System.out.println("Test6 for deleting book in library = FAIL");
        }
    }

    void printListOfBooksInLibraryTest() {
            BookReaderImpl bookReader = new BookReaderImpl();
            Book firstBook = new Book("Lord of the Rings","Tolkien");
            bookReader.save(firstBook);
            Book secondBook = new Book("Black Swan","Nassim Nicholas Taleb");
            bookReader.save(secondBook);
            Book thirdBook = new Book("Elon Musk","Ashley Vans");
            bookReader.save(thirdBook);
            bookReader.printListOfBooks();
        }
    }
