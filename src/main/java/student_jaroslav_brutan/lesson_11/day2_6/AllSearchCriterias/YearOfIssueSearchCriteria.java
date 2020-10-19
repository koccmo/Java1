package student_jaroslav_brutan.lesson_11.day2_6.AllSearchCriterias;

import student_jaroslav_brutan.lesson_11.day2_6.Book;
import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class YearOfIssueSearchCriteria implements SearchCriteria{

    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public boolean match(Book book){
        return book.getYearOfIssue().equals(yearOfIssueToSearch);
    }
}
