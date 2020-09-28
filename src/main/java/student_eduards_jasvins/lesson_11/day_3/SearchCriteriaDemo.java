package student_eduards_jasvins.lesson_11.day_3;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class SearchCriteriaDemo {

    public static void main(String[] args) {
        AuthorSearchCriteria author = new AuthorSearchCriteria("WellNeo");
        TitleSearchCriteria title = new TitleSearchCriteria("IONIC 2010");
        YearOfIssueSearchCriteria year = new YearOfIssueSearchCriteria("2032");

        SearchCriteria searchCriteria = new AndSearchCriteria(author, title);
        SearchCriteria searchCriteriatwo = new AndSearchCriteria(author, year);

        SearchCriteria searchCriteriathree = new OrSearchCriteria(author, year);
        SearchCriteria searchCriteriafour = new OrSearchCriteria(searchCriteriathree, title);
    }
}
