package student_jaroslav_brutan.lesson_11.day_3.all_tasks;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class SearchCriteriaDemo {

    public static void main(String[] args) {

        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria yearOfIssueCriteria = new YearOfIssueSearchCriteria("1890");

        SearchCriteria searchCriteria1 = new AndSearchCriteria(authorSearchCriteria,titleSearchCriteria);
        SearchCriteria searchCriteria2 = new AndSearchCriteria(authorSearchCriteria,yearOfIssueCriteria);
        SearchCriteria searchCriteria3 = new OrSearchCriteria(authorSearchCriteria,titleSearchCriteria);
        SearchCriteria searchCriteria4 = new OrSearchCriteria(authorSearchCriteria,yearOfIssueCriteria);
    }
}
