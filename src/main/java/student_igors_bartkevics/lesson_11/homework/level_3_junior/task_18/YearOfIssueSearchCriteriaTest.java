package student_igors_bartkevics.lesson_11.homework.level_3_junior.task_18;

class YearOfIssueSearchCriteriaTest {

    public static void main(String[] args) {
        YearOfIssueSearchCriteriaTest test = new YearOfIssueSearchCriteriaTest();
        test.matchPositiveTest();
        test.matchNegativeTest();
    }

    void matchPositiveTest() {
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("2003");
        Book book = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship", "2003");
        boolean condition = yearOfIssueSearchCriteria.match(book);
        checkResult(condition, "Match positive");
    }

    void matchNegativeTest() {
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("2002");
        Book book = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship", "2003");
        boolean condition = !yearOfIssueSearchCriteria.match(book);
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
