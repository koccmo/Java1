package student_jaroslav_brutan.lesson_11.day_3.all_tasks;

public class OrSearchCriteria implements SearchCriteria{

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public OrSearchCriteria(SearchCriteria leftCondition,
                            SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public boolean match(Book book) {
        if ((leftCondition.match(book)) || (rightCondition.match(book))) {
            return true;
        } return false;
    }
}
