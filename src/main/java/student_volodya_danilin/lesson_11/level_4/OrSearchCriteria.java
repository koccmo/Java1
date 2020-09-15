package student_volodya_danilin.lesson_11.level_4;

class OrSearchCriteria implements SearchCriteria {

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public OrSearchCriteria(SearchCriteria leftCondition,
                            SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public boolean match(Book book) {
        boolean result = false;
        if (leftCondition.match(book)
        || rightCondition.match(book)) {
            result = true;
        }
        return result;
    }

}
