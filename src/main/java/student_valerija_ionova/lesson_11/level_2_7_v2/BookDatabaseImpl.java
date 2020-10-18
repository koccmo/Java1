package student_valerija_ionova.lesson_11.level_2_7_v2;

import java.util.*;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
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

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List <Book> foundedBooks = new ArrayList<>();
        for (int i = 0; i < listOfBooks.size(); i++){
            if (searchCriteria.match(listOfBooks.get(i))){
                foundedBooks.add(listOfBooks.get(i));
            }
        }
        return foundedBooks;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set <String> uniqueAuthors = new HashSet<>();
        for (int i = 0; i < listOfBooks.size(); i++){
            uniqueAuthors.add(listOfBooks.get(i).getAuthor());
        }
        return uniqueAuthors;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set <String> uniqueTitles = new HashSet<>();
        for (int i = 0; i < listOfBooks.size(); i++){
            uniqueTitles.add(listOfBooks.get(i).getTitle());
        }
        return uniqueTitles;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        Set <Book> uniqueBooks = new HashSet<>();
        for (int i = 0; i < listOfBooks.size(); i++){
            uniqueBooks.add(listOfBooks.get(i));
        }
        return uniqueBooks;
    }

    @Override
    public boolean contains(Book book) {
        return listOfBooks.contains(book);
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        Map <String, List<Book>> mapOfAuthorsBooks = new HashMap<>();

        List <String> differentAuthors = new ArrayList<>(findUniqueAuthors());

        for (int i = 0; i < differentAuthors.size(); i++){
            List <Book> listOfBooks = createListOfBooksOfAuthor(differentAuthors.get(i));
            mapOfAuthorsBooks.put(differentAuthors.get(i), listOfBooks);
        }
        return mapOfAuthorsBooks;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        Map <String, Integer> mapOfAuthorsBooksCount = new HashMap<>();

        List <String> differentAuthors = new ArrayList<>(findUniqueAuthors());

        for (int i = 0; i < differentAuthors.size(); i++){
            Integer countOfBooks = countNumberOfBooksOfAuthor(differentAuthors.get(i));
            mapOfAuthorsBooksCount.put(differentAuthors.get(i), countOfBooks);
        }
        return mapOfAuthorsBooksCount;
    }

    private Integer countNumberOfBooksOfAuthor(String author){
        Integer count = 0;

        for (int j = 0; j < listOfBooks.size(); j++){
            if (listOfBooks.get(j).getAuthor().equals(author)){
                count++;
            }
        }
        return count;
    }

    private List <Book> createListOfBooksOfAuthor(String author){
        List <Book> booksOfAuthor = new ArrayList<>();

            for (int j = 0; j < listOfBooks.size(); j++){
                if (listOfBooks.get(j).getAuthor().equals(author)){
                    booksOfAuthor.add(listOfBooks.get(j));
                }
            }
        return booksOfAuthor;
    }

}
