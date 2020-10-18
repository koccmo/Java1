package student_valerija_ionova.lesson_11.level_5_approved.task_28_29;

/*Task28 Map<String, List<Book>> getAuthorToBooksMap();
    Данный метод должен возвращать мап в котором ключём является
    автор, а значением список книг этого автора.

Task29 Map<String, Integer> getEachAuthorBookCount();
*/

import java.util.*;


class BookDatabaseImpl implements BookDatabase {

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

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List <Book> books = new ArrayList <>();
        for (int i = 0; i < bookDataBase.size(); i++){
            if (searchCriteria.match(bookDataBase.get(i).getBook())){
                books.add(bookDataBase.get(i).getBook());
            }
        }
        return books;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set <String> uniqueAuthors = new HashSet<>();
        for (int i = 0; i < bookDataBase.size(); i++){
            uniqueAuthors.add(bookDataBase.get(i).getBook().getAuthor());
        }
        return uniqueAuthors;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set <String> uniqueTitles = new HashSet<>();
        for (int i = 0; i < bookDataBase.size(); i++){
            uniqueTitles.add(bookDataBase.get(i).getBook().getTitle());
        }
        return uniqueTitles;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        Set <Book> uniqueBooks = new HashSet<>();
        for (int i = 0; i < bookDataBase.size(); i++){
            uniqueBooks.add(bookDataBase.get(i).getBook());
        }
        return uniqueBooks;
    }

    @Override
    public boolean contains(Book book) {
        for (int i = 0; i < bookDataBase.size(); i++){
            if (book.equals(bookDataBase.get(i).getBook())){
                return true;
            }
        }
        return false;
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        Map <String, List<Book>> mapOfAuthorsBooks = new HashMap<>();

        List <String> differentAuthors = createListOfDifferentAuthors();

        for (int i = 0; i < differentAuthors.size(); i++){
            List <Book> listOfBooks = createListOfBooksOfAuthor(differentAuthors.get(i));
            mapOfAuthorsBooks.put(differentAuthors.get(i), listOfBooks);
        }
        return mapOfAuthorsBooks;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        Map <String, Integer> mapOfAuthorsBooksCount = new HashMap<>();

        List <String> differentAuthors = createListOfDifferentAuthors();

        for (int i = 0; i < differentAuthors.size(); i++){
            Integer countOfBooks = countNumberOfBooksOfAuthor(differentAuthors.get(i));
            mapOfAuthorsBooksCount.put(differentAuthors.get(i), countOfBooks);
        }
        return mapOfAuthorsBooksCount;
    }

    private Integer countNumberOfBooksOfAuthor(String author){
        Integer count = 0;

        for (int j = 0; j < bookDataBase.size(); j++){
            if (bookDataBase.get(j).getBook().getAuthor().equals(author)){
                count++;
            }
        }
        return count;
    }

    private List <Book> createListOfBooksOfAuthor(String author){
        List <Book> listOfBooks = new ArrayList<>();

            for (int j = 0; j < bookDataBase.size(); j++){
                if (bookDataBase.get(j).getBook().getAuthor().equals(author)){
                    listOfBooks.add(bookDataBase.get(j).getBook());
                }
            }
        return listOfBooks;
    }

    private List <String> createListOfDifferentAuthors(){
        Set <String> authors = new HashSet<>();
        for (int i = 0; i < bookDataBase.size(); i++){
            authors.add(bookDataBase.get(i).getBook().getAuthor());
        }
        return new ArrayList<>(authors);
    }



}
