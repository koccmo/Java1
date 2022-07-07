package roman.lesson_10.day_6.task_14;

public class BookReaderImplTest {
    public static void main(String[] args) {
        BookReaderImplTest test = new BookReaderImplTest();
        test.notFilledBook();
        test.filledBook();
        test.checkIfListContainBook();
        test.rightToAddBook();
        test.addBookFail();
        test.addBookOk();
    }

    Book emptyBook = new Book("", "");
    Book alphabet = new Book("Klaus", "Alphabet");
    Book war = new Book("Klopp", "War");

    BookReaderImpl library = new BookReaderImpl();

    public void addBookOk() {
        library.addBook(alphabet);
        boolean condition = library.listContainBook(alphabet);
        checkResult(condition, "Added book");
    }

    public void addBookFail() {
        boolean condition = library.addBook(emptyBook);
        checkResult(!condition,
                "Add empty book");
    }

    public void rightToAddBook() {
        checkResult(!library.rightToAdd(emptyBook),
                "Check if right to add empty book");
    }

    public void checkIfListContainBook() {
        library.addBook(war);
        checkResult(library.listContainBook(war),
                "Check if list contain this book");
    }

    public void filledBook() {
        checkResult(library.filledAuthorTitle(war),
                "Filled Book");
    }

    public void notFilledBook() {
        checkResult(!library.filledAuthorTitle(emptyBook),
                "Not filled book");
    }

    public void checkResult(boolean condition, String nameOfTest) {
        if(condition) {
            System.out.println(nameOfTest + " Test OK!");
        } else {
            System.out.println(nameOfTest + " Test FAIL!");
        }
    }
}
