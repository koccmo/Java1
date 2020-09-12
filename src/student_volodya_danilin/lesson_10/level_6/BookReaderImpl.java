package student_volodya_danilin.lesson_10.level_6;

import java.util.ArrayList;
import java.util.List;

class BookReaderImpl implements BookReader{

    List<Book> bookList = new ArrayList<>();

    @Override
    public boolean addBook(Book ... book) {
        boolean result = false;

        for (Book value : book) {
            if (!isDuplicateBook(value)
            && !isBlankBookInfo(value)) {
                bookList.add(value);
                result = true;
            }
        }
        return result;
    }

    List<Book> getBookList() {
        return this.bookList;
    }

    boolean removeBook(Book book) {  //Task_16
        boolean result = false;

        if (bookSearch(book).equals(book)) {
            bookList.remove(book);
            result = true;
        }
        return result;
    }

    boolean isDuplicateBook(Book book) {  //Task_14
        boolean result = false;
        if (bookSearch(book).author.equals(book.author)
        && bookSearch(book).title.equals(book.title)) {
            result = true;
            System.out.println("Duplicate books are not allowed!");
        }
        return result;
    }

    boolean isBlankBookInfo(Book book) {  //Task_15
        boolean result = false;
        if (book.author.isBlank() || book.title.isBlank()) {
            result = true;
            System.out.println("Author/Title can't be blank!");
        }
        return result;
    }

    Book bookSearch(Book book) {
        Book result = new Book();
        for (Book value : bookList) {
            if (value.title.equals(book.title)
                    && value.author.equals(book.author)) {
                result = value;
            }
        }
        return result;
    }

    ArrayList<Book> authorSearchExact(String author) { //Task_18
        ArrayList<Book> result = new ArrayList<>();
        for (Book value : bookList) {
            if (value.author.equals(author)) {
                result.add(value);
            }
        }
        if (result.isEmpty()) {
            System.out.println("Exact author not found!");
        }
        return result;
    }

    ArrayList<Book> authorSearchStartsWith(String author) { //Task_19
        ArrayList<Book> result = new ArrayList<>();
        for (Book value : bookList) {
            if (value.author.startsWith(author)) {
                result.add(value);
            }
        }
        return result;
    }

    ArrayList<Book> titleSearchExact(String title) {  //task20
        ArrayList<Book> result = new ArrayList<>();
        for (Book value : bookList) {
            if (value.title.equals(title)) {
                result.add(value);
            }
        }
        return result;
    }

    ArrayList<Book> titleSearchStartsWith(String title) { //task21
        ArrayList<Book> result = new ArrayList<>();
        for (Book value : bookList) {
            if (value.title.startsWith(title)) {
                result.add(value);
            }
        }
        return result;
    }

    boolean setIsReadTrue(Book ... book) { //Task_22
        boolean result = false;
        for (Book value : book) {
            if (bookSearch(value).equals(value)) {
                value.isRead = true;
                result = true;
            }
            else {
                System.out.println("Can't find the book!");
            }
        }
        return result;
    }

    boolean setIsReadFalse(Book ... book) { //Task_23
        boolean result = false;
        for (Book value : book) {
            if (bookSearch(value).equals(value)) {
                value.isRead = false;
                result = true;
            }
            else {
                System.out.println("Can't find the book!");
            }
        }
        return result;
    }

    void printBookList() {
        System.out.println("Available books : ");
        for (Book value : bookList) {
            value.printBookInfo();
        }
    }

    void printReadBooks() { //Task_24
        System.out.println("Read books : ");
        for (Book value : bookList) {
            if (value.isRead) {
                System.out.println(value.title + " [" + value.author + "]");
            }
        }
    }

    void printUnreadBooks() {
        System.out.println("Unread books : ");
        for (Book value : bookList) {
            if (!value.isRead) {
                System.out.println(value.title + " [" + value.author + "]");
            }
        }
    }
}
