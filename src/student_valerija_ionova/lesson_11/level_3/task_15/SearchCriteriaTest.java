package student_valerija_ionova.lesson_11.level_3.task_15;


import java.util.ArrayList;
import java.util.List;

class SearchCriteriaTest {

        public static void main (String [] args){

            SearchCriteriaTest authorSearchCriteriaTest = new SearchCriteriaTest();

            authorSearchCriteriaTest.testAuthorMatchBookTrue();
            authorSearchCriteriaTest.testAuthorMatchBookFalse();
            authorSearchCriteriaTest.testTitleMatchBookTrue();
            authorSearchCriteriaTest.testTitleMatchBookFalse();
            authorSearchCriteriaTest.testYearMatchBookTrue();
            authorSearchCriteriaTest.testYearMatchBookFalse();

            authorSearchCriteriaTest.testAndSearchCriteriaTrue();
            authorSearchCriteriaTest.testAndSearchCriteriaFalse();

            authorSearchCriteriaTest.testOrSearchCriteriaTrue();
            authorSearchCriteriaTest.testOrSearchCriteriaFalse();

            authorSearchCriteriaTest.testFindSearchCriteriaOr();
            authorSearchCriteriaTest.testFindSearchCriteriaAnd();

        }

    void checkResult (String name, boolean testPassed){
        if (testPassed){
            System.out.println(name + " OK");
        }else{
            System.out.println(name + " FAIL");
        }
    }

    void testAuthorMatchBookTrue(){

        Book book1 = new Book("Author1", "Title1", "2000");

        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Author1");
        checkResult("testAuthorMatchBookTrue", authorSearchCriteria.match(book1));
    }

    void testAuthorMatchBookFalse(){

        Book book1 = new Book("Author1", "Title1", "2000");

        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Author15");
        checkResult("testAuthorMatchBookFalse", !authorSearchCriteria.match(book1));
    }

    void testTitleMatchBookTrue(){

        Book book1 = new Book("Author1", "Title1", "2000");

        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Title1");
        checkResult("testTitleMatchBookTrue", titleSearchCriteria.match(book1));
    }

    void testTitleMatchBookFalse(){

        Book book1 = new Book("Author1", "Title1", "2000");

        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("NoTitle");
        checkResult("testTitleMatchBookFalse", !titleSearchCriteria.match(book1));
    }

    void testYearMatchBookTrue(){

        Book book1 = new Book("Author1", "Title1", "2000");

        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("2000");
        checkResult("testYearMatchBookTrue", yearOfIssueSearchCriteria.match(book1));
    }

    void testYearMatchBookFalse(){

        Book book1 = new Book("Author1", "Title1", "2000");

        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("2008");
        checkResult("testYearMatchBookFalse", !yearOfIssueSearchCriteria.match(book1));
    }

    void testAndSearchCriteriaTrue(){

        Book book1 = new Book("Author1", "Title1", "2000");

        SearchCriteria searchCriteria1 = new TitleSearchCriteria("Title1");
        SearchCriteria searchCriteria2 = new AuthorSearchCriteria("Author1");

        AndSearchCriteria andSearchCriteria =
                new AndSearchCriteria(searchCriteria1, searchCriteria2);
        checkResult("testAndSearchCriteriaTrue", andSearchCriteria.match(book1));
    }

    void testAndSearchCriteriaFalse(){

        Book book1 = new Book("Author1", "Title1", "2000");

        SearchCriteria searchCriteria1 = new TitleSearchCriteria("Title1");
        SearchCriteria searchCriteria2 = new YearOfIssueSearchCriteria("1589");

        AndSearchCriteria andSearchCriteria =
                new AndSearchCriteria(searchCriteria1, searchCriteria2);
        checkResult("testAndSearchCriteriaTrue", !andSearchCriteria.match(book1));
    }

    void testOrSearchCriteriaTrue(){

        Book book1 = new Book("Author1", "Title1", "2000");

        SearchCriteria searchCriteria1 = new TitleSearchCriteria("Title1");
        SearchCriteria searchCriteria2 = new AuthorSearchCriteria("Author17");

       OrSearchCriteria orSearchCriteria = new OrSearchCriteria(searchCriteria1, searchCriteria2);
        checkResult("testOrSearchCriteriaTrue", orSearchCriteria.match(book1));
    }

    void testOrSearchCriteriaFalse(){

        Book book1 = new Book("Author1", "Title1", "2000");

        SearchCriteria searchCriteria1 = new TitleSearchCriteria("Title12");
        SearchCriteria searchCriteria2 = new YearOfIssueSearchCriteria("1589");

        OrSearchCriteria orSearchCriteria = new OrSearchCriteria(searchCriteria1, searchCriteria2);
        checkResult("testOrSearchCriteriaFalse", !orSearchCriteria.match(book1));
    }

    void testFindSearchCriteriaOr(){
        Book book1 = new Book ("Author1", "Title1", "2009");
        Book book2 = new Book ("Author2", "Title2", "2001");
        Book book3 = new Book ("Author3", "Title3", "2007");
        Book book4 = new Book ("Author2", "Title4", "2008");

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);


        List <Book> listForCheck = new ArrayList<>();
        listForCheck.add(book1);
        listForCheck.add(book2);
        listForCheck.add(book4);

        SearchCriteria searchCriteria1 = new TitleSearchCriteria("Title1");
        SearchCriteria searchCriteria2 = new AuthorSearchCriteria("Author2");

        OrSearchCriteria orSearchCriteria = new OrSearchCriteria(searchCriteria1, searchCriteria2);

        checkResult("testFindSearchCriteriaOr", bookDatabase.find(orSearchCriteria).equals(listForCheck));
    }

    void testFindSearchCriteriaAnd(){

        Book book1 = new Book ("Author1", "Title1", "2009");
        Book book2 = new Book ("Author1", "Title2", "2001");
        Book book3 = new Book ("Author3", "Title3", "2007");
        Book book4 = new Book ("Author1", "Title4", "2009");

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);

        List <Book> listForCheck = new ArrayList<>();
        listForCheck.add(book1);
        listForCheck.add(book4);

        SearchCriteria searchCriteria1 = new AuthorSearchCriteria("Author1");
        SearchCriteria searchCriteria2 = new YearOfIssueSearchCriteria("2009");

        AndSearchCriteria andSearchCriteria = new AndSearchCriteria(searchCriteria1, searchCriteria2);

        checkResult("testFindSearchCriteriaAnd", bookDatabase.find(andSearchCriteria).equals(listForCheck));
    }

}
