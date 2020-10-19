package student_jaroslav_brutan.lesson_11.day2_6;

import student_jaroslav_brutan.lesson_11.day2_6.AllSearchCriterias.SearchCriteria;
import teacher.codereview.CodeReview;

import java.util.*;

@CodeReview(approved = true)
public class BookDatabaseImpl implements BookDatabase{

    private List<Book> listOfBooks = new ArrayList<>();
    private Long id = 1L;
    private List<Book> bookDatabase = new ArrayList<>();

    List<Book> getDatabase(){
        return bookDatabase;
    }


    @Override
    public Long save(Book book){
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
        for (int i = 0; i < listOfBooks.size();i++){
            if (listOfBooks.get(i).getId().equals(bookId)){
                return Optional.of(listOfBooks.get(i));
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author){
        List<Book> booksWithAuthor = new ArrayList<>();
        for (int i = 0; i < listOfBooks.size(); i++){
            if (listOfBooks.get(i).getAuthor().equals(author)){
                listOfBooks.add(listOfBooks.get(i));
            }
        }
        return booksWithAuthor;
    }

    @Override
    public List<Book> findByTitle(String title){
        List<Book> booksWithTitle = new ArrayList<>();
        for (int i =0; i < listOfBooks.size(); i++){
            if (listOfBooks.get(i).getTitle().equals(title)){
                listOfBooks.add(listOfBooks.get(i));
            }
        }
        return booksWithTitle;
    }

    @Override
    public int countAllBooks(){
        return listOfBooks.size();
    }

    @Override
    public void deleteByAuthor(String author){
        for (int i = 0; i < listOfBooks.size(); i++){
            if (listOfBooks.get(i).getAuthor().equals(author)){
                listOfBooks.remove(listOfBooks.get(i));
            }
        }
    }

    @Override
    public void deleteByTitle(String title){
        for (int i = 0; i < listOfBooks.size(); i++){
            if (listOfBooks.get(i).getTitle().equals(title)){
                listOfBooks.remove(listOfBooks.get(i));
            }
        }
    }

    @Override
    public Set<String> findUniqueAuthors(){
        Set<String> setOfAuthors = new HashSet<>();
        for (int i =0; i < bookDatabase.size(); i++){
            setOfAuthors.add(bookDatabase.get(i).getAuthor());
        }
        return setOfAuthors;
    }

    @Override
    public Set<String> findUniqueTitles(){
        Set<String> setOfTitles = new HashSet<>();
        for (int i = 0; i < bookDatabase.size(); i++){
            setOfTitles.add(bookDatabase.get(i).getTitle());
        }
        return setOfTitles;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        Set<Book> setOfBooks = new HashSet<>();
        for (int i = 0; i < bookDatabase.size(); i++){
            Book book = bookDatabase.get(i);
            setOfBooks.add(book);
        }
        return setOfBooks;
    }

    @Override
    public boolean contains(Book book){
        for (int i = 0; i < bookDatabase.size(); i++){
            if (book.equals(bookDatabase.get(i))){
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria){
        List<Book> listOfBooks = new ArrayList<>();
        for (int i = 0; i < listOfBooks.size(); i++){
            if (searchCriteria.match(listOfBooks.get(i))){
                listOfBooks.add(listOfBooks.get(i));
            }
        }
        return listOfBooks;
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap(){
        Map<String, List<Book>> authorToBookMap = new HashMap<>();
        for (String author : findUniqueAuthors()){
            authorToBookMap.put(author, findByAuthor(author));
        }
        return authorToBookMap;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount(){
        Map<String, Integer> eachAuthorBookCount = new HashMap<>();
        for (String author : findUniqueAuthors()){
            List<Book> authorBooks = findByAuthor(author);
            Set<Book> uniqueBook = new HashSet<>(authorBooks);
            eachAuthorBookCount.put(author, uniqueBook.size());
        }
        return eachAuthorBookCount;
    }
}
