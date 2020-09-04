package student_valerija_ionova.lesson_11.level_4.task_23_27;


import java.util.*;

class BookDatabaseTest {

        public static void main (String [] args){

            BookDatabaseTest authorSearchCriteriaTest = new BookDatabaseTest();

            authorSearchCriteriaTest.testFindUniqueAuthors();
            authorSearchCriteriaTest.testFindUniqueTitles();

            authorSearchCriteriaTest.testFindUniqueBooks();
            authorSearchCriteriaTest.testFindUniqueBooksNotAll();

            authorSearchCriteriaTest.testContainsBookTrue();
            authorSearchCriteriaTest.testContainsBookFalse();

        }

    void checkResult (String name, boolean testPassed){
        if (testPassed){
            System.out.println(name + " OK");
        }else{
            System.out.println(name + " FAIL");
        }
    }

    void testFindUniqueAuthors(){

        Book book1 = new Book("Author1", "Title1", "2009");
        Book book2 = new Book("Author1", "Title2", "2001");
        Book book3 = new Book("Author3", "Title3", "2007");
        Book book4 = new Book("Author1", "Title4", "2009");

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);

        Set<String> setForCheck = new HashSet<>();
        setForCheck.add(book1.getAuthor());
        setForCheck.add(book3.getAuthor());

        checkResult("testFindSearchCriteriaAnd", Objects.equals(bookDatabase.findUniqueAuthors(), setForCheck));
    }

    void testFindUniqueTitles(){

        Book book1 = new Book("Author1", "Title1", "2009");
        Book book2 = new Book("Author1", "Title2", "2001");
        Book book3 = new Book("Author3", "Title3", "2007");
        Book book4 = new Book("Author1", "Title4", "2009");

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);

        Set<String> setForCheck = new HashSet<>();
        setForCheck.add(book1.getTitle());
        setForCheck.add(book2.getTitle());
        setForCheck.add(book3.getTitle());
        setForCheck.add(book4.getTitle());

        checkResult("testFindUniqueTitles", Objects.equals(bookDatabase.findUniqueTitles(), setForCheck));
    }

    void testFindUniqueBooks(){

        Book book1 = new Book("Author1", "Title1", "2009");
        Book book2 = new Book("Author1", "Title2", "2001");
        Book book3 = new Book("Author3", "Title3", "2007");
        Book book4 = new Book("Author1", "Title4", "2009");

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);

        Set<Book> setForCheck = new HashSet<>();
        setForCheck.add(book1);
        setForCheck.add(book2);
        setForCheck.add(book3);
        setForCheck.add(book4);

        checkResult("testFindUniqueBooks", Objects.equals(bookDatabase.findUniqueBooks(), setForCheck));
    }

    void testFindUniqueBooksNotAll(){

        Book book1 = new Book("Author1", "Title1", "2009");
        Book book2 = new Book("Author1", "Title1", "2009");
        Book book3 = new Book("Author3", "Title3", "2007");
        Book book4 = new Book("Author1", "Title4", "2009");

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);

        Set<Book> setForCheck = new HashSet<>();
        setForCheck.add(book1);
        setForCheck.add(book3);
        setForCheck.add(book4);

        checkResult("testFindUniqueBooksNotAll", Objects.equals(bookDatabase.findUniqueBooks(), setForCheck));
    }

    void testContainsBookTrue(){

        Book book1 = new Book("Author1", "Title1", "2009");
        Book book2 = new Book("Author1", "Title8", "2009");
        Book book3 = new Book("Author3", "Title3", "2007");
        Book book4 = new Book("Author1", "Title4", "2009");

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);

        Book newBook3 = new Book("Author3", "Title3", "2007");

        checkResult("testContainsBookTrue", bookDatabase.contains(newBook3));
    }

    void testContainsBookFalse(){

        Book book1 = new Book("Author1", "Title1", "2009");
        Book book2 = new Book("Author1", "Title8", "2009");
        Book book3 = new Book("Author3", "Title3", "2007");
        Book book4 = new Book("Author1", "Title4", "2009");

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);

        Book newBook3 = new Book("Author45", "Title3", "2007");

        checkResult("testContainsBookFalse", !bookDatabase.contains(newBook3));
    }

}
