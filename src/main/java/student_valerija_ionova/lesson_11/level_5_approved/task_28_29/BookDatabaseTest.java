package student_valerija_ionova.lesson_11.level_5_approved.task_28_29;


import java.util.*;

class BookDatabaseTest {

        public static void main (String [] args){

            BookDatabaseTest authorSearchCriteriaTest = new BookDatabaseTest();

            authorSearchCriteriaTest.testGetAuthorToBooksMap();
            authorSearchCriteriaTest.testGetAuthorsBookCount();

        }

    void checkResult (String name, boolean testPassed){
        if (testPassed){
            System.out.println(name + " OK");
        }else{
            System.out.println(name + " FAIL");
        }
    }

    void testGetAuthorToBooksMap(){

        Book book1 = new Book("Author1", "Title1", "2009");
        Book book2 = new Book("Author1", "Title8", "2009");
        Book book3 = new Book("Author3", "Title45", "2007");
        Book book4 = new Book("Author3", "Title3", "2005");
        Book book5 = new Book("Author2", "Title4", "2009");
        Book book6 = new Book("Author20", "Title4", "2009");

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        bookDatabase.save(book5);
        bookDatabase.save(book6);

        Map<String, List<Book>> result = new HashMap<>();

        List <Book> listOfBooks1 = new ArrayList<>();
        listOfBooks1.add(book1);
        listOfBooks1.add(book2);
        result.put("Author1", listOfBooks1);

        List <Book> listOfBooks2 = new ArrayList<>();
        listOfBooks2.add(book3);
        listOfBooks2.add(book4);
        result.put("Author3", listOfBooks2);

        List <Book> listOfBooks3 = new ArrayList<>();
        listOfBooks3.add(book5);
        result.put("Author2", listOfBooks3);

        List <Book> listOfBooks4 = new ArrayList<>();
        listOfBooks4.add(book6);
        result.put("Author20", listOfBooks4);

        //System.out.println(bookDatabase.getAuthorToBooksMap());

        //System.out.println("\n" + result);
        checkResult("testGetAuthorToBooksMap", compareTwoMaps(result, bookDatabase.getAuthorToBooksMap()));
    }

    void testGetAuthorsBookCount(){

        Book book1 = new Book("Author1", "Title1", "2009");
        Book book2 = new Book("Author1", "Title8", "2009");
        Book book3 = new Book("Author3", "Title45", "2007");
        Book book4 = new Book("Author3", "Title3", "2005");
        Book book5 = new Book("Author2", "Title4", "2009");
        Book book6 = new Book("Author20", "Title4", "2009");

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        bookDatabase.save(book5);
        bookDatabase.save(book6);

        Map<String, Integer> result = new HashMap<>();
        result.put("Author1", 2);
        result.put("Author3", 2);
        result.put("Author2", 1);
        result.put("Author20", 1);

        //System.out.println(bookDatabase.getEachAuthorBookCount());

        checkResult("testGetAuthorsBookCount", compareTwoMaps(result, bookDatabase.getEachAuthorBookCount()));
    }

    boolean compareTwoMaps(Map map1, Map map2 ){
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
