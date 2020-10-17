package student_jaroslav_brutan.lesson_11.day2_6.AllSearchCriterias;

public class SearchCriteriaDemo {

    public static void main(String[] args) {

        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1890");

        SearchCriteria searchCriteria1 = new AndSearchCriteria(authorSearchCriteria,titleSearchCriteria);
        SearchCriteria searchCriteria2 = new AndSearchCriteria(authorSearchCriteria,yearOfIssueSearchCriteria);
        SearchCriteria searchCriteria3 = new OrSearchCriteria(authorSearchCriteria,titleSearchCriteria);
        SearchCriteria searchCriteria4 = new OrSearchCriteria(authorSearchCriteria,yearOfIssueSearchCriteria);
    }
}
