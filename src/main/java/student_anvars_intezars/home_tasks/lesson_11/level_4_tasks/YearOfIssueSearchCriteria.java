package student_anvars_intezars.home_tasks.lesson_11.level_4_tasks;

class YearOfIssueSearchCriteria implements SearchCriteria {

    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    @Override
    public boolean match(Book book) {
        if (yearOfIssueToSearch.equals(book.getYearOfIssue())) {
            return true;
        }

        return false;
    }
}
