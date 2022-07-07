package roman.lesson_11.day_3.task_20;



public class OrSearchCriteriaTest {
    public static void main(String[] args) {
        OrSearchCriteriaTest test = new OrSearchCriteriaTest();
        test.positiveTwoOrSearchCriteria();
        test.oneCriteriaWrongAndSearchCriteria();
        test.twoCriteriaWrongOrSearchCriteria();

    }


    void positiveTwoOrSearchCriteria() {
        OrSearchCriteria orSearchCriteria = new OrSearchCriteria(new TitleSearchCriteria("Garden"),
                new YearOfIssueSearchCriteria("2003"));
        Book garden = new Book("James", "Garden", "2003");
        checkResult(orSearchCriteria.match(garden), "Negative OR search criteria");
    }

    void oneCriteriaWrongAndSearchCriteria() {
        OrSearchCriteria orSearchCriteria = new OrSearchCriteria(new TitleSearchCriteria("Garden"),
                new YearOfIssueSearchCriteria("2000"));
        Book garden = new Book("James", "Garden", "2003");
        checkResult(orSearchCriteria.match(garden), "One of criteria wrong in Or search criteria");
    }

    void twoCriteriaWrongOrSearchCriteria() {
        OrSearchCriteria orSearchCriteria = new OrSearchCriteria(new TitleSearchCriteria("Hope"),
                new YearOfIssueSearchCriteria("2000"));
        Book garden = new Book("James", "Garden", "2003");
        checkResult(!orSearchCriteria.match(garden), "Two of criteria wrong in Or search criteria");
    }

    void checkResult(boolean condition, String nameOfTest) {
        if (condition) {
            System.out.println(nameOfTest + " Test = OK!");
        } else System.out.println(nameOfTest + " Test = Fail!");
    }
}
