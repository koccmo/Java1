package roman.lesson_10.day_6.task_19;

import java.util.ArrayList;
import java.util.List;

public class BookReaderImplTest {
    public static void main(String[] args) {
        BookReaderImplTest test = new BookReaderImplTest();
        test.getListOfBookWithSameAuthorThenEnterBeginning();
    }

    public void getListOfBookWithSameAuthorThenEnterBeginning() {
        Book peace = new Book("Jame James", "Peace");
        Book war = new Book("Jame James", "War");
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(peace);
        bookReader.addBook(war);
        List<Book> bookList = bookReader.getListOfBookBuyAuthor("Jame");
        checkResult(bookList.size() == 2,
                "Get book list with same author when enter beginning of author");
    }

    public void checkResult(boolean condition, String nameOfTest) {
        if(condition) {
            System.out.println(nameOfTest + " Test = OK!");
        } else {
            System.out.println(nameOfTest + " Test = Fail!");
        }
    }
}
