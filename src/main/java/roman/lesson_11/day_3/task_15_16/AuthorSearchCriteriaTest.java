package roman.lesson_11.day_3.task_15_16;

public class AuthorSearchCriteriaTest {
    public static void main(String[] args) {
        AuthorSearchCriteriaTest test = new AuthorSearchCriteriaTest();
        test.authorSearchCriteria();
    }

    void authorSearchCriteria() {
        AuthorSearchCriteria author = new AuthorSearchCriteria("James");
        Book garden = new Book("James", "Garden");
        checkResult(author.match(garden), "Author search criteria");
    }

    void checkResult(boolean condition, String nameOfTest) {
        if (condition) {
            System.out.println(nameOfTest + " Test = OK!");
        } else System.out.println(nameOfTest + " Test = Fail!");
    }
}
