package roman.lesson_10.day_6.task_21;

public class BookReaderImplTest {
    public static void main(String[] args) {
        BookReaderImplTest test = new BookReaderImplTest();
        test.twoBookInListWithSameTitle();
        test.oneBookFromTwoWithEnteredTitle();
    }

    public void twoBookInListWithSameTitle() {
        Book hope = new Book("Jonny Johns", "Hope");
        Book hopeToLive = new Book("James Silivan", "Hope to live");
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(hope);
        bookReader.addBook(hopeToLive);
        checkResult(bookReader.getListFromBookReaderWithSameTitle("Hope").size() == 2,
                "Two of two book in list with same title");
    }

    public void oneBookFromTwoWithEnteredTitle() {
        Book hope = new Book("Jonny Johns", "Hope");
        Book hopeToLive = new Book("James Silivan", "To live");
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(hope);
        bookReader.addBook(hopeToLive);
        checkResult(bookReader.getListFromBookReaderWithSameTitle("Hope").size() == 1,
                "One from two book with entered title");
    }

    public void checkResult(boolean condition, String nameOfTest) {
        if(condition) {
            System.out.println(nameOfTest + " Test = OK!");
        } else {
            System.out.println(nameOfTest + " Test = FAIL!");
        }
    }
}
