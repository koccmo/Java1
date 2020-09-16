package student_volodya_danilin.lesson_11.level_2.Task_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
class BookDatabaseImpl implements BookDatabase{

	@CodeReviewComment(teacher = "Remove this unused field!")
    Book book;

    private ArrayList<Book> bookStorage = new ArrayList<>();
    private Long bookIdCounter = 1L;

    @Override
    public Long save(Book book) {
        book.setId(bookIdCounter);
        bookStorage.add(book);
        bookIdCounter++;
        return bookIdCounter - 1;
    }

    @Override
    public boolean delete(Long bookId) {
        boolean result = false;
        for (Book value : bookStorage) {
            if (value.getId().equals(bookId)) {
                bookStorage.remove(value);
                result = true;
                break;
            }
        }
        return result;
    }

    @Override
    public boolean delete(Book book) {
        boolean result = false;
        for (Book value : bookStorage) {
            if (value.getAuthor().equals(book.getAuthor())
            && value.getTitle().equals(book.getTitle())) {
                bookStorage.remove(value);
                result = true;
                break;
            }
        }
        return result;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        Optional<Book> result = Optional.empty();
            for (Book value : bookStorage) {
                if (value.getId().equals(bookId)) {
                    value.setId(0L);
                    result = Optional.of(value);
                    break;
                }
            }
        return result;
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> result = new ArrayList<>(4);
        for (Book value : bookStorage) {
            if (value.getAuthor().contains(author)) {
                result.add(value);
            }
        }
        return result;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> result = new ArrayList<>(4);
        for (Book value : bookStorage) {
            if (value.getTitle().contains(title)) {
                result.add(value);
            }
        }
        return result;
    }

    @Override
    public int countAllBooks() {
        return bookStorage.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        List<Book> booksToDelete = findByAuthor(author);
        for (Book value : booksToDelete) {
            delete(value);
        }
    }

    @Override
    public void deleteByTitle(String title) {
        List<Book> booksToDelete = findByTitle(title);
        for (Book value : booksToDelete) {
            delete(value);
        }
    }

    void clearStorage() {
        bookStorage.clear();
    }

    void printBookList() {
        System.out.println("============ Stored Books ============");
        for (Book value : bookStorage) {
            System.out.print(value.getTitle());
            System.out.print(" - by - ");
            System.out.print(value.getAuthor());
            System.out.print(" - ID : ");
            System.out.println(value.getId());
        }
        System.out.println("======================================");
        bookIdCounter = 1L;
    }

}
