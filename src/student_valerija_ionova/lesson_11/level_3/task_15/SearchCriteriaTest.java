package student_valerija_ionova.lesson_11.level_3.task_15;


class SearchCriteriaTest {

        public static void main (String [] args){

            SearchCriteriaTest authorSearchCriteriaTest = new SearchCriteriaTest();

            authorSearchCriteriaTest.testAuthorMatchBookTrue();
            authorSearchCriteriaTest.testAuthorMatchBookFalse();
            authorSearchCriteriaTest.testTitleMatchBookTrue();
            authorSearchCriteriaTest.testTitleMatchBookFalse();


        }

    void checkResult (String name, boolean testPassed){
        if (testPassed){
            System.out.println(name + " OK");
        }else{
            System.out.println(name + " FAIL");
        }
    }

    void testAuthorMatchBookTrue(){

        Book book1 = new Book("Author1", "Title1");

        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Author1");
        checkResult("testAuthorMatchBookTrue", authorSearchCriteria.match(book1));
    }

    void testAuthorMatchBookFalse(){

        Book book1 = new Book("Author1", "Title1");

        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Author15");
        checkResult("testAuthorMatchBookFalse", !authorSearchCriteria.match(book1));
    }

    void testTitleMatchBookTrue(){

        Book book1 = new Book("Author1", "Title1");

        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Title1");
        checkResult("testTitleMatchBookTrue", titleSearchCriteria.match(book1));
    }

    void testTitleMatchBookFalse(){

        Book book1 = new Book("Author1", "Title1");

        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("NoTitle");
        checkResult("testTitleMatchBookFalse", !titleSearchCriteria.match(book1));
    }

}
