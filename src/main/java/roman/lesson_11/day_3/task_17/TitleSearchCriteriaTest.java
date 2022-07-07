package roman.lesson_11.day_3.task_17;

import roman.lesson_11.day_3.task_15_16.AuthorSearchCriteria;

public class TitleSearchCriteriaTest {
    public static void main(String[] args) {
        TitleSearchCriteriaTest test = new TitleSearchCriteriaTest();
        test.titleSearchCriteria();
    }


    void titleSearchCriteria() {
        TitleSearchCriteria title = new TitleSearchCriteria("Garden");
        Book garden = new Book("James", "Garden");
        checkResult(title.match(garden), "Title search criteria");
    }

    void checkResult(boolean condition, String nameOfTest) {
        if (condition) {
            System.out.println(nameOfTest + " Test = OK!");
        } else System.out.println(nameOfTest + " Test = Fail!");
    }
}
