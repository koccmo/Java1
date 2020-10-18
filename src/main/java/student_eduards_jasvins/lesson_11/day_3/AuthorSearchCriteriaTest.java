package student_eduards_jasvins.lesson_11.day_3;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "May be this class must have name SearchCriteriaTest?")
class AuthorSearchCriteriaTest {

    public static void main(String[] args) {
        AuthorSearchCriteriaTest test = new AuthorSearchCriteriaTest();
        test.matchAuthorSearch();
        test.matchTitleSearch();
        test.matchYearOfIssueSearch();
        test.matchAndSearchCriteria();
        test.matchOrSearchCriteria();
    }

    void checkResult (String name, boolean condition) {
        if (condition) {
            System.out.println(name + " = OK.");
        } else {
            System.out.println(name + " = FAIL.");
        }
    }

    void matchAuthorSearch() {
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Eduards J.");
        Book book = new Book("Eduards J.", "My World!", "2020");

        boolean condition = authorSearchCriteria.match(book);
        checkResult("Match author search Test ", condition);
    }

    void matchTitleSearch() {
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("My World!");
        Book book = new Book("Eduards J.", "My World!", "2020");

        boolean condition = titleSearchCriteria.match(book);
        checkResult("Match title search Test ", condition);
    }

    void matchYearOfIssueSearch() {
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("2020");
        Book book = new Book("Eduards J.", "My World", "2020");

        boolean condition = yearOfIssueSearchCriteria.match(book);
        checkResult("Match year of issue Test ", condition);
    }

    void matchAndSearchCriteria() {
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Eduards. J.");
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("My World!");
        AndSearchCriteria andSearchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        Book books = new Book("Eduards. J.", "My World!");

        boolean condition = andSearchCriteria.match(books);
        checkResult("Match and search criteria Test ", condition);
    }

    void matchOrSearchCriteria() {
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Eduards J.");
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("This World is Mine!");
        OrSearchCriteria orSearchCriteria = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        Book book = new Book("Eduards J.", "My world!");

        boolean condition = orSearchCriteria.match(book);
        checkResult("Match or search criteria Test = ", condition);

    }
}
