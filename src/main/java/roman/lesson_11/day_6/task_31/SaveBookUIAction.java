package roman.lesson_11.day_6.task_31;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SaveBookUIAction implements UIAction{
    public static void main(String[] args) {
        SaveBookUIAction saveBookUIAction = new SaveBookUIAction(new BookDatabaseImpl());
        saveBookUIAction.execute();
        System.out.println(saveBookUIAction.toString());
    }
    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    List<String> getBookData() {
        List<String> bookData = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book Author : ");
        bookData.add(scanner.nextLine());
        System.out.println("Enter book Title : ");
        bookData.add(scanner.nextLine());
        System.out.println("Entered ear of issue :");
        bookData.add(scanner.nextLine());
        return bookData;
    }

    Book createBook (List<String> bookData) {
        return new Book(bookData.get(0), bookData.get(1), bookData.get(2));
    }

    @Override
    public void execute() {
        bookDatabase.save(createBook(getBookData()));
    }

    @Override
    public String toString() {
        return "SaveBookUIAction{" +
                "bookDatabase=" + bookDatabase +
                '}';
    }
}
