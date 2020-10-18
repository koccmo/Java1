package student_jaroslav_brutan.lesson_10.day_6;

public class BookReaderImplTest {

    public static void main(String[] args) {
        BookReaderImplTest test = new BookReaderImplTest();
        test.addBookTest();
        test.deleteBookTest();
        test.allLibraryBooksTest();
        test.findBooksByAuthorTest();
        test.findBooksByTitleTest();
        test.readBooksTest();
        test.notReadBooksTest();
    }

    public void addBookTest(){
        BookReaderImpl bookReader = new BookReaderImpl();
        Book book1 = new Book("Harry Potter", "J.K.Rowling");
        bookReader.addBook(book1);
        Book book2 = new Book("The Hobbit", "J.R.R.Tolkien");
        boolean result = bookReader.addBook(book2);
        if (result){
            System.out.println("Test - OK!");
        } else {
            System.out.println("Test - FAIL!");
        }
        }

    public void deleteBookTest(){
        BookReaderImpl bookReader = new BookReaderImpl();
        Book book1 = new Book("Harry Potter", "J.K.Rowling");
        bookReader.addBook(book1);
        Book book2 = new Book("The Hobbit", "J.R.R.Tolkien");
        bookReader.addBook(book2);
        boolean result = bookReader.deleteBook(book1);
        if (result){
            System.out.println("Test - OK!");
        } else {
            System.out.println("Test - FAIL!");
        }
    }

    public void allLibraryBooksTest(){
        BookReaderImpl bookReader = new BookReaderImpl();
        Book book1 = new Book("Harry Potter", "J.K.Rowling");
        bookReader.addBook(book1);
        Book book2 = new Book("The Hobbit", "J.R.R.Tolkien");
        bookReader.addBook(book2);
        Book book3 = new Book("The Little Prince", "Antoine de Saint-Exupery");
        bookReader.addBook(book3);
        Book book4 = new Book("Grimm's Fairy Tales", "Brothers Grimm");
        bookReader.addBook(book4);
        System.out.println("All library books: ");
        bookReader.allLibraryBooks();
    }

    public void findBooksByAuthorTest(){
        BookReaderImpl bookReader = new BookReaderImpl();
        Book book1 = new Book("Harry Potter", "J.K.Rowling");
        bookReader.addBook(book1);
        Book book2 = new Book("The Hobbit", "J.R.R.Tolkien");
        bookReader.addBook(book2);
        Book book3 = new Book("The Little Prince", "Antoine de Saint-Exupery");
        bookReader.addBook(book3);
        Book oneAuthorBooks = (Book) bookReader.findBookByAuthor("J.R.R.Tolkien");
        if (oneAuthorBooks.equals(book2)){
            System.out.println("Test - OK@");
        } else {
            System.out.println("Test - FAIL!");
        }
    }

    public void findBooksByTitleTest(){
        BookReaderImpl bookReader = new BookReaderImpl();
        Book book1 = new Book("Harry Potter", "J.K.Rowling");
        bookReader.addBook(book1);
        Book book2 = new Book("The Hobbit", "J.R.R.Tolkien");
        bookReader.addBook(book2);
        Book book3 = new Book("The Little Prince", "Antoine de Saint-Exupery");
        bookReader.addBook(book3);
        Book oneTitleBooks = (Book) bookReader.findBookByTitle("Harry Potter");
        if (oneTitleBooks.equals(book1)){
            System.out.println("Test - OK!");
        } else {
            System.out.println("Test - FAIL!");
        }
    }

    public void readBooksTest(){
        BookReaderImpl bookReader = new BookReaderImpl();
        Book book1 = new Book("Harry Potter", "J.K.Rowling");
        bookReader.addBook(book1);
        Book book2 = new Book("The Hobbit", "J.R.R.Tolkien");
        bookReader.addBook(book2);
        Book book3 = new Book("The Little Prince", "Antoine de Saint-Exupery");
        bookReader.addBook(book3);
        bookReader.isRead(book3);
        System.out.println("Books which are already read from current library: ");
        bookReader.allReadBooks();
        System.out.println();
    }

    public void notReadBooksTest(){
        BookReaderImpl bookReader = new BookReaderImpl();
        Book book1 = new Book("Harry Potter", "J.K.Rowling");
        bookReader.addBook(book1);
        Book book2 = new Book("The Hobbit", "J.R.R.Tolkien");
        bookReader.addBook(book2);
        Book book3 = new Book("The Little Prince", "Antoine de Saint-Exupery");
        bookReader.addBook(book3);
        bookReader.isNotRead(book1);
        bookReader.isNotRead(book2);
        System.out.println("Books which are not read from current library: ");
        bookReader.allNotReadBooks();
    }
}
