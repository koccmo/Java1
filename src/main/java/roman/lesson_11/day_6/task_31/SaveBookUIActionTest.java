package roman.lesson_11.day_6.task_31;

import java.util.ArrayList;
import java.util.List;

public class SaveBookUIActionTest {
    public static void main(String[] args) {
        SaveBookUIActionTest test = new SaveBookUIActionTest();
        test.bookCreateTest();
    }

    void bookCreateTest() {
        SaveBookUIAction saveBookUIAction = new SaveBookUIAction(new BookDatabaseImpl());
        Book book = new Book("James", "Garden", "2000");
        List<String> bookData = new ArrayList<>();
        bookData.add("James");
        bookData.add("Garden");
        bookData.add("2000");
        checkResult(saveBookUIAction.createBook(bookData).equals(book),
                "Book create");

    }


    void checkResult(boolean condition, String nameOfTest) {
        if (condition) {
            System.out.println(nameOfTest + " Test = OK!");
        } else {
            System.out.println(nameOfTest + " Test = Fail!");
        }
    }
}
