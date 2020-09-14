package student_anvars_intezars.home_tasks.lesson_10.level_6;

import java.util.ArrayList;
import java.util.List;

class BookReaderImpl implements BookReader {

    List<Book> books = new ArrayList<>();

    @Override
    public void save(Book book) {
        books.add(book);
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
            if (titleFromProducts.equals(productTitle)) {
                return books.get(i);
            }
        } return null;
    }

    @Override
    public void delete(Book book) {
        Book bookToDelete = findByTitle(book.getTitle());
        books.remove(bookToDelete);
    }
}
