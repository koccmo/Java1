package student_eduards_jasvins.lesson_11.day_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
class BookDatabaseImpl implements BookDatabase {

	@CodeReviewComment(teacher = "This field should be private.")
    List<Book> books = new ArrayList<>();

	@CodeReviewComment(teacher = "This field should be private.")
	Long currentId = 0L;

    private Optional <Book> getBookById(Long bookId) {
        Optional <Book> result = Optional.empty();
        for (Book book : books) {
            if (book.getId().equals(bookId));
            break;
        }
        return result;
    }

    private Optional <Book> getBookFromList(Book bookToGet) {
        Optional <Book> result = Optional.empty();
        for (Book book : books) {
            if (book.equals(bookToGet));
              result = Optional.of(book);
              break;
        }
        return result;
    }


    @Override
    public Long save(Book book) {
        books.add(book);
        Long bookId = currentId;
        book.setId(bookId);
        currentId++;
        return currentId;
    }

    @Override
    public boolean delete(Long bookId) {
        Optional <Book> bookOptional = getBookById(bookId);
        if (bookOptional.isPresent()) {
            books.remove(bookOptional.get());
            return true;
        }
        else return false;
    }

    @Override
    public boolean delete(Book book) {
        Optional <Book> bookOptional = getBookFromList(book);
        if (bookOptional.isPresent()) {
            books.remove(bookOptional.get());
            return true;
        }
        else return false;
    }
}
