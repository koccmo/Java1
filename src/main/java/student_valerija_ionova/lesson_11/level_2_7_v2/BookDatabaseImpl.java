package student_valerija_ionova.lesson_11.level_2_7_v2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class BookDatabaseImpl implements  BookDatabase{

    private Long id= 1L;
    private List<Book> listOfBooks = new ArrayList<>();

    List<Book> getListOfBooks(){
        return listOfBooks;
    }

    @Override
    public int countAllBooks() {
        return listOfBooks.size();
    }

    @Override
    public Long save(Book book) {
        listOfBooks.add(book);
        book.setId(id);
        id++;
        return id;
    }

    @Override
    public boolean delete(Long bookId){
        for (int i = 0; i < listOfBooks.size(); i++){
            if (listOfBooks.get(i).getId().equals(bookId)){
                listOfBooks.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book book){
        if (listOfBooks.contains(book)){
            listOfBooks.remove(book);
            return true;
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId){

        for (int i = 0; i < listOfBooks.size(); i++){
            if (listOfBooks.get(i).getId() == bookId){
                return Optional.of(listOfBooks.get(i));
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List <Book> booksByAuthor = new ArrayList<>();
        for (int i = 0; i < listOfBooks.size(); i++){
            if (listOfBooks.get(i).getAuthor().equals(author)){
                booksByAuthor.add(listOfBooks.get(i));
            }
        }
        return booksByAuthor;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List <Book> booksByTitle = new ArrayList<>();
        for (int i = 0; i < listOfBooks.size(); i++){
            if (listOfBooks.get(i).getTitle().equals(title)){
                booksByTitle.add(listOfBooks.get(i));
            }
        }
        return booksByTitle;
    }

    @Override
    public void deleteByAuthor(String author) {
        for (int i = listOfBooks.size()-1; i >=0; i--){
            if (listOfBooks.get(i).getAuthor().equals(author)){
                listOfBooks.remove(listOfBooks.get(i));
            }
        }
    }

    @Override
    public void deleteByTitle(String title) {
        for (int i = listOfBooks.size()-1; i >=0; i--){
            if (listOfBooks.get(i).getTitle().equals(title)){
                listOfBooks.remove(listOfBooks.get(i));
            }
        }
    }
}
