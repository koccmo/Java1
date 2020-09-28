package student_valerija_ionova.lesson_11.level_4_approved.task_23_26;

//Task19 Создайте класс AndSearchCriteria:

class AndSearchCriteria implements SearchCriteria {

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public AndSearchCriteria(SearchCriteria leftCondition,
                             SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public boolean match(Book book) {
        return leftCondition.match(book) && rightCondition.match(book);
    }

}
