package student_igors_bartkevics.lesson_11.homework.level_3.task_16;

class AuthorSearchCriteriaTest {

    public static void main(String[] args) {
        AuthorSearchCriteriaTest test = new AuthorSearchCriteriaTest();
        test.matchPositiveTest();
        test.matchNegativeTest();
    }

    void matchPositiveTest() {
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Martin R.");
        Book book = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship rev 3");
        boolean condition = authorSearchCriteria.match(book);
        checkResult(condition, "Match positive");
    }

    void matchNegativeTest() {
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Dostoevsky");
        Book book = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship rev 3");
        boolean condition = !authorSearchCriteria.match(book);
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
