package student_eduards_jasvins.lesson_11.day_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class AndSearchCriteria implements SearchCriteria {

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
