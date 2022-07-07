package roman.lesson_10.day_6.task_16;



public class BookReaderImplTest {
    public static void main(String[] args) {
        BookReaderImplTest test = new BookReaderImplTest();
        test.addNegativeBookNoTitle();
        test.addNegativeBookNoAuthor();
        test.addBookEmptyLibrary();
        test.addBookThenLibraryNotEmpty();
        test.addBookThatAlreadyInLibrary();
        test.negativeRemoveNotFullyFilledBookFromLibrary();
        test.removeBookFromEmptyLibrary();
        test.positiveRemoveBookFromLibrary();
    }

    public void positiveRemoveBookFromLibrary() {
        Book never = new Book("L.Green", "Never");
        BookReaderImpl library = new BookReaderImpl();
        library.addBook(never);
        checkResult(library.removeBook(never), "Remove Book From Library");
    }

    public void removeBookFromEmptyLibrary() {
        Book go = new Book("G.Man", "Go");
        BookReaderImpl library = new BookReaderImpl();
        checkResult(!library.removeBook(go), "Remove book from empty library");
    }

    public void negativeRemoveNotFullyFilledBookFromLibrary() {
        Book hope = new Book("J.Joung", "Hope");
        Book noTitle = new Book("J.Joung", "");
        BookReaderImpl library = new BookReaderImpl();
        library.addBook(hope);
        checkResult(!library.removeBook(noTitle), "Remove ni title book from library");

    }

    public void addBookThatAlreadyInLibrary() {
        Book tryst = new Book("Vladek Piatok", "Tryst");
        Book nasty = new Book("Marina Truba", "Nasty");
        Book pretty = new Book("Tatjana Pipita", "Pretty");
        BookReaderImpl library = new BookReaderImpl();
        library.addBook(tryst);
        library.addBook(nasty);
        library.addBook(pretty);
        checkResult(!library.addBook(nasty), "Add book what is already in library");
    }

    public void addBookThenLibraryNotEmpty() {
        Book tabu = new Book("Nikolaj", "Tabu");
        Book marketing = new Book("Stella Petrova", "My Marketing");
        Book home = new Book("Alex Podubnuj", "Home");
        BookReaderImpl library = new BookReaderImpl();
        library.addBook(tabu);
        library.addBook(marketing);
        checkResult(library.addBook(home), "Add book then library not empty");

    }

    public void addBookEmptyLibrary() {
        Book cooking = new Book("J.Oliver", "I love cooking");
        BookReaderImpl library = new BookReaderImpl();
        checkResult(library.addBook(cooking), "Add book in empty library");
    }

    public void addNegativeBookNoAuthor() {
        Book noAuthor = new Book("", "Peace in World");
        BookReaderImpl library = new BookReaderImpl();
        checkResult(!library.addBook(noAuthor), "Book no Author");
    }

    public void addNegativeBookNoTitle() {
        Book noTitle = new Book("James", "");
        BookReaderImpl library = new BookReaderImpl();
        checkResult(!library.addBook(noTitle), "Book no Title");
    }

    public void checkResult(boolean condition, String nameOfTest) {
        if(condition) {
            System.out.println(nameOfTest + " test = OK!");
        } else System.out.println(nameOfTest + " test = FAIL!");
    }
}
