package student_igors_bartkevics.lesson_11.homework.level_3_junior.task_20;

class OrSearchCriteriaTest {

    public static void main(String[] args) {
        OrSearchCriteriaTest test = new OrSearchCriteriaTest();
        test.matchPositiveBothConditionsMatchTest();
        test.matchPositiveLeftConditionMatchesRightConditionDoesNotMatchTest();
        test.matchPositiveLeftConditionDoesNotMatchRightConditionMatchesTest();
        test.matchNegativeBothConditionsDoNotMatchTest();
    }

    void matchPositiveBothConditionsMatchTest() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Martin R.");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Clean Code - A Handbook of Agile Software Craftsmanship");
        SearchCriteria andSearchCriteria = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        Book book = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        boolean condition = andSearchCriteria.match(book);
        checkResult(condition, "Match positive both condition matches");
    }

    void matchPositiveLeftConditionMatchesRightConditionDoesNotMatchTest() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Martin R.");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Clean Code - A Handbook of Agile Software Craftsmanship");
        SearchCriteria orSearchCriteria = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        Book book = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship rev 2");
        boolean condition = orSearchCriteria.match(book);
        checkResult(condition, "Match positive left condition matches right condition doesn't match");
    }

    void matchPositiveLeftConditionDoesNotMatchRightConditionMatchesTest() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Martin R.");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Clean Code - A Handbook of Agile Software Craftsmanship");
        SearchCriteria orSearchCriteria = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        Book book = new Book("Martin K.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        boolean condition = orSearchCriteria.match(book);
        checkResult(condition, "Match positive left condition doesn't match right condition matches");
    }

    void matchNegativeBothConditionsDoNotMatchTest() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Martin R.");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Clean Code - A Handbook of Agile Software Craftsmanship");
        SearchCriteria orSearchCriteria = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        Book book = new Book("Martin K.", "Clean Code - A Handbook of Agile Software Craftsmanship rev 2");
        boolean condition = !orSearchCriteria.match(book);
        checkResult(condition, "Match negative both conditions do not match");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }

}

