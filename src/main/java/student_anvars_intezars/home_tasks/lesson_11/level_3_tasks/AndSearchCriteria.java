package student_anvars_intezars.home_tasks.lesson_11.level_3_tasks;

class AndSearchCriteria implements SearchCriteria{


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