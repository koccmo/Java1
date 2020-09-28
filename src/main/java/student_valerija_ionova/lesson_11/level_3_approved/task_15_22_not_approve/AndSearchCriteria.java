package student_valerija_ionova.lesson_11.level_3_approved.task_15_22_not_approve;

//Task19 Создайте класс AndSearchCriteria:

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

    public boolean match(Book book) {
        return (leftCondition.match(book) && rightCondition.match(book));
    }

}
