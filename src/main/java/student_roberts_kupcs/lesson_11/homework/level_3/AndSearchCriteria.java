package student_roberts_kupcs.lesson_11.homework.level_3;

class AndSearchCriteria implements SearchCriteria {
    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public AndSearchCriteria(SearchCriteria leftCondition,
                             SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public boolean match(Book book) {
        // допишите реализацию метода
        // return true - если книга удовлетворяет и левому и правому условию
        // иначе return false
        return leftCondition.match(book) && rightCondition.match(book);
    }
}
