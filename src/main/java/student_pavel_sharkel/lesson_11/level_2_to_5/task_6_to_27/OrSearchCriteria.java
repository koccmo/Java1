package student_pavel_sharkel.lesson_11.level_2_to_5.task_6_to_27;

class OrSearchCriteria implements SearchCriteria {

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public OrSearchCriteria(SearchCriteria leftCondition,
                            SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public boolean match(Book book) {
        // допишите реализацию метода
        // return true - если книга удовлетворяет левому или правому условию
        // иначе return false
        if (leftCondition.match(book) || rightCondition.match(book)) {
            return true;
        } else return false;
    }

}
