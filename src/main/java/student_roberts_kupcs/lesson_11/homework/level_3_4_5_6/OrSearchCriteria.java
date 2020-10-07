package student_roberts_kupcs.lesson_11.homework.level_3_4_5_6;

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
        return leftCondition.match(book) || rightCondition.match(book);
    }
}
