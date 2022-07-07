package roman.lesson_11.day_3.task_18;


public class YearOfIssueSearchCriteriaTest {
    public static void main(String[] args) {
        YearOfIssueSearchCriteriaTest test = new YearOfIssueSearchCriteriaTest();
        test.positiveYearOfIssueSearchCriteria();
        test.negativeYearOfIssueSearchCriteria();
    }

    void positiveYearOfIssueSearchCriteria() {
        YearOfIssueSearchCriteria yearOfIssue = new YearOfIssueSearchCriteria("1990");
        Book garden = new Book("James", "Garden", "1990");
        checkResult(yearOfIssue.match(garden), "Positive Year of Issue search criteria");
    }
    void negativeYearOfIssueSearchCriteria() {
        YearOfIssueSearchCriteria yearOfIssue = new YearOfIssueSearchCriteria("1991");
        Book garden = new Book("James", "Garden", "1990");
        checkResult(!yearOfIssue.match(garden), "Negative Year of Issue search criteria");
    }

    void checkResult(boolean condition, String nameOfTest) {
        if (condition) {
            System.out.println(nameOfTest + " Test = OK!");
        } else System.out.println(nameOfTest + " Test = Fail!");
    }
}
