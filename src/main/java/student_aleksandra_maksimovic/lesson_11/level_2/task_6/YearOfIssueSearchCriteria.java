package student_aleksandra_maksimovic.lesson_11.level_2.task_6;

class YearOfIssueSearchCriteria implements SearchCriteria {

    private int yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(int yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public boolean match(Book book) {
        return book.getYearOfIssue() == this.yearOfIssueToSearch;
    }

}
