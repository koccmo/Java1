package roman.lesson_11.day_3.task_19;

public class AndSearchCriteria implements SearchCriteria{

    public static void main(String[] args) {
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Garden");
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("2000");
        AndSearchCriteria searchCriteria = new AndSearchCriteria(yearOfIssueSearchCriteria, titleSearchCriteria);
    }

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public AndSearchCriteria(SearchCriteria leftCondition,
                             SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    @Override
    public boolean match(Book book) {
        return leftCondition.match(book) && rightCondition.match(book);
    }
}
