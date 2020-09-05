package student_igors_bartkevics.lesson_11.homework.level_3.task_19;

class AndSearchCriteriaTest {

    public static void main(String[] args) {
        AndSearchCriteriaTest test = new AndSearchCriteriaTest();
        test.matchPositiveTest();
        test.matchNegativeLeftCriteriaFaultTest();
        test.matchNegativeRightCriteriaFaultTest();
        test.matchNegativeBothCriteriaFaultTest();
    }

    void matchPositiveTest() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Martin R.");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Clean Code - A Handbook of Agile Software Craftsmanship");
        SearchCriteria andSearchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        Book book = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        boolean condition = andSearchCriteria.match(book);
        checkResult(condition, "Match positive");
    }

    void matchNegativeLeftCriteriaFaultTest() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Martin R.");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Clean Code - A Handbook of Agile Software Craftsmanship");
        SearchCriteria andSearchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        Book book = new Book("Martin K.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        boolean condition = !andSearchCriteria.match(book);
        checkResult(condition, "Match negative left criteria fault");
    }

    void matchNegativeRightCriteriaFaultTest() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Martin R.");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Clean Code - A Handbook of Agile Software Craftsmanship");
        SearchCriteria andSearchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        Book book = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship rev 2");
        boolean condition = !andSearchCriteria.match(book);
        checkResult(condition, "Match negative right criteria fault");
    }

    void matchNegativeBothCriteriaFaultTest() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Martin R.");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Clean Code - A Handbook of Agile Software Craftsmanship");
        SearchCriteria andSearchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        Book book = new Book("Martin K.", "Clean Code - A Handbook of Agile Software Craftsmanship rev 2");
        boolean condition = !andSearchCriteria.match(book);
        checkResult(condition, "Match negative both criteria fault");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }

}

