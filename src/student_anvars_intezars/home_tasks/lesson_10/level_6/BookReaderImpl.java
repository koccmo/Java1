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
        save(book);
        return true;
    }
}
    //Первый вариант метода, который фейлился на тесте. Пока не удалял, чтобы довести до ума.
    /*@Override
    public boolean isAddedBook(Book book) {
        Book currentListOfBooks;
        for (int i = 0; i < books.size(); i++) {
            currentListOfBooks = books.get(i);
            if (!currentListOfBooks.equals(book)) {
                save(book);
                return true;
            }
        }
        return false;
    }
}*/
