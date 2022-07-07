package roman.lesson_10.day_6.task_17;

public class BookReaderImplTest {
    public static void main(String[] args) {
        BookReaderImplTest test = new BookReaderImplTest();
        test.libraryToStringTest();
    }

    public void libraryToStringTest() {
        Book fraud = new Book("James", "Fraud");
        Book love = new Book("Jessica", "Love");
        BookReader library = new BookReaderImpl();
        library.addBook(fraud);
        library.addBook(love);
        String[] listOfBook = library.libraryBooksToStringList();
        checkResult(listOfBook[0].compareTo("Fraud [ James ]") == 0, "Library to String");
    }

    public void checkResult(boolean condition, String nameOfTest) {
        if(condition) {
            System.out.println(nameOfTest + " Test = OK!");
        } else {
            System.out.println(nameOfTest + " Test = FAIL!");
        }
    }
}
