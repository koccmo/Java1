package student_valerija_ionova.lesson_11.level_2_7_v2;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class BookDatabaseImplTest {

    BookDatabaseImpl bookDatabase = new BookDatabaseImpl();

    Book book1 = new Book("Author1", "Title1", "1");
    Book book2 = new Book("Author2", "Title2", "1");
    Book book3 = new Book("Author3", "Title3", "3");
    Book book4 = new Book("Author4", "Title4", "4");
    Book book5 = new Book("Author5", "Title5", "5");
    Book book6 = new Book("Author5", "Title4", "6");

    @Before
    public void init (){
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        bookDatabase.save(book5);
        bookDatabase.save(book6);

    }

    @Test
    public void testMethodDeleteById(){
        assertEquals(true, bookDatabase.delete(2L));
        assertEquals(false, bookDatabase.getListOfBooks().contains(book2));
        assertEquals(5, bookDatabase.getListOfBooks().size());
        assertEquals(false, bookDatabase.delete(2L));
    }

    @Test
    public void testMethodDeleteByBook(){
        assertEquals(true, bookDatabase.delete(book1));
        assertEquals(false, bookDatabase.getListOfBooks().contains(book1));
        assertEquals(5, bookDatabase.getListOfBooks().size());
    }

    @Test
    public void testMethodFindById(){
        assertEquals(Optional.of(book3), bookDatabase.findById(3L));
        assertEquals(Optional.empty(), bookDatabase.findById(55L));
        assertEquals(6, bookDatabase.getListOfBooks().size());
    }

    @Test
    public void testMethodFindByAuthor(){
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book5);
        expectedResult.add(book6);
        List <Book> result;
        result = bookDatabase.findByAuthor("Author5");
        assertEquals(expectedResult, result);
        assertEquals(6, bookDatabase.getListOfBooks().size());

    }

    @Test
    public void testMethodFindByAuthorNothingFound(){
        List<Book> expectedResult = new ArrayList<>();
        List <Book> result;
        result = bookDatabase.findByAuthor("Author555");
        assertEquals(expectedResult, result);
        assertEquals(6, bookDatabase.getListOfBooks().size());
    }

    @Test
    public void testMethodFindByTitle(){
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book4);
        expectedResult.add(book6);
        List <Book> result;
        result = bookDatabase.findByTitle("Title4");
        assertEquals(expectedResult, result);
        assertEquals(6, bookDatabase.getListOfBooks().size());

    }

    @Test
    public void testMethodFindByTitleNothingFound(){
        List<Book> expectedResult = new ArrayList<>();
        List <Book> result;
        result = bookDatabase.findByTitle("Title555");
        assertEquals(expectedResult, result);
        assertEquals(6, bookDatabase.getListOfBooks().size());
    }

    @Test
    public void testMethodCountAllBooks(){
        assertEquals(6, bookDatabase.countAllBooks());
    }

    @Test
    public void testMethodDeleteByAuthor(){
        bookDatabase.deleteByAuthor("Author1");
        assertEquals(false, bookDatabase.getListOfBooks().contains(book1));
        assertEquals(5, bookDatabase.countAllBooks());
        bookDatabase.deleteByAuthor("Author5");
        assertEquals(false,
                bookDatabase.getListOfBooks().contains(book5) && bookDatabase.getListOfBooks().contains(book6));
        assertEquals(3, bookDatabase.countAllBooks());
    }

    @Test
    public void testMethodDeleteByTitle(){
        bookDatabase.deleteByTitle("Title2");
        assertEquals(false, bookDatabase.getListOfBooks().contains(book2));
        assertEquals(5, bookDatabase.countAllBooks());
        bookDatabase.deleteByTitle("Title4");
        assertEquals(false,
                bookDatabase.getListOfBooks().contains(book4) && bookDatabase.getListOfBooks().contains(book6));
        assertEquals(3, bookDatabase.countAllBooks());
    }

    @Test
    public void testAuthorSearchCriteria(){
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Author1");
        assertEquals(true, authorSearchCriteria.match(book1));
        assertEquals(false, authorSearchCriteria.match(book4));
    }

    @Test
    public void testTitleSearchCriteria(){
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Title3");
        assertEquals(true, titleSearchCriteria.match(book3));
        assertEquals(false, titleSearchCriteria.match(book4));
    }

    @Test
    public void testYearSearchCriteria(){
        SearchCriteria yearSearchCriteria = new YearOfIssueSearchCriteria("1");
        assertEquals(true, yearSearchCriteria.match(book1));
        assertEquals(false, yearSearchCriteria.match(book4));
    }

    @Test
    public void testAndSearchCriteria(){
        SearchCriteria left = new AuthorSearchCriteria("Author1");
        SearchCriteria right = new TitleSearchCriteria("Title1");
        SearchCriteria andSearch = new AndSearchCriteria(left, right);
        assertEquals(true, andSearch.match(book1));
        assertEquals(false, andSearch.match(book4));
    }

    @Test
    public void testOrSearchCriteria(){
        SearchCriteria left = new YearOfIssueSearchCriteria("1");
        SearchCriteria right = new TitleSearchCriteria("Title1");
        SearchCriteria orSearch = new OrSearchCriteria(left, right);
        assertEquals(true, orSearch.match(book1));
        assertEquals(true, orSearch.match(book2));
        assertEquals(false, orSearch.match(book4));
    }

    @Test
    public void testMethodFindOr(){
        SearchCriteria left = new YearOfIssueSearchCriteria("1");
        SearchCriteria right = new TitleSearchCriteria("Title1");
        SearchCriteria orSearch = new OrSearchCriteria(left, right);
        List <Book> expectedResult = new ArrayList<>();
        expectedResult.add(book1);
        expectedResult.add(book2);
        assertEquals(expectedResult, bookDatabase.find(orSearch));
    }

    @Test
    public void testMethodFindAnd(){
        SearchCriteria left = new YearOfIssueSearchCriteria("1");
        SearchCriteria right = new TitleSearchCriteria("Title1");
        SearchCriteria andSearch = new AndSearchCriteria(left, right);
        List <Book> expectedResult = new ArrayList<>();
        expectedResult.add(book1);
        assertEquals(expectedResult, bookDatabase.find(andSearch));
    }

    @Test
    public void testMethodFindNothingFounded(){
        SearchCriteria left = new YearOfIssueSearchCriteria("6");
        SearchCriteria right = new TitleSearchCriteria("Title1");
        SearchCriteria andSearch = new AndSearchCriteria(left, right);
        List <Book> expectedResult = new ArrayList<>();
        assertEquals(expectedResult, bookDatabase.find(andSearch));
    }

    @Test
    public void testMethodFindUniqueAuthors(){
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("Author1");
        expectedResult.add("Author2");
        expectedResult.add("Author3");
        expectedResult.add("Author4");
        expectedResult.add("Author5");
        assertEquals(expectedResult, bookDatabase.findUniqueAuthors());
    }

    @Test
    public void testMethodFindUniqueTitles(){
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("Title1");
        expectedResult.add("Title2");
        expectedResult.add("Title3");
        expectedResult.add("Title4");
        expectedResult.add("Title5");
        assertEquals(expectedResult, bookDatabase.findUniqueTitles());
    }

    @Test
    public void testMethodFindUniqueBooks(){
        Set<Book> expectedResult = new HashSet<>();
        expectedResult.add(book1);
        expectedResult.add(book2);
        expectedResult.add(book3);
        expectedResult.add(book4);
        expectedResult.add(book5);
        expectedResult.add(book6);
        assertEquals(expectedResult, bookDatabase.findUniqueBooks());
    }

    @Test
    public void testMethodContains(){
        Book newBook = new Book("Author1", "Title1", "1");
        Book newBook2 = new Book("Author11", "Title1", "1");
        assertEquals(true, bookDatabase.contains(newBook));
        assertEquals(false, bookDatabase.contains(newBook2));
    }

    @Test
    public void testMethodGetAuthorToBooksMap(){
        Map <String, List<Book>> expectedMap = new HashMap<>();

        List <Book> listOfBooks1 = new ArrayList<>();
        listOfBooks1.add(book1);
        expectedMap.put("Author1", listOfBooks1);

        List <Book> listOfBooks2 = new ArrayList<>();
        listOfBooks2.add(book2);
        expectedMap.put("Author2", listOfBooks2);

        List <Book> listOfBooks3 = new ArrayList<>();
        listOfBooks3.add(book3);
        expectedMap.put("Author3", listOfBooks3);

        List <Book> listOfBooks4 = new ArrayList<>();
        listOfBooks4.add(book4);
        expectedMap.put("Author4", listOfBooks4);

        List <Book> listOfBooks5 = new ArrayList<>();
        listOfBooks5.add(book5);
        listOfBooks5.add(book6);
        expectedMap.put("Author5", listOfBooks5);

        assertEquals(true, compareTwoMaps(bookDatabase.getAuthorToBooksMap(), expectedMap));
    }

    @Test
    public void getEachAuthorBookCount(){
        Map <String, Integer> expectedMap = new HashMap<>();

        expectedMap.put("Author1", 1);

        expectedMap.put("Author2", 1);

        expectedMap.put("Author3", 1);

        expectedMap.put("Author4", 1);

        expectedMap.put("Author5", 2);

        assertEquals(true, compareTwoMaps(bookDatabase.getEachAuthorBookCount(), expectedMap));
    }

    private boolean compareTwoMaps(Map map1, Map map2 ){
        if (map1.size()!=map2.size()){
            return false;
        }else{
            for (Object key : map1.keySet()){
                Object value = map1.get(key);
                if (!value.equals(map2.get(key))) return false;
            }
        }
        return true;
    }
}