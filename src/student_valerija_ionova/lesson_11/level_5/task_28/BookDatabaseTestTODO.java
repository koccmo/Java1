package student_valerija_ionova.lesson_11.level_5.task_28;


import java.util.*;

class BookDatabaseTestTODO {

        public static void main (String [] args){

            BookDatabaseTestTODO authorSearchCriteriaTest = new BookDatabaseTestTODO();

            //authorSearchCriteriaTest.testGetAuthorToBooksMap();

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
        List <Book> listOfBooks = new ArrayList<>();
        listOfBooks.add(book1);
        listOfBooks.add(book2);
        result.put("Author1", listOfBooks);
        listOfBooks.clear();
        listOfBooks.add(book3);
        listOfBooks.add(book4);
        result.put("Author3", listOfBooks);
        listOfBooks.clear();
        listOfBooks.add(book2);
        result.put("Author2", listOfBooks);
        listOfBooks.clear();
        listOfBooks.add(book6);
        result.put("Author20", listOfBooks);

        //Как сравнить map не учитывая порядок??? :(
        //checkResult("testContainsBookFalse",);
    }

}
