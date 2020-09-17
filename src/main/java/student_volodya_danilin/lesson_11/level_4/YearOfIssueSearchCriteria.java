package student_volodya_danilin.lesson_11.level_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class YearOfIssueSearchCriteria implements SearchCriteria {

    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public boolean match(Book book) {
        boolean result = false;
        if (book.getYearOfIssue().equals(this.yearOfIssueToSearch)) {
            result = true;
        }
        return result;
    }
}
