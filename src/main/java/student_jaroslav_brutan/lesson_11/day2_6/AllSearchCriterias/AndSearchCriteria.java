package student_jaroslav_brutan.lesson_11.day2_6.AllSearchCriterias;

import student_jaroslav_brutan.lesson_11.day2_6.Book;
import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class AndSearchCriteria implements SearchCriteria{

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public AndSearchCriteria(SearchCriteria leftCondition,
                             SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public boolean match(Book book){
        if ((leftCondition.match(book)) && (rightCondition.match(book))){
            return true;
        } return false;
    }
}
