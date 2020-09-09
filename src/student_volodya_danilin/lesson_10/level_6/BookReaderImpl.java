package student_volodya_danilin.lesson_10.level_6;

import java.util.ArrayList;
import java.util.List;

class BookReaderImpl implements BookReader{

    List<Book> bookList = new ArrayList<>();

    @Override
    public void addBook(Book ... book) {
        for (Book value : book) {
            if (canAddBook(value)) {
                bookList.add(value);
            }
        }
    }

    void removeBook(Book book) {
        if (canRemoveBook(book)) {
            bookList.remove(book);
        }
    }

    boolean isDuplicateBook(Book book) {
        boolean result = false;
        if (bookSearch(book).author.equals(book.author)
        && bookSearch(book).title.equals(book.title)) {
            result = true;
            System.out.println("Duplicate books not allowed!");
        }
        return result;
    }

    boolean isEmptyBookInfo(Book book) {
        boolean result = false;
        if (book.author.isBlank() || book.title.isBlank()) {
            result = true;
            System.out.println("Author/Title can't be blank!");
        }
        return result;
    }

    boolean canAddBook(Book book) {
        boolean result = true;
        if (isDuplicateBook(book) || isEmptyBookInfo(book)) {
            result = false;
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

    ArrayList<Book> authorSearchExact(String author) {
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

    ArrayList<Book> authorSearchStartsWith(String author) {
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

    boolean canFindBook(Book book) {
        boolean result = false;
        if (bookSearch(book).title.equals(book.title)
                && bookSearch(book).author.equals(book.author)) {
            result = true;
        }
        else {
            System.out.println("Book was not found in database!");
        }
        return result;
    }

    boolean canRemoveBook(Book book) {
        boolean result = false;
        if (canFindBook(book)) {
            result = true;
        }
        return result;
    }

    void printBookList() {
        System.out.println("Available books : ");
        for (Book value : bookList) {
            value.printBookInfo();
        }
    }
}
