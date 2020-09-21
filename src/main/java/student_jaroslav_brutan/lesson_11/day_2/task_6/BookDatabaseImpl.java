package student_jaroslav_brutan.lesson_11.day_2.task_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class BookDatabaseImpl implements BookDatabase{


        private List<Book> listOfBooks = new ArrayList<>();
        private Long id = 1L;

        @Override
        public Long save(Book book){
            listOfBooks.add(book);
            book.setId(id);
            id++;
            return id;
        }

        @Override
    public boolean delete(Long bookId){
            for (int i = 0; i < listOfBooks.size();i++){
                if (listOfBooks.get(i).getId().equals(bookId)){
                    listOfBooks.remove(i);
                    return true;
                }
            } return false;
        }

        @Override
    public boolean delete(Book book){
            if (listOfBooks.contains(book)){
                listOfBooks.remove(book);
                return true;
            } return false;
        }

        @Override
    public Optional<Book> findById(Long bookId){
            for (int i = 0; i < listOfBooks.size();i++){
                if (listOfBooks.get(i).getId().equals(bookId)){
                    return Optional.of(listOfBooks.get(i));
                }
            } return Optional.empty();
        }

        @Override
    public List<Book> findByAuthor(String author){
            List<Book> booksWithAuthor = new ArrayList<>();
            for (int i = 0; i < listOfBooks.size();i++){
                if (listOfBooks.get(i).getAuthor().equals(author)){
                    listOfBooks.add(listOfBooks.get(i));
                }
            } return booksWithAuthor;
        }

        @Override
    public List<Book> findByTitle(String title) {
            List<Book> booksWithTitle = new ArrayList<>();
            for (int i = 0; i < listOfBooks.size();i++){
                if (listOfBooks.get(i).getTitle().equals(title)){
                    listOfBooks.add(listOfBooks.get(i));
                }
            } return booksWithTitle;
        }

        @Override
    public int countAllBooks(){
            return listOfBooks.size();
        }

        @Override
    public void deleteByAuthor(String author){
            for (int i = 0; i < listOfBooks.size();i++){
                if (listOfBooks.get(i).getAuthor().equals(author)){
                    listOfBooks.remove(listOfBooks.get(i));
                }
            }
        }
}
