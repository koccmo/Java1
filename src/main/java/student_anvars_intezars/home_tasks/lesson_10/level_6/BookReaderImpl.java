package student_anvars_intezars.home_tasks.lesson_10.level_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;


@CodeReview(approved = true)
class BookReaderImpl implements BookReader {

    private int[] array;

    @CodeReviewComment(teacher = "This field should be private.")
    private List<Book> books = new ArrayList<>();
    private List<Book> booksWhichAreRead = new ArrayList<>();

    @Override
    public void save(Book book) {
        books.add(book);
    }

    @Override
    public void saveReadBook(Book book) {
        booksWhichAreRead.add(book);
    }

    @Override
    public boolean isAddedBook(Book book) {
        if (booksEqualByAuthorAndTitle(book)
                &&
                (booksHaveTitleAndAuthor(book))) {
            save(book);
            return true;
        }
        return false;
    }

    @Override
    @CodeReviewComment(teacher = "Not correct logic, result must be reverted.")
    @CodeReviewComment(teacher = "Why second loop is needed?")
    @CodeReviewComment(teacher = "We can just check author and title in one loop.")
    public boolean booksEqualByAuthorAndTitle(Book book) {
        String newBookTitle = book.getTitle();
        String newBookAuthor = book.getAuthor();
        for (int i = 0; i < books.size(); i++) {
            String currentBooksTitles = books.get(i).getTitle();
            for (int j = 0; j < books.size(); j++) {
                String currentBooksAuthors = books.get(j).getAuthor();
                if (newBookTitle.equals(currentBooksTitles) && newBookAuthor.equals(currentBooksAuthors)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean booksHaveTitleAndAuthor(Book book) {
        if (book.getTitle().equals("") || (book.getAuthor().equals(""))) {
            return false;
        }
        return true;
    }

    @Override
    public Book findByTitle(String productTitle) {
        String titleFromProducts = "";
        for (int i = 0; i < books.size(); i++) {
            titleFromProducts = books.get(i).getTitle();
            if (titleFromProducts.equals(productTitle) || (titleFromProducts.startsWith(productTitle))) {
                return books.get(i);
            }
        }
        return null;
    }

    @Override
    public boolean delete(Book book) {
        if (books.contains(book)) {
            books.remove(book);
            return true;
        }
        return false;
    }

    @Override
    public void printListOfBooks() {
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).getTitle() + " " + "-" + books.get(i).getAuthor());
        }
    }

    @Override
    public Book findByAuthor(String author) {
        String authorOfBooks = "";
        for (int i = 0; i < books.size(); i++) {
            authorOfBooks = books.get(i).getAuthor();
            if (authorOfBooks.contains(author) || (authorOfBooks.startsWith(author))) {
                return books.get(i);
            }
        }
        return null;
    }

    @Override
    public boolean isRead(Book bookToRead) {
        for (int i = 0; i < books.size(); i++) {
            Book bookInLibrary = books.get(i);
            if (bookInLibrary.equals(bookToRead)) {
                saveReadBook(bookToRead);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean notRead(Book bookNotRead) {
        for (int i = 0; i < books.size(); i++) {
            Book bookInLibrary = books.get(i);
            if (bookInLibrary.equals(bookNotRead)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void isReadFromLibrary() {
        for (int i = 0; i < booksWhichAreRead.size(); i++) {
            Book booksInLibrary = booksWhichAreRead.get(i);
                System.out.println("Book " + booksInLibrary.getTitle() + " [" + booksInLibrary.getAuthor() + "]");
            }
        }
    }


