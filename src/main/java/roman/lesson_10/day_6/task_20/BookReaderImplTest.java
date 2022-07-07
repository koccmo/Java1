package roman.lesson_10.day_6.task_20;

import java.util.List;

public class BookReaderImplTest {
    public static void main(String[] args) {
        BookReaderImplTest test = new BookReaderImplTest();
        test.addToBookListWithSameTitle();
    }

    public void addToBookListWithSameTitle() {
        Book joke = new Book("James James", "Joke");
        Book myJoke = new Book("Sarah Mahmud", "Joke");
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(joke);
        bookReader.addBook(myJoke);
        List<Book> bookListWithSameTitle = bookReader.getListOfBookBuyTitle("Joke");
        checkResult(bookListWithSameTitle.size() == 2,
                "Add to list book with same title from book reader");
    }

    public void checkResult(boolean condition, String nameOfTest) {
        if(condition) {
            System.out.println(nameOfTest + " Test = OK!");
        } else {
            System.out.println(nameOfTest + " Test = Fail!");
        }
    }
}
