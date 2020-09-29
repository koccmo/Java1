package student_jaroslav_brutan.lesson_11.day_3.all_tasks;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class YearOfIssueSearchCriteria implements SearchCriteria{

    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public boolean match(Book book){
        if (book.getYearOfIssue().equals(yearOfIssueToSearch)){
            return true;
        } return false;
    }
}
