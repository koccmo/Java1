package student_igors_bartkevics.lesson_11.homework.level_3_junior.task_17;

class TitleSearchCriteriaTest {

    public static void main(String[] args) {
        TitleSearchCriteriaTest test = new TitleSearchCriteriaTest();
        test.matchPositiveTest();
        test.matchNegativeTest();
    }

    void matchPositiveTest() {
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Clean Code - A Handbook of Agile Software Craftsmanship");
        Book book = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        boolean condition = titleSearchCriteria.match(book);
        checkResult(condition, "Match positive");
    }

    void matchNegativeTest() {
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Clean Code - A Handbook of Agile Software Craftsmanship");
        Book book = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship rev 3");
        boolean condition = !titleSearchCriteria.match(book);
        checkResult(condition, "Match negative");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }

}
