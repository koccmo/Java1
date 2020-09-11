package student_valerija_ionova.lesson_11.level_x.super_task_1;

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
        if (leftCondition.match(book) && rightCondition.match(book)){
            return true;
        }else{
            return false;
        }
    }

}
