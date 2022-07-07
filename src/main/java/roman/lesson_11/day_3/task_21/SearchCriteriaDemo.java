package roman.lesson_11.day_3.task_21;

public class SearchCriteriaDemo {
    public static void main(String[] args) {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("James");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Garden");
        SearchCriteria yearIssueSearchCriteria = new YearOfIssueSearchCriteria("2000");

        SearchCriteria andAuthorTitleCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        SearchCriteria andAuthorYearCriteria = new AndSearchCriteria(authorSearchCriteria, yearIssueSearchCriteria);
        SearchCriteria andTitleYearCriteria = new AndSearchCriteria(titleSearchCriteria, yearIssueSearchCriteria);

        SearchCriteria orAuthorTitle = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        SearchCriteria orAuthorYear = new OrSearchCriteria(authorSearchCriteria, yearIssueSearchCriteria);
        SearchCriteria orTitleYear = new OrSearchCriteria(titleSearchCriteria, yearIssueSearchCriteria);

        SearchCriteria andPlusOrCriteria = new OrSearchCriteria(andAuthorTitleCriteria, yearIssueSearchCriteria);
    }
}
