package roman.lesson_11.day_3.task_19;



public class AndSearchCriteriaTest {
    public static void main(String[] args) {
        AndSearchCriteriaTest test = new AndSearchCriteriaTest();
        test.positiveAndSearchCriteria();
        test.negativeAndSearchCriteria();
        test.oneCriteriaWrongAndSearchCriteria();
    }

    void positiveAndSearchCriteria() {
        AndSearchCriteria andSearchCriteria = new AndSearchCriteria(new TitleSearchCriteria("Garden"),
                new YearOfIssueSearchCriteria("2003"));
        Book garden = new Book("James", "Garden", "2003");
        checkResult(andSearchCriteria.match(garden), " Positive And search criteria");
    }

    void negativeAndSearchCriteria() {
        AndSearchCriteria andSearchCriteria = new AndSearchCriteria(new TitleSearchCriteria("Hope"),
                new YearOfIssueSearchCriteria("2004"));
        Book garden = new Book("James", "Garden", "2003");
        checkResult(!andSearchCriteria.match(garden), "Negative And search criteria");
    }

    void oneCriteriaWrongAndSearchCriteria() {
        AndSearchCriteria andSearchCriteria = new AndSearchCriteria(new TitleSearchCriteria("Garden"),
                new YearOfIssueSearchCriteria("2004"));
        Book garden = new Book("James", "Garden", "2003");
        checkResult(!andSearchCriteria.match(garden), "One of criteria wrong in And search criteria");
    }

    void checkResult(boolean condition, String nameOfTest) {
        if (condition) {
            System.out.println(nameOfTest + " Test = OK!");
        } else System.out.println(nameOfTest + " Test = Fail!");
    }
}
