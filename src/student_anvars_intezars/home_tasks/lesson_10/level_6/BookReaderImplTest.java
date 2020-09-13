package student_anvars_intezars.home_tasks.lesson_10.level_6;

class BookReaderImplTest {

    public static void main(String[] args) {

        BookReaderImplTest bookReaderImplTest = new BookReaderImplTest();
        bookReaderImplTest.toAddNewBookTest1();
        bookReaderImplTest.toAddNewBookTest2NegativeResult();
        bookReaderImplTest.toAddNewBookTest3();
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
}
