package student_valerija_ionova.lesson_11.level_6_approved.task_30_38;

//Task19 Создайте класс AndSearchCriteria:

public class AndSearchCriteria implements SearchCriteria {

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
