package student_valerija_ionova.lesson_11.level_3.task_15;


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

}
