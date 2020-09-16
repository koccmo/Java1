package student_valerija_ionova.lesson_11.level_2.task_6_14_not_approve;

/*Создайте класс BookDatabaseImpl, который реализует интерфейс BookDatabase.
Task6
Реализуйте в нём метод  Long save(Book book). Книги внутри класса BookDatabaseImpl
храните в списке.

Task7
Данный метод предназначен для удаления книги с указанным id в качестве параметра метода
из базы данных.

Task8
boolean delete(Book book);

Task9
Optional<Book> findById(Long bookId);

Task10
List<Book> findByAuthor(String author);

Task11
List<Book> findByTitle(String title);

Task12
int countAllBooks();

Task13
void deleteByAuthor(String author);

Task14
void deleteByTitle(String title);
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


class BookDatabaseImpl implements  BookDatabase{

    private List<BookAndId> bookDataBase = new ArrayList<>();
    private Long number = 0L;

    List <BookAndId> getBookDataBase(){
        return bookDataBase;
    }

    @Override
    public Long save(Book book) {
        number ++;
        bookDataBase.add(new BookAndId(book, number));
        return (number);
    }

    @Override
    public boolean delete(Long bookId) {
        for (int i = 1; i <= bookDataBase.size(); i++){
            if (bookDataBase.get(i-1).getNumber().equals(bookId)){
                bookDataBase.remove(i-1);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        for (int i = 0; i < bookDataBase.size(); i++){
            if (book.equals(bookDataBase.get(i).getBook())){
                bookDataBase.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (int i = 0; i < bookDataBase.size(); i++){
            if (bookDataBase.get(i).getNumber().equals(bookId)){
                return Optional.of(bookDataBase.get(i).getBook());
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List <Book> booksOfAuthor = new ArrayList <>();
        for (int i = 0; i< bookDataBase.size(); i++){
            if (bookDataBase.get(i).getBook().getAuthor().equals(author)){
                booksOfAuthor.add(bookDataBase.get(i).getBook());
            }
        }
        return booksOfAuthor;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List <Book> booksWithTitle = new ArrayList <>();
        for (int i = 0; i< bookDataBase.size(); i++){
            if (bookDataBase.get(i).getBook().getTitle().equals(title)){
                booksWithTitle.add(bookDataBase.get(i).getBook());
            }
        }
        return booksWithTitle;
    }

    @Override
    public int countAllBooks() {
        return bookDataBase.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        for (int i = 0; i < bookDataBase.size(); i++){
            if (bookDataBase.get(i).getBook().getAuthor().equals(author)){
                bookDataBase.remove(i);
            }
        }
    }

    @Override
    public void deleteByTitle(String title) {
        for (int i = 0; i < bookDataBase.size(); i++){
            if (bookDataBase.get(i).getBook().getTitle().equals(title)){
                bookDataBase.remove(i);
            }
        }
    }

    BookAndId getBookAndId (Long index){
        return bookDataBase.get(index.intValue());
    }


}
