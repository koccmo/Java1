package student_igors_bartkevics.lesson_11.homework.level_3_junior.task_19;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class AndSearchCriteriaTest {

    public static void main(String[] args) {
        AndSearchCriteriaTest test = new AndSearchCriteriaTest();
        test.matchPositiveBothConditionsMatchTest();
        test.matchNegativeLeftConditionDoesNotMatchRightConditionMatchTest();
        test.matchNegativeLeftConditionMatchesRightConditionDoesNotMatchTest();
        test.matchNegativeBothConditionsDoNotMatchTest();
    }

    void matchPositiveBothConditionsMatchTest() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Martin R.");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Clean Code - A Handbook of Agile Software Craftsmanship");
        SearchCriteria andSearchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        Book book = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        boolean condition = andSearchCriteria.match(book);
        checkResult(condition, "Match positive, both conditions match");
    }

    void matchNegativeLeftConditionDoesNotMatchRightConditionMatchTest() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Martin R.");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Clean Code - A Handbook of Agile Software Craftsmanship");
        SearchCriteria andSearchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        Book book = new Book("Martin K.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        boolean condition = !andSearchCriteria.match(book);
        checkResult(condition, "Match negative, left condition does not match right condition matches");
    }

    void matchNegativeLeftConditionMatchesRightConditionDoesNotMatchTest() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Martin R.");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Clean Code - A Handbook of Agile Software Craftsmanship");
        SearchCriteria andSearchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        Book book = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship rev 2");
        boolean condition = !andSearchCriteria.match(book);
        checkResult(condition, "Match negative, left condition matches right condition does not match");
    }

    void matchNegativeBothConditionsDoNotMatchTest() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Martin R.");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Clean Code - A Handbook of Agile Software Craftsmanship");
        SearchCriteria andSearchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        Book book = new Book("Martin K.", "Clean Code - A Handbook of Agile Software Craftsmanship rev 2");
        boolean condition = !andSearchCriteria.match(book);
        checkResult(condition, "Match negative, both conditions do not match");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }

}

